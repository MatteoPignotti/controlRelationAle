package it.nexi.control_relation.batch.dao;

import io.swagger.client.model.*;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;
import org.apache.log4j.Logger;

/**classe dove vengono salvate tutte le possibili query che il processo di batch può creare durante la sua esecuzione
 *
 */
public class DbQueryObject {

    final Logger logger = Logger.getLogger(DbQueryObject.class);

    public String query;
    public DbQueryObject(){
        query=null;
    }

    public String toString(){
        return query;
    }

    /**
     *
     * Metodo con il quale si invia la query da eseguire estrarre i record per l'update riguardante la tabella Tite
     * @return Query creata dal metodo in formato Stringa
     */
    public void createFirstMapping() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT DISTINCT relSoc.co_key_ext AS co_soc, relSoc.co_proc as co_proc, pga.co_piva AS co_piva, pga.co_fis AS co_fis_soc, pga.id_sogg AS id_sogg_soc, null as fl_elaborato, sysdate as dt_ins " +
                "FROM tbsi_relazione relSoc, tbsi_relazione relPv, tbsi_delegati_tite relDel, tbsi_pers_giu_ana pga, tbsi_adverifica_pf_ana advPfAna, TBSI_NPF_ACQ_NO_REL_SOC_TITE nrt " +
                "WHERE 1=1 AND relSoc.co_tp_rel = 11 AND relSoc.id_rel = relPv.id_rel_coll AND relPv.co_tp_rel = 13" +
                "AND((relSoc.dt_ini_vld > TO_DATE('20200331','yyyymmdd') AND NVL(relSoc.dt_fin_vld, SYSDATE+1) > SYSDATE) OR (relPv.dt_ini_vld > TO_DATE('20200331','yyyymmdd') AND NVL(relPv.dt_fin_vld, SYSDATE+1) > SYSDATE))" +
                "AND relSoc.id_sogg = relDel.id_sogg_soc AND relDel.co_tp_rel_delegato = 21 AND relSoc.id_sogg = pga.id_sogg AND relDel.id_sogg_delegato = advPfAna.id_sogg AND advPfAna.co_tp_rel_soc_tite IS NULL AND relSoc.co_key_ext=nrt.co_soc(+)" +
                "AND relSoc.co_proc=nrt.co_proc(+) AND nrt.id_sogg_soc IS NULL");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

    /**metodo con il quale si crea la query COMMIT
     *
     */
    public void commit() {
        StringBuilder query = new StringBuilder();
        query.append("COMMIT");
        logger.info("Query COMMIT creata con successo...");
        this.query = query.toString();
    }

    /**Metodo con il quale si crea la query per il recupero dei record da TBSI_TITE che verranno poi inviati a Crif per l'analisi
     *
     */
    public void createRecoveryTite() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT *");
        query.append(" FROM TBSI_NPF_ACQ_NO_REL_SOC_TITE");
        query.append(" WHERE FL_ELABORATO IS NULL OR (FL_ELABORATO = 'N' AND NU_RETRY<3)");
        logger.info("Query createRecoveryTiteSelect creata con successo..." + query.toString());
        this.query = query.toString();
    }

    /**
     *
     * Metodo con il quale si invia la query da eseguire per eseguire l'update riguardante la tabella Tite
     * @return Query creata dal metodo in formato Stringa
     */
    public void createQueryInsertInTite(TableEntityTite tb) {
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO TBSI_NPF_ACQ_NO_REL_SOC_TITE");
        query.append("VALUES ("+tb.getCo_soc()+", "+tb.getCo_proc()+", "+tb.getCo_piva()+", "+tb.getCo_fis_soc()+", "+tb.getId_sogg_soc()+", "
                +tb.getFl_elaborato()+", "+tb.getDt_ins()+", "+tb.getCo_prov()+", "+tb.getTe_com()+", "+tb.getNu_retry()+");");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

    public void createQueryReportSelect() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM ReportTable WHERE FLAG = N");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

    public void createQueryInsertInReport(TableEntityTite tb, GetCompanyReliabilityReportResponse gtr){
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO TBSI_NPF_ACQ_NO_REL_SOC_TITE");
        query.append("VALUES ("+tb.getCo_soc()+", "+tb.getCo_proc()+", "+tb.getCo_piva()+", "+tb.getCo_fis_soc()+", "+tb.getId_sogg_soc()+", "
                +tb.getFl_elaborato()+", "+tb.getDt_ins()+", "+", "+tb.getCo_prov()+", "+tb.getTe_com()+", "+tb.getNu_retry()+", "+gtr.getResult().getCode()+", "+gtr.getResult().getDescription()+", "+gtr.toString()+", N);");
    }

    public void createQueryInsertInCrif(TableEntityTite tb, GetCompanyReliabilityReportResponse grr) {
        StringBuilder query = new StringBuilder();
        BeneficialOwner beneficialOwner = grr.getBeneficialOwners().get(0);
        query.append("INSERT INTO TBSI_NPF_ACQ_NO_REL_SOC_CRIF");
        query.append("VALUES ("+tb.getCo_soc()+", "+tb.getCo_proc()+", "+tb.getCo_piva()+", "+beneficialOwner.getCciaaCode()+", "+beneficialOwner.getRoleCode()+", "
                +null+", "+tb.getDt_ins()+");");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

    public void createRollBack() {
        StringBuilder query = new StringBuilder();
        query.append("ROLLBACK;");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

    /**metodo per la creazione della query inerente all'incremento del campo FL_ELABORATO nella tabella TITE
     *
     * @param tb TableEntityTite
     */
    public void createElaboratoUpdate(TableEntityTite tb) {
        StringBuilder query = new StringBuilder();
        query.append("UPDATE TBSI_NPF_ACQ_NO_REL_SOC_TITE SET FL_ELABORATO = Y WHERE CO_SOC = "+tb.getCo_soc()+", CO_PROC = "+tb.getCo_proc()+" , CO_PIVA = "+tb.getCo_piva()+
                " , CO_FIS_SOC = "+tb.getCo_fis_soc()+" , ID_SOGG_SOC = "+tb.getId_sogg_soc()+";");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

    /**metodo per la creazione della query inerente all'incremento del counter nella tabella TITE
     *
     * @param tb TableEntityTite
     */
    public void createCounterUpdate(TableEntityTite tb) {
        StringBuilder query = new StringBuilder();
        query.append("UPDATE TBSI_NPF_ACQ_NO_REL_SOC_TITE SET NU_RETRY = "+(Integer.parseInt(tb.nu_retry)+1)+" WHERE CO_SOC = "+tb.getCo_soc()+", CO_PROC = "+tb.getCo_proc()+" , CO_PIVA = "+tb.getCo_piva()+
                " , CO_FIS_SOC = "+tb.getCo_fis_soc()+" , ID_SOGG_SOC = "+tb.getId_sogg_soc()+" , CO_PROV = "+tb.getCo_prov()+" , TE_COM = "+tb.getTe_com()+";");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

    public void createQueryMultipleInsertInCrif(TableEntityTite tb, GetCompanyReliabilityReportResponse grr) {
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO TBSI_NPF_ACQ_NO_REL_SOC_CRIF VALUES ");
        for(int i=0; i<grr.getBeneficialOwners().size()-1;i++){
            BeneficialOwner beneficialOwner = grr.getBeneficialOwners().get(i);
            query.append("("+tb.getCo_soc()+", "+tb.getCo_proc()+", "+tb.getCo_piva()+", "+beneficialOwner.getAnagraphicalData().getFiscalCode()+", "+beneficialOwner.getRoleCode()+", "
                    +null+", "+tb.getDt_ins()+")");
        }
        BeneficialOwner beneficialOwner = grr.getBeneficialOwners().get(grr.getBeneficialOwners().size()-1);
        query.append("("+tb.getCo_soc()+", "+tb.getCo_proc()+", "+tb.getCo_piva()+", "+beneficialOwner.getAnagraphicalData().getFiscalCode()+", "+beneficialOwner.getRoleCode()+", "
                +null+", "+tb.getDt_ins()+");");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

    /**metodo creazione query update flag tabella report
     *
     */
    public void createQueryUpdateFlagReport(){
        StringBuilder query = new StringBuilder();
        query.append("UPDATE CO_TP_REL_SOC_REPORT SET FLAG = Y");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

     /*public void createQueryInsertInCrifMultiple(List<TableEntityCrif> tb) {
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO TBSI_NPF_ACQ_NO_REL_SOC_CRIF VALUES ");
        for(int i = 0; i<tb.size()-1;i++) {
            query.append(tb.get(i).entityToStringQuery());
        }
        query.append(tb.get(tb.size()-1).entityToStringQueryLast());
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }*/

    /*public void createQueryInsertInTiteMultiple(List<TableEntityTite> tb) {
        StringBuilder query = new StringBuilder();
        query.append("IINSERT INTO TBSI_NPF_ACQ_NO_REL_SOC_TITE VALUES ");
        for(int i = 0; i<tb.size()-1;i++) {
            query.append(tb.get(i).entityToStringQuery());
        }
        query.append(tb.get(tb.size()-1).entityToStringQueryLast());
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }*/




    public void createSecondMapping() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT t.co_soc, t.co_proc , t.co_fis_tite , p.id_sogg id_sogg_tite, t.co_tp_rel_soc_te, r.id_rel id_rel_soc, " +
                "d.id_rel_delegato ALTRO_ID_REL_REL_SOC_TE," + " 'BATCH_AML' ALTRO_TE_CANALE_REL_SOC_TE," +
                " 1 ALTRO_ID_VERSIONE_REL_SOC_TE," + " SYSDATE ALTRO_DT_ULT_MOD_REL_SOC_TE," + " 'S' ALTRO_FL_CHECK_COMP_REL_SOC_TE," +
                " 'S' ALTRO_FL_CHECK_ACC_REL_SOC_TE, " + " 'S' ALTRO_FL_CHECK_TOT_REL_SOC_TE," + " 301 CMPL_DEGREE_REL_SOC_TE");
        query.append("FROM sion.TBSI_NPF_ACQ_REL_SOC_TITE_CRIF t," + " sion.tbsi_relazione r," + " sion.tbsi_delegati_tite d," + " sion.tbsi_pers_fis_ana p");
        query.append(" t.fl_carica_ok is null" + " and t.co_soc = r.co_key_ext" + " and t.co_proc = r.co_proc" + " and r.co_tp_rel=11" +
                " and r.id_sogg=d.id_sogg_soc" + " and d.co_tp_rel=21" + " and d.id_sogg_delegato=p.id_sogg" + " and p.co_fis=t.co_fis");
        logger.info("Query creata con successo...");
        logger.info(query.toString());
        this.query = query.toString();
    }

}
