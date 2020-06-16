package it.nexi.control_relation.batch.dao.queryProcess;
import io.swagger.client.Configuration;
import io.swagger.client.api.CompanyReliabilityApi;
import io.swagger.client.auth.ApiKeyAuth;
import io.swagger.client.model.*;
import it.nexi.control_relation.batch.utility.ListRequestCreator;
import it.nexi.control_relation.batch.tableEntity.TableEntityTite;
import org.apache.log4j.Logger;
import io.swagger.client.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**Classe utilizzata per la gestione request-->response con Crif
 *
 */
public class RequestResponseExecutor extends Thread {
    private List<GetCompanyReliabilityReportRequest> requestList;
    private List<TableEntityTite> tbRequestList;
    private List<GetCompanyReliabilityReportResponse> respList;
    private Map<TableEntityTite, GetCompanyReliabilityReportResponse> mapRequestResponse;
    final static Logger logger = Logger.getLogger(RequestResponseExecutor.class);

    private String MT_APPLICATION = "CH"; // String | technical code of the application calling the service. Needs to be agreed with the service provider
    private String MT_USER = "MT_TEST_PASQUALE"; // String | user identifier of the request (username , userid , ...)
    private String MT_CHANNEL = "WEB"; // String | channel code of the request. Needs to be agreed with the service provider
    private String MT_COMPANY_GROUP = "NEXI"; // String | Company Group identification code. Needs to be agreed with the service provider
    private String MT_COMPANY = "NEXI"; // String | Company code. Needs to be agreed with the service provider
    private String MT_PARTNER = "NEXI"; // String | Partner belonging to the company. It describe a subset of NEXI customer related to the specified partner. Needs to be agreed with the service provider
    private String MT_REQUEST_ID ; // String | Random unique identification code of the request set by the client. Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b]
    private String MT_SESSION_ID ;


    public RequestResponseExecutor(List<TableEntityTite> tbList) {
        this.tbRequestList = tbList;
        ListRequestCreator listRequestCreator = ListRequestCreator.getInstance();
        this.requestList = listRequestCreator.createListRequest(tbList);
    }

    /**metodo che restituisce la mappa entityTite inviate e response ricevute
     *
     * @return mappa entityTite inviare e response
     */
    public Map<TableEntityTite, GetCompanyReliabilityReportResponse> getMapRequestResponse(){
        return mapRequestResponse;
    }

    private void setRequestSessionID(){
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        this.MT_REQUEST_ID = uuid1.toString(); // String | Random unique identification code of the request set by the client. Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b]
        this.MT_SESSION_ID = uuid2.toString(); // String | Random unique identification code identifying a single session of the client. Example JSESSIONID [b272023f-05ca-44cb-96cd-6d72c72d03f9]
        logger.info(this.MT_REQUEST_ID);
        logger.info(this.MT_SESSION_ID);
    }

/**metodo con il quale interagisco con l'ApiClient e creo una mappa [TableEntityTite,response]
 */
    public void run() {
        logger.info("ApiClient attivata");
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: Bearer
        ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        Bearer.setApiKeyPrefix("Token");
        CompanyReliabilityApi apiInstance = new CompanyReliabilityApi();
        mapRequestResponse = new HashMap<>();
        for (int i = 0; i < requestList.size(); i++) {
            try {
                setRequestSessionID();
                logger.info(requestList.get(i).toString());
                GetCompanyReliabilityReportResponse result = apiInstance.getCompanyReliabilityReport(MT_APPLICATION, MT_USER, MT_CHANNEL, MT_COMPANY_GROUP, MT_COMPANY, MT_PARTNER, MT_REQUEST_ID, MT_SESSION_ID, requestList.get(i));
                logger.info(result);
                mapRequestResponse.put(tbRequestList.get(i), result);
            } catch (ApiException e) {
                System.err.println("Exception when calling CompanyReliabilityApi#getCompanyReliabilityReport");
                e.printStackTrace();
            }
        }
    }
}