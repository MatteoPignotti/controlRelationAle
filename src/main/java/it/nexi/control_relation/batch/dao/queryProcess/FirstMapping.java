package it.nexi.control_relation.batch.dao.queryProcess;

import it.nexi.control_relation.batch.dao.DbConnection;
import it.nexi.control_relation.batch.dao.DbQueryObject;
import it.nexi.control_relation.batch.dao.DbSendQuery;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**Classe che si occupa dell'invio della query riguardante il firtMapping e la relativa gestione della risposta
 *
 */
public class FirstMapping extends Thread{

    final static Logger logger = Logger.getLogger(FirstMapping.class);



    /**Metodo che gestisce l'invio della query e la gestione della risposta
     * @param properties Recupero host,password,user
     * @return Lista di Stringhe contentente i record in formato ToString utili poi per creare un CSV--->value1;value2;value3;....
     */
    public List<String> run(Properties properties){
        logger.info("Tentativo Connessione al Db e invio query First Mapping...");
        List<String> firstMappingResults; //contenitore risposta database per il firstMapping
        DbQueryObject queryObject = new DbQueryObject(); //creazione contenitore query
        DbSendQuery dbcr = new DbSendQuery(properties);
        queryObject.createFirstMapping();
        firstMappingResults = dbcr.sendFirstMapping(queryObject);
        DbConnection.getInstance().close();//in ogni caso chiudo la connessione
        return firstMappingResults;
    }
}
