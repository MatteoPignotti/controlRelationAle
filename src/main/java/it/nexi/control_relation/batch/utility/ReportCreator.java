package it.nexi.control_relation.batch.utility;

import it.nexi.control_relation.batch.dao.DbConnection;
import it.nexi.control_relation.batch.dao.DbQueryObject;
import it.nexi.control_relation.batch.dao.DbSendQuery;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 *Classe utilizzata per creare una lista di ReportEntity che mi serviranno poi per creare il file csv da mandare attraverso email
 * @param dirs Stringa di specifica
 */
public class ReportCreator extends Thread {

    final static Logger logger = Logger.getLogger(ReportCreator.class);

    /**
     *
     * @param properties File proprieties di configurazione
     * @return Lista di stringhe ReportEntity
     */
    public List<String> run(Properties properties){
        List<String>selectReportResult;
        DbQueryObject queryObject = new DbQueryObject(); //creazione contenitore query per insertfirstCommitQuery.commit();
        DbSendQuery dbcr = new DbSendQuery(properties);
        queryObject.commit();
        try{
            dbcr.sendCommit(queryObject);
        }catch (SQLException sqlEx){
            logger.info("commit non inviato, update della tabella Report non eseguito");
            DbConnection.getInstance().close();
            Thread.currentThread().interrupt();
        }
        queryObject.createQueryReportSelect();
        selectReportResult = dbcr.sendSelectReport(queryObject);
        queryObject.createQueryUpdateFlagReport();
        boolean temp = dbcr.sendUpdate(queryObject);
        if(temp){
            DbQueryObject secondCommitQuery = new DbQueryObject();
            secondCommitQuery.commit();
            try{
                dbcr.sendCommit(secondCommitQuery);
                DbConnection.getInstance().close();
                logger.info("Update avvenuto con successo");
                return selectReportResult;
            }catch (SQLException sqlEx){
                DbConnection.getInstance().close();
                logger.info("Update non avvenuto");
                return null;
        }
        }else{
            DbConnection.getInstance().close();
            logger.info("Update non avvenuto");
            return null;
        }
    }
}

