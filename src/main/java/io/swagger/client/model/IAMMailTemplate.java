package io.swagger.client.model;

import com.squareup.okhttp.MediaType;
import it.nexi.control_relation.batch.utility.Const;
import it.nexi.control_relation.batch.utility.Property;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import static it.nexi.control_relation.batch.utility.Const.PropertyKey.SEMICOLON;


public class IAMMailTemplate implements CustomEmailTemplate {
    private Path iamFile;


    public IAMMailTemplate(Path iamFile) {
        this.iamFile = iamFile;
    }

    @Override
    public EmailTemplate getEmailTemplate() throws IOException {
        String[] toMailAddresses = Property.get(Const.PropertyKey.IAM_TO_RECEIVING_MAIL_ADDRESSES).split(SEMICOLON);
        List<Recipient> toRecipients = new ArrayList<>();
        for (String addr : toMailAddresses) {
            if (!addr.isEmpty()) {
                toRecipients.add(new Recipient().address(addr));
            }
        }
        String[] ccMailAddresses = Property.get(Const.PropertyKey.IAM_CC_RECEIVING_MAIL_ADDRESSES).split(SEMICOLON);
        List<Recipient> ccRecipients = new ArrayList<>();
        for (String addr : ccMailAddresses) {
            if (!addr.isEmpty()) {
                ccRecipients.add(new Recipient().address(addr));
            }
        }
        String from = Property.get(Const.PropertyKey.IAM_SENDER_MAIL_ADDRESS);
        String alias = Property.get(Const.PropertyKey.IAM_MAIL_ALIAS);
        String subject = Property.get(Const.PropertyKey.IAM_MAIL_SUBJECT);
        String body = Property.get(Const.PropertyKey.IAM_MAIL_BODY);
        EmailTemplate emailTemplate = new EmailTemplate();
        if (!toRecipients.isEmpty()) {
            emailTemplate.setTo(toRecipients);
        }
        emailTemplate.setFrom(new Recipient().address(from).alias(alias));
        if (!ccRecipients.isEmpty()) {
            emailTemplate.setCc(ccRecipients);
        }
        emailTemplate.setSubject(subject);
        emailTemplate.setBody("Tabella report");
        Attachment attachment = new Attachment();
        attachment.setByteStream(Base64.getEncoder().encodeToString(Files.readAllBytes(iamFile.toFile().toPath())));
        attachment.contentType("mediaType");
        attachment.setName(iamFile.toFile().getName());
        emailTemplate.setAttachments(Arrays.asList(attachment));
        return emailTemplate;
    }

}