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
import io.swagger.client.model.Address;
import io.swagger.client.model.BaseRequest;
import io.swagger.client.model.CustomerData;
import io.swagger.client.model.CustomerIdentificationDocument;
import java.util.ArrayList;
import java.util.List;

/**
 * VerifyCustomerReliabilityRequest
 */

public class VerifyCustomerReliabilityRequest {
  @JsonProperty("customerData")
  private CustomerData customerData = null;

  @JsonProperty("addresses")
  private List<Address> addresses = null;

  @JsonProperty("customerIdentificationDocument")
  private CustomerIdentificationDocument customerIdentificationDocument = null;

  @JsonProperty("reportTypeCode")
  private String reportTypeCode = "BasicPF2";

  public VerifyCustomerReliabilityRequest customerData(CustomerData customerData) {
    this.customerData = customerData;
    return this;
  }

   /**
   * customer Data
   * @return customerData
  **/
  @ApiModelProperty(value = "customer Data")
  public CustomerData getCustomerData() {
    return customerData;
  }

  public void setCustomerData(CustomerData customerData) {
    this.customerData = customerData;
  }

  public VerifyCustomerReliabilityRequest addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public VerifyCustomerReliabilityRequest addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public VerifyCustomerReliabilityRequest customerIdentificationDocument(CustomerIdentificationDocument customerIdentificationDocument) {
    this.customerIdentificationDocument = customerIdentificationDocument;
    return this;
  }

   /**
   * customer Data
   * @return customerIdentificationDocument
  **/
  @ApiModelProperty(value = "customer Data")
  public CustomerIdentificationDocument getCustomerIdentificationDocument() {
    return customerIdentificationDocument;
  }

  public void setCustomerIdentificationDocument(CustomerIdentificationDocument customerIdentificationDocument) {
    this.customerIdentificationDocument = customerIdentificationDocument;
  }

  public VerifyCustomerReliabilityRequest reportTypeCode(String reportTypeCode) {
    this.reportTypeCode = reportTypeCode;
    return this;
  }

   /**
   * Report type required
   * @return reportTypeCode
  **/
  @ApiModelProperty(example = "MediumPF21", value = "Report type required")
  public String getReportTypeCode() {
    return reportTypeCode;
  }

  public void setReportTypeCode(String reportTypeCode) {
    this.reportTypeCode = reportTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyCustomerReliabilityRequest verifyCustomerReliabilityRequest = (VerifyCustomerReliabilityRequest) o;
    return Objects.equals(this.customerData, verifyCustomerReliabilityRequest.customerData) &&
        Objects.equals(this.addresses, verifyCustomerReliabilityRequest.addresses) &&
        Objects.equals(this.customerIdentificationDocument, verifyCustomerReliabilityRequest.customerIdentificationDocument) &&
        Objects.equals(this.reportTypeCode, verifyCustomerReliabilityRequest.reportTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerData, addresses, customerIdentificationDocument, reportTypeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyCustomerReliabilityRequest {\n");
    
    sb.append("    customerData: ").append(toIndentedString(customerData)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    customerIdentificationDocument: ").append(toIndentedString(customerIdentificationDocument)).append("\n");
    sb.append("    reportTypeCode: ").append(toIndentedString(reportTypeCode)).append("\n");
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

