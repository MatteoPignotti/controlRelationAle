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
import io.swagger.client.model.CompanyBasicData;
import io.swagger.client.model.CompanyDetailsData;

/**
 * Company
 */

public class Company {
  @JsonProperty("rsd")
  private String rsd = null;

  @JsonProperty("reaCode")
  private String reaCode = null;

  @JsonProperty("cciaaProvince")
  private String cciaaProvince = null;

  @JsonProperty("fiscalCode")
  private String fiscalCode = null;

  @JsonProperty("vatNumber")
  private String vatNumber = null;

  @JsonProperty("detailsData")
  private CompanyDetailsData detailsData = null;

  public Company rsd(String rsd) {
    this.rsd = rsd;
    return this;
  }

   /**
   * company rsd
   * @return rsd
  **/
  @ApiModelProperty(example = "AIR TRADING", value = "company rsd")
  public String getRsd() {
    return rsd;
  }

  public void setRsd(String rsd) {
    this.rsd = rsd;
  }

  public Company reaCode(String reaCode) {
    this.reaCode = reaCode;
    return this;
  }

   /**
   * company rea code
   * @return reaCode
  **/
  @ApiModelProperty(example = "1607692", value = "company rea code")
  public String getReaCode() {
    return reaCode;
  }

  public void setReaCode(String reaCode) {
    this.reaCode = reaCode;
  }

  public Company cciaaProvince(String cciaaProvince) {
    this.cciaaProvince = cciaaProvince;
    return this;
  }

   /**
   * cciaa province of company
   * @return cciaaProvince
  **/
  @ApiModelProperty(example = "MI", value = "cciaa province of company")
  public String getCciaaProvince() {
    return cciaaProvince;
  }

  public void setCciaaProvince(String cciaaProvince) {
    this.cciaaProvince = cciaaProvince;
  }

  public Company fiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
    return this;
  }

   /**
   * company fiscal code
   * @return fiscalCode
  **/
  @ApiModelProperty(example = "2.403510924E9", value = "company fiscal code")
  public String getFiscalCode() {
    return fiscalCode;
  }

  public void setFiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
  }

  public Company vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * company fiscal code
   * @return vatNumber
  **/
  @ApiModelProperty(example = "2.403510924E9", value = "company fiscal code")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public Company detailsData(CompanyDetailsData detailsData) {
    this.detailsData = detailsData;
    return this;
  }

   /**
   * Get detailsData
   * @return detailsData
  **/
  @ApiModelProperty(value = "")
  public CompanyDetailsData getDetailsData() {
    return detailsData;
  }

  public void setDetailsData(CompanyDetailsData detailsData) {
    this.detailsData = detailsData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.rsd, company.rsd) &&
        Objects.equals(this.reaCode, company.reaCode) &&
        Objects.equals(this.cciaaProvince, company.cciaaProvince) &&
        Objects.equals(this.fiscalCode, company.fiscalCode) &&
        Objects.equals(this.vatNumber, company.vatNumber) &&
        Objects.equals(this.detailsData, company.detailsData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rsd, reaCode, cciaaProvince, fiscalCode, vatNumber, detailsData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    rsd: ").append(toIndentedString(rsd)).append("\n");
    sb.append("    reaCode: ").append(toIndentedString(reaCode)).append("\n");
    sb.append("    cciaaProvince: ").append(toIndentedString(cciaaProvince)).append("\n");
    sb.append("    fiscalCode: ").append(toIndentedString(fiscalCode)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    detailsData: ").append(toIndentedString(detailsData)).append("\n");
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

