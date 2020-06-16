package io.swagger.client.model;

import java.io.IOException;


import it.nexi.control_relation.batch.utility.Const;
import it.nexi.control_relation.batch.utility.Property;
import org.apache.log4j.Logger;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.NotificationApi;



import static it.nexi.control_relation.batch.utility.Const.SendMailKeyConstants.*;


public class CustomEmailMessenger implements EmailMessenger {
    private static final Logger LOG = Logger.getLogger(CustomEmailMessenger.class);



    @Override
    public void send(CustomEmailTemplate emailTemplate) throws IOException {
            ApiClient apiClient = new ApiClient();
            apiClient.setBasePath(Property.get(MTSERVICES_NOTIFICATION_ENDPOINT));
            boolean isSSLCheckActive = Boolean.parseBoolean(Property.get(Const.PropertyKey.VERIFYING_SSL));
            apiClient.setVerifyingSsl(isSSLCheckActive);
            NotificationApi apiInstance = new NotificationApi(apiClient);
            SendEmailRequest sendEmailRequest = new SendEmailRequest();
            sendEmailRequest.emailTemplate(emailTemplate.getEmailTemplate());
            try {
                LOG.info("Invio email in corso...");
                // @formatter:off
                SendEmailResponse result;
                result = apiInstance.sendEmail(sendEmailRequest,
                        Property.get(MT_APPLICATION),
                        Property.get(MT_USER),
                        Property.get(MT_CHANNEL),
                        Property.get(MT_COMPANY_GROUP),
                        Property.get(MT_COMPANY),
                        Property.get(MT_REQUEST_ID),
                        Property.get(MT_PARTNER),
                        Property.get(MT_SESSION_ID));
                LOG.info(String.format("Esito invio email -> code: %s - description: %s", result.getResult().getCode() , result.getResult().getDescription()));
                // @formatter:on
            } catch (ApiException e) {
                LOG.error("Eccezione sollevata in CustomEmailMessenger#send", e);
            }
        }
    }


