package it.nexi.control_relation.batch.dao.queryProcess;

import it.nexi.control_relation.batch.dao.DbConnection;
import it.nexi.control_relation.batch.dao.DbQueryObject;
import it.nexi.control_relation.batch.dao.DbSendQuery;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**classe che si occupa della creazione e dell'invio della query inerente l'estrazione delle entità da mandare a Crif
 *
 */
public class SelectFromTite extends Thread{
    final static Logger logger = Logger.getLogger(SelectFromTite.class);



    /**Metodo con il quale estraggo le entità/società da mandare a Crif
     *
     * @param properties File Properties dove ci sono user/host/password
     * @return Lista di TableEntityTite
     */
    public List<TableEntityTite> run(Properties properties){
        logger.info("Avvio procedura Select delle societa' da inviare a crif...");
        List<TableEntityTite> selectTiteResults = new ArrayList<>(); //contenitore risposta database per il firstMapping
        DbQueryObject queryObject = new DbQueryObject(); //creazione contenitore query
        DbSendQuery dbcr = new DbSendQuery(properties);
        queryObject.createRecoveryTite();
        selectTiteResults = dbcr.sendRecoveryFromTite(queryObject);
        DbConnection.getInstance().close();//in ogni caso chiudo sempre la connessione
        return selectTiteResults;
    }
}
