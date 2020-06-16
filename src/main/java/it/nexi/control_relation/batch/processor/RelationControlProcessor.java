
package it.nexi.control_relation.batch.processor;
import io.swagger.client.model.*;
import it.nexi.control_relation.batch.tableEntity.SecondMappingEntity;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import it.nexi.control_relation.batch.csv.impl.AMLCSVWriter;
import it.nexi.control_relation.batch.dao.queryProcess.*;
import it.nexi.control_relation.batch.dao.queryProcess.RequestResponseExecutor;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 *
 * Rappresenta la classe di lavoro dell'intero processo di acquisizione e aggiornamento tabelle NEXI
 */
public class RelationControlProcessor implements BatchProcessor {
    
	private static RelationControlProcessor	instance = null;

	final Logger logger = Logger.getLogger(RelationControlProcessor.class);
	private List<TableEntityTite> recoveryTiteResult; //lista dove verranno inseriti i record estratti da Tite non ancora elaborati
	private List<String> firstMappingResults; //lista dei record di Tite da inviare a Crif
    private List<SecondMappingEntity> secondMappingResults; //lista seconda query, per andare a riempire la tabella CRIF
    private Map<TableEntityTite, GetCompanyReliabilityReportResponse> mapEntityResponse;
    private Map<TableEntityTite, GetCompanyReliabilityReportResponse> mapEntityResponseInReport;
    private Properties properties;

    public static RelationControlProcessor getInstance() {
		return null != instance ? instance : new RelationControlProcessor();

	}

	private Path firstMappingResultCSV; // file dove verranno carii record da inserire in Tite
    private Path recoveryResultCSV; // file dove verranno inserire le risposte di crif

    private void selectFromTite(){
        SelectFromTite selectFromTite = new SelectFromTite();
        recoveryTiteResult = selectFromTite.run(properties);
    }

    private void firstMapping(){
        logger.info("Avvio procedura FirsMapping");
        FirstMapping firstMappingProcess = new FirstMapping();//first mapping
        firstMappingResults = firstMappingProcess.run(properties);
    }

    private void writeCsv(List<String> list, Path file){
        logger.info("Creazione csv locale: ---> "+ file.toString());
        AMLCSVWriter csvW = new AMLCSVWriter(file);
        try {
            csvW.write(list);
            logger.info("scritttura avvenuta correttamente");
        }catch (IOException io){
            logger.info(io);
        }
    }


    private void updateTite(){
        logger.info("Aggiornamento tabella TBSI_NPF_ACQ_NO_REL_SOC_TITE database SION ");
        UpdateTiteTable updateTiteProcess = new UpdateTiteTable();//update TITE table
        updateTiteProcess.run(properties);
    }

    private void sendToCrif(){
        logger.info("Collegamento con interfaccia swagger Rest Crif");
        RequestResponseExecutor requestResponseExecutor = new RequestResponseExecutor(recoveryTiteResult);
        requestResponseExecutor.run();
        mapEntityResponse = requestResponseExecutor.getMapRequestResponse();
    }

    private void updateReportAndCrif(){
        logger.info("Update Tabella Report e Crif");
        UpdateReport_CrifTable updateReportCrifTable = new UpdateReport_CrifTable();
        updateReportCrifTable.run(mapEntityResponse, properties);
        mapEntityResponseInReport = updateReportCrifTable.getMapInReport(); //lista delle TITE a cui ho dato una risposta
    }
    private void secondMapping(){
        logger.info("Avvio procedura SecondMapping");
        SecondMapping secondMappingProcess = new SecondMapping();
        secondMappingResults = secondMappingProcess.run(properties);
    }

    @Override
    public void process(Properties properties) throws IOException {
        logger.info("Batch process Attivato");
        firstMappingResultCSV = Paths.get(properties.getProperty("path.outputFirstMappingResult"));
        recoveryResultCSV = Paths.get(properties.getProperty("path.outputRecoveryResult"));
        this.properties = properties;
        selectFromTite();
        List<String> rtrListString = new ArrayList<>();
        for(int i = 0;i<recoveryTiteResult.size();i++){
            rtrListString.add(recoveryTiteResult.get(i).entityToString());
        }
        if (recoveryTiteResult.isEmpty()) {
            firstMapping();
            if(firstMappingResults.isEmpty()){
                logger.info("Nessun Update in Tite da fare, chiusura programma di batch");
                System.exit(-1);
            }
            writeCsv(firstMappingResults, firstMappingResultCSV);
            System.exit(-1);//se la lista di company da mandare a crif è vuota aggiorno comunque la tabella tite così la prossima volta ho sicuramente qualcosa
        }
        writeCsv(rtrListString, recoveryResultCSV);
        firstMapping();
        if (firstMappingResults.isEmpty()) {
            logger.info("Nessun inserimento da fare nella tabella TBSI_TITE");
        } else {
            writeCsv(firstMappingResults, firstMappingResultCSV);
            updateTite();
        }
        sendToCrif();
        /*updateReportAndCrif();
        if (mapEntityResponseInReport.isEmpty()) {
            logger.info("non serve fare il second Mapping");
            System.exit(-1);
        }else {
            secondMapping();
        }*/
    }

    public Map<TableEntityTite, GetCompanyReliabilityReportResponse> getMap(){
        return mapEntityResponse;
    }
}


//INVIO A CRIF
       /* GetCompanyReliabilityReportRequest gtr = new GetCompanyReliabilityReportRequest();
        CompanyBasicData com = new CompanyBasicData();
        com.setFiscalCode("01152930861");
        Address address = new Address();
        address.setProvince("EN");
        List<Address> listaddr = new ArrayList<>();
        listaddr.add(address);
        gtr.setAddresses(listaddr);
        gtr.setReportTypeCode("FComCard");
        gtr.setCompanyData(com);
        System.out.println(gtr.toString());*/
