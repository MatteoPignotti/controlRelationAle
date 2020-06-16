/*
 * Notification API
 * <b>Notification</b>  
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Attachment;
import io.swagger.client.model.Recipient;
import io.swagger.client.model.TemplateValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EmailTemplate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T15:49:18.314Z")
public class EmailTemplate {
  @SerializedName("from")
  private Recipient from = null;

  @SerializedName("to")
  private List<Recipient> to = null;

  @SerializedName("cc")
  private List<Recipient> cc = null;

  @SerializedName("bcc")
  private List<Recipient> bcc = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("attachments")
  private List<Attachment> attachments = null;

  @SerializedName("templateId")
  private String templateId = null;

  @SerializedName("templateValues")
  private List<TemplateValue> templateValues = null;

  @SerializedName("flagTrack")
  private Boolean flagTrack = false;

  @SerializedName("emailTag")
  private String emailTag = null;

  /**
   * If the bodyTransferEncoding is present and his value is BASE64 we must decode the base64 body before to send it with the email.
   */
  @JsonAdapter(BodyTransferEncodingEnum.Adapter.class)
  public enum BodyTransferEncodingEnum {
    NO_ENCODING("NO_ENCODING"),
    
    BASE64("BASE64");

    private String value;

    BodyTransferEncodingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BodyTransferEncodingEnum fromValue(String text) {
      for (BodyTransferEncodingEnum b : BodyTransferEncodingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BodyTransferEncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BodyTransferEncodingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BodyTransferEncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BodyTransferEncodingEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("bodyTransferEncoding")
  private BodyTransferEncodingEnum bodyTransferEncoding = null;

  @SerializedName("replyTo")
  private List<Recipient> replyTo = null;

  public EmailTemplate from(Recipient from) {
    this.from = from;
    return this;
  }

   /**
   * email sender
   * @return from
  **/
  @ApiModelProperty(value = "email sender")
  public Recipient getFrom() {
    return from;
  }

  public void setFrom(Recipient from) {
    this.from = from;
  }

  public EmailTemplate to(List<Recipient> to) {
    this.to = to;
    return this;
  }

  public EmailTemplate addToItem(Recipient toItem) {
    if (this.to == null) {
      this.to = new ArrayList<Recipient>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * email \&quot;to\&quot; recipients
   * @return to
  **/
  @ApiModelProperty(value = "email \"to\" recipients")
  public List<Recipient> getTo() {
    return to;
  }

  public void setTo(List<Recipient> to) {
    this.to = to;
  }

  public EmailTemplate cc(List<Recipient> cc) {
    this.cc = cc;
    return this;
  }

  public EmailTemplate addCcItem(Recipient ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<Recipient>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * email \&quot;cc\&quot; recipients
   * @return cc
  **/
  @ApiModelProperty(value = "email \"cc\" recipients")
  public List<Recipient> getCc() {
    return cc;
  }

  public void setCc(List<Recipient> cc) {
    this.cc = cc;
  }

  public EmailTemplate bcc(List<Recipient> bcc) {
    this.bcc = bcc;
    return this;
  }

  public EmailTemplate addBccItem(Recipient bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<Recipient>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * email \&quot;bcc\&quot; recipients
   * @return bcc
  **/
  @ApiModelProperty(value = "email \"bcc\" recipients")
  public List<Recipient> getBcc() {
    return bcc;
  }

  public void setBcc(List<Recipient> bcc) {
    this.bcc = bcc;
  }

  public EmailTemplate subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * email subject
   * @return subject
  **/
  @ApiModelProperty(value = "email subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public EmailTemplate body(String body) {
    this.body = body;
    return this;
  }

   /**
   * email body (html format supported)
   * @return body
  **/
  @ApiModelProperty(value = "email body (html format supported)")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public EmailTemplate attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EmailTemplate addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "attachments")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public EmailTemplate templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * email template id; if is set the body and subject field will be ignored.
   * @return templateId
  **/
  @ApiModelProperty(value = "email template id; if is set the body and subject field will be ignored.")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public EmailTemplate templateValues(List<TemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  public EmailTemplate addTemplateValuesItem(TemplateValue templateValuesItem) {
    if (this.templateValues == null) {
      this.templateValues = new ArrayList<TemplateValue>();
    }
    this.templateValues.add(templateValuesItem);
    return this;
  }

   /**
   * email key-value pair placeholders
   * @return templateValues
  **/
  @ApiModelProperty(value = "email key-value pair placeholders")
  public List<TemplateValue> getTemplateValues() {
    return templateValues;
  }

  public void setTemplateValues(List<TemplateValue> templateValues) {
    this.templateValues = templateValues;
  }

  public EmailTemplate flagTrack(Boolean flagTrack) {
    this.flagTrack = flagTrack;
    return this;
  }

   /**
   * flag indicating if the email has to be tracked (true) or not (false). If null the mail will be not tracked.
   * @return flagTrack
  **/
  @ApiModelProperty(value = "flag indicating if the email has to be tracked (true) or not (false). If null the mail will be not tracked.")
  public Boolean isFlagTrack() {
    return flagTrack;
  }

  public void setFlagTrack(Boolean flagTrack) {
    this.flagTrack = flagTrack;
  }

  public EmailTemplate emailTag(String emailTag) {
    this.emailTag = emailTag;
    return this;
  }

   /**
   * tag filled by the client in order to identify the email tracked
   * @return emailTag
  **/
  @ApiModelProperty(value = "tag filled by the client in order to identify the email tracked")
  public String getEmailTag() {
    return emailTag;
  }

  public void setEmailTag(String emailTag) {
    this.emailTag = emailTag;
  }

  public EmailTemplate bodyTransferEncoding(BodyTransferEncodingEnum bodyTransferEncoding) {
    this.bodyTransferEncoding = bodyTransferEncoding;
    return this;
  }

   /**
   * If the bodyTransferEncoding is present and his value is BASE64 we must decode the base64 body before to send it with the email.
   * @return bodyTransferEncoding
  **/
  @ApiModelProperty(value = "If the bodyTransferEncoding is present and his value is BASE64 we must decode the base64 body before to send it with the email.")
  public BodyTransferEncodingEnum getBodyTransferEncoding() {
    return bodyTransferEncoding;
  }

  public void setBodyTransferEncoding(BodyTransferEncodingEnum bodyTransferEncoding) {
    this.bodyTransferEncoding = bodyTransferEncoding;
  }

  public EmailTemplate replyTo(List<Recipient> replyTo) {
    this.replyTo = replyTo;
    return this;
  }

  public EmailTemplate addReplyToItem(Recipient replyToItem) {
    if (this.replyTo == null) {
      this.replyTo = new ArrayList<Recipient>();
    }
    this.replyTo.add(replyToItem);
    return this;
  }

   /**
   * email \&quot;replyTo\&quot; recipients
   * @return replyTo
  **/
  @ApiModelProperty(value = "email \"replyTo\" recipients")
  public List<Recipient> getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(List<Recipient> replyTo) {
    this.replyTo = replyTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailTemplate emailTemplate = (EmailTemplate) o;
    return Objects.equals(this.from, emailTemplate.from) &&
        Objects.equals(this.to, emailTemplate.to) &&
        Objects.equals(this.cc, emailTemplate.cc) &&
        Objects.equals(this.bcc, emailTemplate.bcc) &&
        Objects.equals(this.subject, emailTemplate.subject) &&
        Objects.equals(this.body, emailTemplate.body) &&
        Objects.equals(this.attachments, emailTemplate.attachments) &&
        Objects.equals(this.templateId, emailTemplate.templateId) &&
        Objects.equals(this.templateValues, emailTemplate.templateValues) &&
        Objects.equals(this.flagTrack, emailTemplate.flagTrack) &&
        Objects.equals(this.emailTag, emailTemplate.emailTag) &&
        Objects.equals(this.bodyTransferEncoding, emailTemplate.bodyTransferEncoding) &&
        Objects.equals(this.replyTo, emailTemplate.replyTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, cc, bcc, subject, body, attachments, templateId, templateValues, flagTrack, emailTag, bodyTransferEncoding, replyTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailTemplate {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateValues: ").append(toIndentedString(templateValues)).append("\n");
    sb.append("    flagTrack: ").append(toIndentedString(flagTrack)).append("\n");
    sb.append("    emailTag: ").append(toIndentedString(emailTag)).append("\n");
    sb.append("    bodyTransferEncoding: ").append(toIndentedString(bodyTransferEncoding)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

