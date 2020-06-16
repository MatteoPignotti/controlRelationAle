package it.nexi.control_relation.batch.dao;

import it.nexi.control_relation.batch.tableEntity.SecondMappingEntity;
import it.nexi.control_relation.batch.tableEntity.TableEntityReport;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**Classe che si occupa della communicazione tra batch process e database SION; gestione risposta in base alle necessità
 *
 */
public class DbSendQuery {
    final Logger logger = Logger.getLogger(DbSendQuery.class);
    private Properties properties;

    public DbSendQuery(Properties properties){
        this.properties = properties;
    }



    /**
     *
     * Metodo con il quale si stabilisce la connessione con il dataabase SION e si invia la query da eseguire
     * @param properties File properties nel quale si trovano i dati relativi al NomeHost, NomeUser, PassUser
     * @param query Query in formato stringa che verrà inviata al database dopo l'avvenuta connessione
     */
    public List<String> sendFirstMapping(DbQueryObject query){
        List<String> list = new ArrayList<>();
        try (Connection conn = DbConnection.getInstance().open(properties.getProperty("db.host"), properties.getProperty("db.user"), properties.getProperty("db.pass"));
             PreparedStatement ps = conn.prepareStatement(query.toString())) {
            try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                TableEntityTite tb=new TableEntityTite(rs.getString("CO_SOC"),rs.getString("CO_PROC"),
                        rs.getString("CO_PIVA"),rs.getString("CO_FIS_SOC"),
                        rs.getString("ID_SOGG_SOC"),rs.getString("FL_ELABORATO"),rs.getString("DT_INS"),
                        rs.getString("CO_PROV"),rs.getString("TE_COM"),rs.getString("NU_RETRY"));
                list.add(rs.toString());
            }
            logger.info("query first mapping creata inviata con successo");
        }
    }catch (SQLException e){
            logger.info("Errore query" + e);
        }
        return list;
    }

    /**Metodo con il quale si gestiste la communicazione tra processo e database e quindi il recupero dei record dalla tabella
     * TBSI_TITE sotto forma di TableEntityTite
     * @param query Query inerente al recupuro record da TBSI_TITE--->crateRecoveryTite
     * @return Lista di TableEntityTite
     */
    public List<TableEntityTite> sendRecoveryFromTite(DbQueryObject query) {
        List<TableEntityTite> list = new ArrayList<>();
        try (Connection conn = DbConnection.getInstance().open(properties.getProperty("db.host"), properties.getProperty("db.user"), properties.getProperty("db.pass"));
             PreparedStatement ps = conn.prepareStatement(query.toString())) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                TableEntityTite tb=new TableEntityTite(rs.getString("CO_SOC"),rs.getString("CO_PROC"),
                        rs.getString("CO_PIVA"),rs.getString("CO_FIS_SOC"),
                        rs.getString("ID_SOGG_SOC"),rs.getString("FL_ELABORATO"),rs.getString("DT_INS"),
                        rs.getString("CO_PROV"),rs.getString("TE_COM"),rs.getString("NU_RETRY"));
                list.add(tb);
            }
            }
            logger.info("invio query riuscito e lista recovery creata con successo");
        }catch (SQLException e){
            logger.info("Errore query, invio non riuscito" +e);
        }
        return list;
    }


   public List<String> sendSelectReport(DbQueryObject query) {
        List<String> list = new ArrayList<>();
        try (Connection conn = DbConnection.getInstance().open(properties.getProperty("db.host"), properties.getProperty("db.user"), properties.getProperty("db.pass"));
                 PreparedStatement ps = conn.prepareStatement(query.toString())) {
                try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                TableEntityTite tb = new TableEntityTite(rs.getString("CO_SOC"), rs.getString("CO_PROC"),
                        rs.getString("CO_PIVA"), rs.getString("CO_FIS_SOC"),
                        rs.getString("ID_SOGG_SOC"), rs.getString("FL_ELABORATO"), rs.getString("DT_INS"),
                        rs.getString("CO_PROV"), rs.getString("TE_COM"), rs.getString("NU_RETRY"));
                String codResponse = rs.getString("COD_RESPONSE");
                String description = rs.getString("DESCRIPTION");
                String toString = rs.getString("TO_STRING");
                TableEntityReport tbReponse = new TableEntityReport(tb, codResponse, description, toString);
                list.add(tbReponse.toString());
            }
        }}catch (SQLException e){
            System.out.println("Errore query");
        }
        return list;
    }


    /**Metodo con il quale si invia la query COMMIT
     * @param commitQuery Query commit
     */
   public void sendCommit(DbQueryObject commitQuery) throws SQLException{
        logger.info("Send Commit");
       try (Connection conn = DbConnection.getInstance().open(properties.getProperty("db.host"), properties.getProperty("db.user"), properties.getProperty("db.pass"));
            PreparedStatement ps = conn.prepareStatement(commitQuery.toString())) {
           try (ResultSet rs = ps.executeQuery()) { {
             logger.info("invio query riuscito");
         }}catch (SQLException e){
             logger.info("Errore queryCommit");
         }
    }
   }


    public List<SecondMappingEntity> sendSecondMapping(DbQueryObject query) throws SQLException {
        List<SecondMappingEntity> list = new ArrayList<>();
           try (Connection conn = DbConnection.getInstance().open(properties.getProperty("db.host"), properties.getProperty("db.user"), properties.getProperty("db.pass"));
                PreparedStatement ps = conn.prepareStatement(query.toString())) {
               try (ResultSet rs = ps.executeQuery()) {
                   while (rs.next()) {
            while (rs.next()) {
                SecondMappingEntity tb=new SecondMappingEntity(rs.getString("CO_SOC"),rs.getString("CO_PROC"),
                        rs.getString("CO_FIS_TITE"),rs.getString("ID_SOGG_TITE"),
                        rs.getString("CO_TP_REL_SOC_TE"),rs.getString("ID_REL_SOC"),rs.getString("ALTRO_ID_REL_REL_SOC_TE"));
                list.add(tb);
            }
            conn.close();//chiusura connessione
        }}catch (SQLException e){
            System.out.println("Errore query");
            conn.close();//chiusura connessione
        }
        return list;
    }
   }
