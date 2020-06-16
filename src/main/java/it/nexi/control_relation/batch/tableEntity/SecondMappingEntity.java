package it.nexi.control_relation.batch.tableEntity;

public class SecondMappingEntity {

    private String co_soc;
    private String co_proc;
    private String co_fis_tite;
    private String id_sogg_tite;
    private String co_tp_rel_soc_te;
    private String id_rel_soc;
    private String altro_id_rel_rel_soc_tite;

    public SecondMappingEntity(String co_soc, String co_proc, String co_fis_tite, String id_sogg_tite, String co_tp_rel_soc_te, String id_rel_soc, String altro_id_rel_rel_soc_tite){
        this.co_fis_tite = co_fis_tite;
        this.co_proc = co_proc;
        this.co_soc = co_soc;
        this.altro_id_rel_rel_soc_tite = altro_id_rel_rel_soc_tite;
        this.id_rel_soc = id_rel_soc;
        this.co_tp_rel_soc_te = co_tp_rel_soc_te;
        this.id_sogg_tite = id_sogg_tite;
    }

    public String getCo_soc() {
        return co_soc;
    }

    public String getCo_proc() {
        return co_proc;
    }

    public String getCo_fis_tite() {
        return co_fis_tite;
    }

    public String getId_sogg_tite() {
        return id_sogg_tite;
    }

    public String getCo_tp_rel_soc_te() {
        return co_tp_rel_soc_te;
    }

    public String getId_rel_soc() {
        return id_rel_soc;
    }

    public String getAltro_id_rel_rel_soc_tite() {
        return altro_id_rel_rel_soc_tite;
    }
}
