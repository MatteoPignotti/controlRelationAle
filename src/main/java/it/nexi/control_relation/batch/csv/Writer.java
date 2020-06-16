package it.nexi.control_relation.batch.csv;

import java.io.File;
import java.io.IOException;
import java.util.List;


public interface Writer {
	File write(List<String> list) throws IOException;
}