/*
    /**Metodo con il quale si gestiste la communicazione tra processo e database e quindi l'INSERT di record all'interno di una tabella
     * @param query Query inerente al recupuro record da TBSI_TITE--->crateRecoveryTite
     */
   /* public boolean sendInsert(DbQueryObject query){
            try (Connection conn = DbConnection.getInstance().open(properties.getProperty("db.host"), properties.getProperty("db.user"), properties.getProperty("db.pass"));
                 PreparedStatement ps = conn.prepareStatement(query.toString())) {
                try (ResultSet rs = ps.executeQuery()) {
                    return true;
                }
                }catch (SQLException e){
                return false;
                }
            }/*

    /**Metodo per l'invio di query di tipo update
     * @param query query update
*/
    public boolean sendUpdate(DbQueryObject query){
        try (Connection conn = DbConnection.getInstance().open(properties.getProperty("db.host"), properties.getProperty("db.user"), properties.getProperty("db.pass"));
             PreparedStatement ps = conn.prepareStatement(query.toString())) {
            try (ResultSet rs = ps.executeQuery()) {
            return true;
        }}catch (SQLException e){
            return false;
        }
    }

    public void sendRollBack(DbQueryObject query){
        try (Connection conn = DbConnection.getInstance().open(properties.getProperty("db.host"), properties.getProperty("db.user"), properties.getProperty("db.pass"));
             PreparedStatement ps = conn.prepareStatement(query.toString())) {
            try (ResultSet rs = ps.executeQuery()) {
            logger.info(rs.toString());
        }}catch (SQLException e){
            logger.info("Errore query");
            DbConnection.getInstance().close();
        }

    }
}

