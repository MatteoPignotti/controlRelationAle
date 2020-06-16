package it.nexi.control_relation.batch.dao.queryProcess;

import it.nexi.control_relation.batch.csv.impl.AMLCSVReader;
import it.nexi.control_relation.batch.dao.DbConnection;
import it.nexi.control_relation.batch.dao.DbQueryObject;
import it.nexi.control_relation.batch.dao.DbSendQuery;
import org.apache.log4j.Logger;

import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Properties;

/**Classe che si occupa della creazione e dell'invio della query per quanto riguarda l'update della tabella TBSI_TITE
 *
 */
public class UpdateTiteTable extends Thread {

    final static Logger logger = Logger.getLogger(UpdateTiteTable.class);


    /**Classe che si occupa dell'invio della query di update della tabella Tite
     *
     * @param properties file properties
     */
    public void run(Properties properties){
        logger.info("update della tabella SION basandosi sul file locale.....");
        AMLCSVReader csvR = new AMLCSVReader(Paths.get(properties.getProperty("path.output") + "/firstMappingResultCSV.csv"));
        DbSendQuery dbcr = new DbSendQuery(properties);
        commit(dbcr);
        logger.info("inizio procedura di update in TITE");
        DbQueryObject queryObject = new DbQueryObject(); //creazione contenitore query per commit
        int counter = 0;
        boolean temp;
        for(int i = 0; i<csvR.readTiteCsv().size();i++){
            queryObject.createQueryInsertInTite(csvR.readTiteCsv().get(i));
            temp = dbcr.sendUpdate(queryObject);
            if(temp == true)counter++;
        }
        logger.info("record processati: "+csvR.readTiteCsv().size()+" ---- record inseriti in TITE: "+counter);
        commit(dbcr);
        logger.info("Update avvenuto con successo");
        DbConnection.getInstance().close();
    }

    public void commit(DbSendQuery dbcr){
        DbQueryObject commitQuery = new DbQueryObject();
        commitQuery.commit();
        try{
            dbcr.sendCommit(commitQuery);
        }catch (SQLException sqlEx){
            logger.info("commit non inviato, update della tabella Tite non eseguito");
            DbConnection.getInstance().close();
            Thread.currentThread().interrupt();
        }
    }
}
