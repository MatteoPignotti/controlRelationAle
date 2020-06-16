package it.nexi.control_relation.batch.processor;
import io.swagger.client.model.CustomEmailMessenger;
import io.swagger.client.model.EmailMessenger;
import io.swagger.client.model.IAMMailTemplate;
import it.nexi.control_relation.batch.csv.impl.AMLCSVWriter;
import it.nexi.control_relation.batch.utility.ReportCreator;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

/**
 *
 * Rappresenta la classe di lavoro del processo di invio Emil
 */
public class SendEmailReportProcess extends Thread {

    final static Logger logger = Logger.getLogger(SendEmailReportProcess.class);
    private Properties properties;
    private Path outputFile;
    private List<String> reportRecord;    //private ApiClient apiIstance;

    public SendEmailReportProcess(Properties props) {
        this.properties = props;
        this.outputFile = Paths.get(properties.getProperty("path.outputReport.csv"));
    }

    private void writeCsv(List<String> list){
        logger.info("Creazione csv locale: ---> "+ outputFile.toString());
        AMLCSVWriter csvW = new AMLCSVWriter(outputFile);
        try {
            csvW.write(list);
        }catch (IOException io){
            logger.info(io);
        }
        logger.info("scritttura avvenuta correttamente");
    }

    private void sendEmail(){
        EmailMessenger mailMessenger = new CustomEmailMessenger();
        try{
            sendMessageToIAM(outputFile, mailMessenger);
            logger.info("tabella report inviata correttamente");
        }catch (IOException io){
            logger.info("errore trasmissione file di report "+io);
        }
    }

    private void sendMessageToIAM(Path outputFile, EmailMessenger mailMessenger) throws IOException {
        mailMessenger.send(new IAMMailTemplate(outputFile));
    }

    /**
     * Metodo di esecuzione del thread di invio Mail
     */
    public void run() {
        // invio mail di report con allegato l'intera tabella blacklist
        logger.info("Preparazione file csv da mandare");
        ReportCreator reportCreator = new ReportCreator();
        reportRecord = reportCreator.run(properties);
        writeCsv(reportRecord);
        sendEmail();
    }
}
