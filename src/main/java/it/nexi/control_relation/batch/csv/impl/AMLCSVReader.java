package it.nexi.control_relation.batch.csv.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import it.nexi.control_relation.batch.csv.Reader;
import it.nexi.control_relation.batch.tableEntity.TableEntityCrif;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;
import org.apache.log4j.Logger;

import java.io.IOException;


public class AMLCSVReader implements Reader {
	private Path file = null;
	final static Logger logger = Logger.getLogger(AMLCSVReader.class);

	/**
	 *Costruttore entità AMLCSVReader
	 * @param file Path del file dove verrà letto il file csv di lavoro
	 */
	public AMLCSVReader(Path file) {
		if (null == file) {
			throw new NullPointerException("File nullo. Elaborazione non effettuata.");
		} else {
			this.file = file;
		}
	}

	/**
	 *Metodo per creare un'entità TableEntityTite a partire da una riga del csv passato come input al costruttore
	 * @param rows List di TableEntityTite
	 */
        @Override
	public List<TableEntityTite> readTiteCsv(){
		List<TableEntityTite> rows = new ArrayList<TableEntityTite>();
                String row = null;
				logger.info("lettura del file.....");
                try (BufferedReader csvReader = new BufferedReader(new FileReader(file.toString()))) {
                while ((row = csvReader.readLine()) != null) {
                    TableEntityTite TempEntity = new TableEntityTite(row);
                    rows.add(TempEntity);
                }
                logger.info("lettura avvenuta con successo");
                }catch (IOException e) {
			logger.info("qualcosa nella lettura del file csv per l'update è andato storto, nessuna entità inserita");
			System.exit(-1);
		}
		return rows;
	}
	public List<TableEntityCrif> readCrifCsv(){
		List<TableEntityCrif> rows = new ArrayList<TableEntityCrif>();
		String row = null;
		try (BufferedReader csvReader = new BufferedReader(new FileReader(file.toString()))) {
			while ((row = csvReader.readLine()) != null) {
				TableEntityCrif TempEntity = new TableEntityCrif(row);
				rows.add(TempEntity);
			}
		}catch (IOException e) {
			System.out.println("qualcosa nella lettura è andatao storto");
		}
		return rows;
	}
}
