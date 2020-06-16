package it.nexi.control_relation.batch.dao.queryProcess;

import io.swagger.client.model.GetCompanyReliabilityReportResponse;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;

import it.nexi.control_relation.batch.dao.DbConnection;
import it.nexi.control_relation.batch.dao.DbQueryObject;
import it.nexi.control_relation.batch.dao.DbSendQuery;
import org.apache.log4j.Logger;

import java.util.*;

/**Classe per l'update del campo FL_caricato o counter per la tabella TITE in base al messaggio di errore
 */
public class UpdateElaborato extends Thread {

    final static Logger logger = Logger.getLogger(UpdateElaborato.class);

    /**Metodo per l'update del campo FL_caricato o counter per la tabella TITE in base al messaggio di errore
     *
     * @param properties file properies
     * @param map map[tableEntityTite, GetCOmpany.....Response]
     */
    public void update(Properties properties, Map<TableEntityTite, GetCompanyReliabilityReportResponse> map){
        DbQueryObject queryObject = new DbQueryObject(); //creazione contenitore query
        DbSendQuery dbcr = new DbSendQuery(properties);
        for (Map.Entry<TableEntityTite,GetCompanyReliabilityReportResponse> entry : map.entrySet()){
               if(Integer.parseInt(entry.getValue().getResult().getCode())>0){
                   queryObject.createCounterUpdate(entry.getKey());
                   dbcr.sendUpdate(queryObject);
                } else{
                    queryObject.createElaboratoUpdate(entry.getKey());
                    dbcr.sendUpdate(queryObject);
               }
            logger.error("Connessione al Db e invio query SELECT non riuscita");
        }
        DbConnection.getInstance().close();
        logger.info("connessione chiusa");
    }
    }



