package it.nexi.control_relation.batch.tableEntity;

public class TableEntityReport {
    private TableEntityTite tbTite = null;
    private String codResponse = null;
    private String description = null;
    private String toString = null;

    public TableEntityReport(TableEntityTite tbTite, String codResponse, String description, String toString ){
        this.codResponse = codResponse;
        this.description = description;
        this.toString = toString;
        this.tbTite = tbTite;
    }

    public String toString(){
        return tbTite.co_soc+";"+tbTite.co_proc+";"+tbTite.co_piva+";"+tbTite.co_fis_soc+";"+tbTite.id_sogg_soc+";"+tbTite.fl_elaborato+";"+tbTite.dt_ins+";"
                +codResponse+";"+description+";"+toString+";";
    }

}
