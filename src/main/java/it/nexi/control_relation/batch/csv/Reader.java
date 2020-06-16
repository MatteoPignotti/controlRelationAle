package it.nexi.control_relation.batch.csv;

import it.nexi.control_relation.batch.tableEntity.TableEntityCrif;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;

import java.util.List;

public interface Reader {
	List<TableEntityTite> readTiteCsv();
	List<TableEntityCrif> readCrifCsv();
}
