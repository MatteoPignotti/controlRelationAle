/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.nexi.control_relation.batch.tableEntity;

import java.util.ArrayList;
import java.util.List;

/**
 *Classe che mi identifica una riga della tabella TBSI_NPF_ACQ_REL_SOC_TITE_CRIF
 */
public class TableEntityCrif {
    public String co_soc;
    public String co_proc;
    public String co_piva;
    public String co_fis_tite;
    public String co_tp_rel_soc_tite;
    public String fl_carica_ok;
    public String dt_ins;

    /**
     *Entità riga tabella TBSI_NPF_ACQ_REL_SOC_TITE_CRIF
     * @param co_soc co_soc
     * @param co_proc
     * @param co_piva co_piva
     * @param co_fis_tite co_fis_tite
     * @param co_tp_rel_soc_tite co_tp_rel_soc_tite
     * @param fl_carica_ok fl_carica_ok
     * @param dt_ins dt_ins
     */

    public TableEntityCrif(String co_soc, String co_proc, String co_piva, String co_fis_tite, String co_tp_rel_soc_tite,
                           String fl_carica_ok, String dt_ins){
        this.co_soc=co_soc;
        this.co_proc=co_proc;
        this.co_piva=co_piva;
        this.co_fis_tite=co_fis_tite ;
        this.co_tp_rel_soc_tite=co_tp_rel_soc_tite;
        this.fl_carica_ok=fl_carica_ok;
        this.dt_ins=dt_ins;
    }

    /**
     *Metodo che trasforma una Stringa in una TableEntityTite; i parametri sono separati da un carattere ;
     */
    public TableEntityCrif(String def){
        String[] data = def.split(";");
        this.co_soc=data[0];
        this.co_proc=data[1];
        this.co_piva=data[2];
        this.co_fis_tite=data[3];
        this.co_tp_rel_soc_tite=data[4];
        this.fl_carica_ok=data[5];
        this.dt_ins=data[6];
    }

    /**
     *Metodo che trasforma una entità TableEntityTite in una stringa che verrà poi inserita nella lista che a sua volta verrà passato al CSVReader
     */
    public String entityToString(){
        return co_soc+";"+co_proc+";"+co_piva+";"+co_fis_tite+";"+co_tp_rel_soc_tite+";"+fl_carica_ok+";"+dt_ins;
    }
    public String entityToStringQuery(){
        return "('"+co_soc+"', '"+co_proc+"', '"+co_piva+"', '"+co_fis_tite+"', "+co_tp_rel_soc_tite+", '"+fl_carica_ok+"', '"+dt_ins+"'),";
    }

    public String entityToStringQueryLast(){
        return "('"+co_soc+"', '"+co_proc+"', '"+co_piva+"', '"+co_fis_tite+"', "+co_tp_rel_soc_tite+", '"+fl_carica_ok+"', '"+dt_ins+"');";
    }



    public String getCo_soc() {
        return co_soc;
    }

    public String getCo_proc() {
        return co_proc;
    }

    public String getCo_piva() {
        return co_piva;
    }

    public String getCo_fis_tite() {
        return co_fis_tite;
    }

    public String getCo_tp_rel_soc_tite() {
        return co_tp_rel_soc_tite;
    }

    public String getFl_carica_ok() {
        return fl_carica_ok;
    }

    public String getDt_ins() {
        return dt_ins;
    }
    
}
