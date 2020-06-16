package it.nexi.control_relation.batch.dao.queryProcess;

import it.nexi.control_relation.batch.dao.DbQueryObject;
import it.nexi.control_relation.batch.dao.DbSendQuery;
import it.nexi.control_relation.batch.tableEntity.SecondMappingEntity;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SecondMapping extends Thread {

    final static Logger logger = Logger.getLogger(UpdateCrifTable.class);


    public List<SecondMappingEntity> run(Properties properties){
        List<SecondMappingEntity> secondMappingResults = new ArrayList<>();
        DbQueryObject queryObject = new DbQueryObject(); //creazione contenitore query
        DbSendQuery dbcr = new DbSendQuery(properties);
        try{
            queryObject.createSecondMapping();
            secondMappingResults = dbcr.sendSecondMapping(queryObject);
        }catch(SQLException sqlEx){
            logger.error("Connessione al Db e invio query SELECT non riuscita");
            System.exit(-1);
        }
        return secondMappingResults;
    }
}