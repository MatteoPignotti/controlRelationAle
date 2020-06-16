/*
 * Customer Reliability
 *  <b>Customer Reliability</b>  
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ErrorResult
 */

public class ErrorResult {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("crifErrorCode")
  private String crifErrorCode = null;

  public ErrorResult code(String code) {
    this.code = code;
    return this;
  }

   /**
   * code
   * @return code
  **/
  @ApiModelProperty(value = "code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorResult description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(value = "description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorResult type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type
   * @return type
  **/
  @ApiModelProperty(value = "type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ErrorResult crifErrorCode(String crifErrorCode) {
    this.crifErrorCode = crifErrorCode;
    return this;
  }

   /**
   * This code is generated by concatenating E + type + code. The code is padded with 0s to the left to 3 chars.
   * @return crifErrorCode
  **/
  @ApiModelProperty(value = "This code is generated by concatenating E + type + code. The code is padded with 0s to the left to 3 chars.")
  public String getCrifErrorCode() {
    return crifErrorCode;
  }

  public void setCrifErrorCode(String crifErrorCode) {
    this.crifErrorCode = crifErrorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResult errorResult = (ErrorResult) o;
    return Objects.equals(this.code, errorResult.code) &&
        Objects.equals(this.description, errorResult.description) &&
        Objects.equals(this.type, errorResult.type) &&
        Objects.equals(this.crifErrorCode, errorResult.crifErrorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, type, crifErrorCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResult {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    crifErrorCode: ").append(toIndentedString(crifErrorCode)).append("\n");
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

