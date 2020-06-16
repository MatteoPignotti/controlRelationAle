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

/**Classe per l'update della tabella TBSI_CRIF
 */
public class UpdateCrifTable extends Thread  {

    final static Logger logger = Logger.getLogger(UpdateCrifTable.class);


    /**Metodo per l'update della tabella TBSI_CRIF
     *
     * @param properties file properies
     * @param map map[tableEntityTite, GetCOmpany.....Response]
     */
    public void run(Properties properties, Map<TableEntityTite, GetCompanyReliabilityReportResponse> map){
        DbQueryObject queryObject = new DbQueryObject(); //creazione contenitore query per insert
        DbQueryObject firstCommitQuery = new DbQueryObject();
        firstCommitQuery.commit();
        DbSendQuery dbcr = new DbSendQuery( properties);
        try{
            dbcr.sendCommit(firstCommitQuery);
        }catch (SQLException sqlEx){
            logger.info("commit non inviato, update della tabella Crif non eseguito");
            DbConnection.getInstance().close();
            Thread.currentThread().interrupt();
        }
        for (Map.Entry<TableEntityTite,GetCompanyReliabilityReportResponse> entry : map.entrySet()){
                    queryObject.createQueryMultipleInsertInCrif(entry.getKey(),entry.getValue());
                    dbcr.sendUpdate(queryObject);
                }
        DbQueryObject secondCommitQuery = new DbQueryObject();
        secondCommitQuery.commit();
        logger.info("Update avvenuto con successo");
        DbConnection.getInstance().close();
    }
}
