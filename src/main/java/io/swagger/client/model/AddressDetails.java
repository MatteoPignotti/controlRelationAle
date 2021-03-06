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
 * AddressDetails
 */

public class AddressDetails {
  @JsonProperty("municipality")
  private String municipality = null;

  @JsonProperty("citizenship")
  private String citizenship = null;

  @JsonProperty("others")
  private String others = null;

  public AddressDetails municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * municipality
   * @return municipality
  **/
  @ApiModelProperty(value = "municipality")
  public String getMunicipality() {
    return municipality;
  }

  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  public AddressDetails citizenship(String citizenship) {
    this.citizenship = citizenship;
    return this;
  }

   /**
   * citizenship
   * @return citizenship
  **/
  @ApiModelProperty(value = "citizenship")
  public String getCitizenship() {
    return citizenship;
  }

  public void setCitizenship(String citizenship) {
    this.citizenship = citizenship;
  }

  public AddressDetails others(String others) {
    this.others = others;
    return this;
  }

   /**
   * other information about address
   * @return others
  **/
  @ApiModelProperty(value = "other information about address")
  public String getOthers() {
    return others;
  }

  public void setOthers(String others) {
    this.others = others;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDetails addressDetails = (AddressDetails) o;
    return Objects.equals(this.municipality, addressDetails.municipality) &&
        Objects.equals(this.citizenship, addressDetails.citizenship) &&
        Objects.equals(this.others, addressDetails.others);
  }

  @Override
  public int hashCode() {
    return Objects.hash(municipality, citizenship, others);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDetails {\n");
    
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    citizenship: ").append(toIndentedString(citizenship)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
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

