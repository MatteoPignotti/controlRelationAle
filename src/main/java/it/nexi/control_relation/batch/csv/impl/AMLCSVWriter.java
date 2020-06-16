package it.nexi.control_relation.batch.csv.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import it.nexi.control_relation.batch.csv.CSVWriter;
import org.apache.log4j.Logger;


/**
 * Classe che permette di scrivere un file CSV.
 * Permette di archiviare il file creato, il file creato verrà poi inviato via mail.
 */
public class AMLCSVWriter implements CSVWriter {
    
	private Path file = null;
	final Logger logger = Logger.getLogger(AMLCSVWriter.class);

	/**
	 *Costruttore entità AMLCSVWriter
	 * @param file Path del file dove verrà creato il file csv di lavoro
	 */
	public AMLCSVWriter(Path file) {
		if (null == file) {
			String msg = "File nullo. Elaborazione non effettuata.";
			throw new NullPointerException(msg);
		} else {
			this.file = file;
		}
	}

	/**
	 *Crea un file csv al path prestabilito
	 * @param list String List da passare come input da inserire all'interno del csv
	 * @return file creato
	 */
	@Override
	public File write(List<String> list) throws IOException {
		File f = file.toFile();
		String joined = String.join("\r\n", list);
		try (FileWriter csvWriter = new FileWriter(f.getAbsolutePath())) {
			csvWriter.append(joined);
			csvWriter.flush();
			logger.info("scrittura file terminata");
		} catch (IOException ioEx) {
			logger.error("scrittura file non riuscita");
			throw new IOException("Scrittura file non riuscita.");
		}
		return f;
	}


	/*@Override
	public File zipWithPassword(File file) throws IOException {
		final DateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String zipFileName = StringUtils.defaultIfEmpty(Property.get(Const.PropertyKey.ARCHIVE_PARTITE_IVA_FILE_NAME),
				"File_PIVA_Diff_" + sdf.format(Calendar.getInstance().getTime()) + "_Filtered.zip");
		ZipParameters zipParameters = new ZipParameters();
		zipParameters.setEncryptFiles(true);
		zipParameters.setEncryptionMethod(EncryptionMethod.ZIP_STANDARD);
		zipParameters.setAesKeyStrength(AesKeyStrength.KEY_STRENGTH_256);
		Path zipFilePath = Paths.get(zipFileName);
		File zipFile = zipFilePath.toFile();
		if (null != zipFile && zipFile.exists()) {
			Files.delete(zipFilePath);
		}
		new ZipFile(zipFileName, Property.get(Const.PropertyKey.ARCHIVE_OUTPUT_PASS).toCharArray()).addFile(file, zipParameters);
		return zipFile;
	}*/
}
