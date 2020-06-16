/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.nexi.control_relation.batch.tableEntity;

import java.util.ArrayList;
import java.util.List;

/**
 *Classe che mi identifica una riga della tabella TBSI_NPF_ACQ_NO_REL_SOC_TITE
 */
public class TableEntityTite {
    public String co_soc;
    public String co_proc;
    public String co_piva;
    public String co_fis_soc;
    public String id_sogg_soc;
    public String fl_elaborato;
    public String dt_ins;
    public String co_prov;
    public String te_com;
    public String nu_retry;

    /**
     *Entità riga tabella TBSI_NPF_ACQ_NO_REL_SOC_TITE
     * @param co_soc co_soc
     * @param co_proc co_proc
     * @param co_piva co_piva
     * @param co_fis_soc co_fis_soc
     * @param id_sogg_soc id_sogg_soc
     * @param fl_elaborato fl_elaborato
     * @param dt_ins dt_ins
     */

    public TableEntityTite(String co_soc, String co_proc, String co_piva, String co_fis_soc, String id_sogg_soc,
                           String fl_elaborato, String dt_ins, String co_prov, String te_com, String nu_retry){
        this.co_soc=co_soc;
        this.co_proc=co_proc;
        this.co_piva=co_piva;
        this.co_fis_soc=co_fis_soc ;
        this.id_sogg_soc=id_sogg_soc;
        this.fl_elaborato=fl_elaborato;
        this.dt_ins=dt_ins;
        this.co_prov=co_prov;
        this.te_com=te_com;
        this.nu_retry=nu_retry;
    }

    /**
     *Metodo che trasforma una Stringa in una TableEntityTite; i parametri sono separati da un carattere ;
     */
    public TableEntityTite(String def){
        String[] data = def.split(";");
        this.co_soc=data[0];
        this.co_proc=data[1];
        this.co_piva=data[2];
        this.co_fis_soc=data[3];
        this.id_sogg_soc=data[4];
        this.fl_elaborato=data[5];
        this.dt_ins=data[6];
        this.co_prov=data[7];
        this.te_com=data[8];
        this.nu_retry=data[9];
    }

    /**
     *Metodo che trasforma una entità TableEntityTite in una stringa che verrà poi inserita nella lista che a sua volta verrà passato al CSVReader
     */
    public String entityToString() {
        return co_soc+";"+co_proc+";"+co_piva+";"+co_fis_soc+";"+id_sogg_soc+";"+fl_elaborato+";"+dt_ins+";"+co_prov+";"+te_com+";"+nu_retry+";";
    }

    public String entityToStringQuery(){
        return "('"+co_soc+"', '"+co_proc+"', '"+co_piva+"', '"+co_fis_soc+"', "+id_sogg_soc+", '"+fl_elaborato+"', '"+dt_ins+"', '"+co_prov+"', '"+te_com+"', '"+nu_retry+"'),";
    }

    public String entityToStringQueryLast(){
        return "('"+co_soc+"', '"+co_proc+"', '"+co_piva+"', '"+co_fis_soc+"', "+id_sogg_soc+", '"+fl_elaborato+"', '"+dt_ins+"', '"+co_prov+"', '"+te_com+"', '"+nu_retry+"');";
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

    public String getCo_fis_soc() {
        return co_fis_soc;
    }

    public String getId_sogg_soc() {
        return id_sogg_soc;
    }

    public String getFl_elaborato() {
        return fl_elaborato;
    }

    public String getDt_ins() {
        return dt_ins;
    }

    public String getCo_prov() {
        return co_prov;
    }

    public String getTe_com() {
        return te_com;
    }

    public String getNu_retry() {
        return nu_retry;
    }
}
