package it.nexi.control_relation.batch.utility;

import it.nexi.control_relation.batch.tableEntity.TableEntityTite;
import io.swagger.client.model.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static it.nexi.control_relation.batch.utility.Const.PropertyKey.UNDERSCORE;

/**
 *Classe utility da utilizzata per semplificare conversioni di Liste, crezione directory path...etc
 * @param dirs Stringa di specifica
 */
public final class Utility {


	private Utility() {
	}


	/**
	 *Metodo che crea la struttura della directory da una stringa
	 * @param dirs Stringa di specifica
	 */
	public static void createFolderTree(String... dirs) {
		for (int i = 0; i < dirs.length; i++) {
			File file = new File(dirs[i]);
			if (!file.exists()) {
				file.mkdirs();
			}
		}
	}

	/**
	 * Trova il file avente il nome passato come argomento nel path fornito.
	 * Restituisce il path completo.
	 * @param path
	 * @param filename
	 * @return
	 */
	public static Path findFilePath(String path, String filename) {
		Path toReturn = null;
		List<Path> files = null;
		try (Stream<Path> stream = Files.list(Paths.get(path))) {
			files = stream.filter(Files::isRegularFile).sorted().collect(Collectors.toList());
			for (Path file : files) {
				if (filename.equals(file.getFileName().toString())) {
					toReturn = file;
					break;
				}
			}
			if (files.isEmpty()) {
				toReturn = Files.createFile(Paths.get(path + "/token"));
			}
		} catch (IOException e) {
			System.exit(-1);
		}
		return toReturn;
	}

	/**
	 * Crea e restituisce l'oggetto Path.
	 * @param path
	 * @param filename
	 * @param fileExtension
	 * @return
	 */
	public static Path getOutputFile(Path path, String filename, String fileExtension) {
		final DateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
		File toWrite = new File(filename + UNDERSCORE + sdf.format(Calendar.getInstance().getTime()) + fileExtension);
		return Paths.get(path.toString(), toWrite.toPath().toString());
	}

	/**
	 * Converte una mappa(TITE,RESPONSE) in una lista di stringhe in formato ReportEntity
	 * @param path
	 * @param filename
	 * @param fileExtension
	 * @return
	 */
	public static List<String> entityReportToString (Map<TableEntityTite, GetCompanyReliabilityReportResponse> map){
		List<String> mapToString = new ArrayList<>();
		String temp;
		for (Map.Entry<TableEntityTite,GetCompanyReliabilityReportResponse> entry : map.entrySet()){
			temp=entry.getKey().entityToString()+entry.getValue().getResult().getCode()+";"+entry.getValue().getResult().getDescription()+
					";"+entry.getValue().getResult().toString();
			mapToString.add(temp);
		}
		return mapToString;
	}

}
