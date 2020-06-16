package it.nexi.control_relation.batch.processor;

import io.swagger.client.model.*;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;



public interface BatchProcessor {
	void process(Properties properties) throws IOException;
	Map<TableEntityTite,GetCompanyReliabilityReportResponse> getMap();
}
