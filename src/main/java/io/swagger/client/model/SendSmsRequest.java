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
import io.swagger.client.model.BaseRequest;
import io.swagger.client.model.SmsTemplate;
import java.io.IOException;

/**
 * SendSmsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T15:49:18.314Z")
public class SendSmsRequest extends BaseRequest {
  @SerializedName("smsTemplate")
  private SmsTemplate smsTemplate = null;

  public SendSmsRequest smsTemplate(SmsTemplate smsTemplate) {
    this.smsTemplate = smsTemplate;
    return this;
  }

   /**
   * Get smsTemplate
   * @return smsTemplate
  **/
  @ApiModelProperty(required = true, value = "")
  public SmsTemplate getSmsTemplate() {
    return smsTemplate;
  }

  public void setSmsTemplate(SmsTemplate smsTemplate) {
    this.smsTemplate = smsTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSmsRequest sendSmsRequest = (SendSmsRequest) o;
    return Objects.equals(this.smsTemplate, sendSmsRequest.smsTemplate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smsTemplate, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSmsRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    smsTemplate: ").append(toIndentedString(smsTemplate)).append("\n");
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

