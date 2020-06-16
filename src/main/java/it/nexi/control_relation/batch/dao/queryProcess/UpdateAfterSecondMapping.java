package it.nexi.control_relation.batch.dao.queryProcess;
import it.nexi.control_relation.batch.dao.DbConnection;
import it.nexi.control_relation.batch.dao.DbQueryObject;
import it.nexi.control_relation.batch.dao.DbSendQuery;
import it.nexi.control_relation.batch.tableEntity.SecondMappingEntity;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;


public class UpdateAfterSecondMapping extends Thread {

    final static Logger logger = Logger.getLogger(UpdateAfterSecondMapping.class);


    public void run(List<SecondMappingEntity> list, Properties properties){
        DbQueryObject queryObject = new DbQueryObject(); //creazione contenitore query per insert
        DbQueryObject firstCommitQuery = new DbQueryObject();
        firstCommitQuery.commit();
        DbSendQuery dbcr = new DbSendQuery(properties);
        try{
            dbcr.sendCommit(firstCommitQuery);
        }catch (SQLException sqlEx){
            logger.info("commit non inviato, update della tabella Report non eseguito");
            DbConnection.getInstance().close();
            Thread.currentThread().interrupt();
        }
        for(int i = 0; i<list.size();i++){

        }

    }
}
