package it.nexi.control_relation.batch.dao.queryProcess;

import io.swagger.client.model.*;
import it.nexi.control_relation.batch.dao.DbConnection;
import it.nexi.control_relation.batch.dao.DbQueryObject;
import it.nexi.control_relation.batch.dao.DbSendQuery;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

/**Classe che si occupa della creazione e dell'invio della query per quanto riguarda l'update della tabella di report
 *
 */
public class UpdateReport_CrifTable extends Thread {

    final static Logger logger = Logger.getLogger(UpdateReport_CrifTable.class);
    private Map<TableEntityTite, GetCompanyReliabilityReportResponse> mapInReport;

    /**Metodo che si occupa dell'invio della query di update della tabella Tite
     *
     * @param properties file properties
     * @param map mappa TableEntityTite,GetCompanyReliabilityResponse
     */
    public void run(Map<TableEntityTite, GetCompanyReliabilityReportResponse> map, Properties properties){
        DbQueryObject queryObject = new DbQueryObject(); //creazione contenitore query per insert

        for (Map.Entry<TableEntityTite,GetCompanyReliabilityReportResponse> entry : map.entrySet()){
            boolean tempReport;
            boolean tempCrif;
            boolean tempTite;
            DbSendQuery dbcr = new DbSendQuery(properties);
            DbQueryObject commitQuery = new DbQueryObject();
            commitQuery.commit();
            try{
                dbcr.sendCommit(commitQuery);
            }catch (SQLException sqlEx){
                logger.info("commit non inviato, update della tabella Report non eseguito");
               //Thread.currentThread().interrupt();
                continue;
            }
            queryObject.createQueryInsertInReport(entry.getKey(),entry.getValue());
            tempReport = dbcr.sendUpdate(queryObject);
            if(!tempReport){
                queryObject.createRollBack();
                dbcr.sendRollBack(queryObject);
                continue;
            }
            if(entry.getValue().getResult().getCode().equals("0")) {
                queryObject.createQueryInsertInCrif(entry.getKey(), entry.getValue());
                tempCrif = dbcr.sendUpdate(queryObject);
                queryObject.createElaboratoUpdate(entry.getKey());
                tempTite = dbcr.sendUpdate(queryObject);
                if(tempCrif && tempTite){
                    try{
                        dbcr.sendCommit(commitQuery);
                        mapInReport.put(entry.getKey(),entry.getValue());
                    }catch (SQLException sqlEx){
                        logger.info("commit non inviato, update della tabella Report non eseguito");
                        rollBack(dbcr);
                    }
                }else{
                    rollBack(dbcr);
                }
            }else{
                queryObject.createCounterUpdate(entry.getKey());
                tempTite = dbcr.sendUpdate(queryObject);
                if(tempTite){
                    try{
                        dbcr.sendCommit(commitQuery);
                        mapInReport.put(entry.getKey(),entry.getValue());
                    }catch (SQLException sqlEx){
                        logger.info("commit non inviato, update della tabella Report non eseguito");
                        rollBack(dbcr);
                    }
                }else{
                    rollBack(dbcr);
                }
            }
        }
        logger.info("Update Tabella report e crif avvenuto con successo");
        DbConnection.getInstance().close();
    }

    public Map<TableEntityTite, GetCompanyReliabilityReportResponse> getMapInReport(){
        return  mapInReport;
    }

    public void rollBack(DbSendQuery dbcr){
        DbQueryObject queryObject = new DbQueryObject();
        queryObject.createRollBack();
        dbcr.sendRollBack(queryObject);
    }
}
