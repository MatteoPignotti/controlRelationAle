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
 * Ateco 07 classification
 */
@ApiModel(description = "Ateco 07 classification")

public class Ateco07Classification {
  @JsonProperty("ateco")
  private String ateco = null;

  @JsonProperty("classification")
  private String classification = null;

  public Ateco07Classification ateco(String ateco) {
    this.ateco = ateco;
    return this;
  }

   /**
   * ateco code
   * @return ateco
  **/
  @ApiModelProperty(value = "ateco code")
  public String getAteco() {
    return ateco;
  }

  public void setAteco(String ateco) {
    this.ateco = ateco;
  }

  public Ateco07Classification classification(String classification) {
    this.classification = classification;
    return this;
  }

   /**
   * classification of ateco
   * @return classification
  **/
  @ApiModelProperty(value = "classification of ateco")
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ateco07Classification ateco07Classification = (Ateco07Classification) o;
    return Objects.equals(this.ateco, ateco07Classification.ateco) &&
        Objects.equals(this.classification, ateco07Classification.classification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ateco, classification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ateco07Classification {\n");
    
    sb.append("    ateco: ").append(toIndentedString(ateco)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
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

