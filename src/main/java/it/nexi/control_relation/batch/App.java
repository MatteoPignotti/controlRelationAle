/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.nexi.control_relation.batch;

import java.io.IOException;


import it.nexi.control_relation.batch.processor.BatchProcessor;
import it.nexi.control_relation.batch.processor.RelationControlProcessor;
import it.nexi.control_relation.batch.processor.SendEmailReportProcess;
import it.nexi.control_relation.batch.utility.Utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



import java.io.FileInputStream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

/**
 *
 * @author Matte
 */
public class App {

	final static Logger logger = Logger.getLogger(App.class);
    public static void main(String args[]) throws Exception {
        if (1 == args.length || args.length>3) {
			logger.info("File .properties di configurazione mancanti o errari.");
			System.exit(-1);
        }

        Properties properties = new Properties();
        loadFileConfig(args[0], properties);
        PropertyConfigurator.configure(args[1]);
        logger.info("file di properties caricati correttamente...");
		logger.info("creo cartelle input/output...");
        createDirectories(properties);
        BatchProcessor processor = RelationControlProcessor.getInstance();
        processor.process(properties);
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println(now.getDayOfMonth());
        if((args.length == 3 && args[2].equals("report")) || now.getDayOfMonth()==14 || now.getDayOfMonth()==28){
			SendEmailReportProcess emailProcess = new SendEmailReportProcess(properties);
			emailProcess.run();
		}*/
    }
    
    
        


    
private static void loadFileConfig(String s, Properties properties) {
		try {
			if (s.equals("")) {
				throw new IOException();
			}
                        FileInputStream fis = new FileInputStream(s);
			properties.load(fis);
		} catch (IOException e) {
			System.out.println("File .properties non caricati correttamente.");
			System.exit(-1);
		}
	}

private static void createDirectories(Properties properties) {
		String input = properties.getProperty("path.input");
		String output = properties.getProperty("path.output");
		// @formatter:off
		if (!input.endsWith("/")) { input = input.concat("/"); }
		if (!output.endsWith("/")) { output = output.concat("/"); }
		// @formatter:on
		Utility.createFolderTree(input);
		Utility.createFolderTree(output);

	}
}
