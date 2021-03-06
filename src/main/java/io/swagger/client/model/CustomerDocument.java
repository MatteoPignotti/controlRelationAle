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
import io.swagger.client.model.AddressCustomerSubscription;
import io.swagger.client.model.CardId;
import io.swagger.client.model.CustomerDataSubscription;
import io.swagger.client.model.CustomerDocumentSubscription;

/**
 * CustomerDocument
 */

public class CustomerDocument {
  @JsonProperty("cardId")
  private CardId cardId = null;

  @JsonProperty("customerDataSubscription")
  private CustomerDataSubscription customerDataSubscription = null;

  @JsonProperty("customerDocumentSubscription")
  private CustomerDocumentSubscription customerDocumentSubscription = null;

  @JsonProperty("address")
  private AddressCustomerSubscription address = null;

  public CustomerDocument cardId(CardId cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/
  @ApiModelProperty(value = "")
  public CardId getCardId() {
    return cardId;
  }

  public void setCardId(CardId cardId) {
    this.cardId = cardId;
  }

  public CustomerDocument customerDataSubscription(CustomerDataSubscription customerDataSubscription) {
    this.customerDataSubscription = customerDataSubscription;
    return this;
  }

   /**
   * Get customerDataSubscription
   * @return customerDataSubscription
  **/
  @ApiModelProperty(value = "")
  public CustomerDataSubscription getCustomerDataSubscription() {
    return customerDataSubscription;
  }

  public void setCustomerDataSubscription(CustomerDataSubscription customerDataSubscription) {
    this.customerDataSubscription = customerDataSubscription;
  }

  public CustomerDocument customerDocumentSubscription(CustomerDocumentSubscription customerDocumentSubscription) {
    this.customerDocumentSubscription = customerDocumentSubscription;
    return this;
  }

   /**
   * Get customerDocumentSubscription
   * @return customerDocumentSubscription
  **/
  @ApiModelProperty(value = "")
  public CustomerDocumentSubscription getCustomerDocumentSubscription() {
    return customerDocumentSubscription;
  }

  public void setCustomerDocumentSubscription(CustomerDocumentSubscription customerDocumentSubscription) {
    this.customerDocumentSubscription = customerDocumentSubscription;
  }

  public CustomerDocument address(AddressCustomerSubscription address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public AddressCustomerSubscription getAddress() {
    return address;
  }

  public void setAddress(AddressCustomerSubscription address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDocument customerDocument = (CustomerDocument) o;
    return Objects.equals(this.cardId, customerDocument.cardId) &&
        Objects.equals(this.customerDataSubscription, customerDocument.customerDataSubscription) &&
        Objects.equals(this.customerDocumentSubscription, customerDocument.customerDocumentSubscription) &&
        Objects.equals(this.address, customerDocument.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, customerDataSubscription, customerDocumentSubscription, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDocument {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    customerDataSubscription: ").append(toIndentedString(customerDataSubscription)).append("\n");
    sb.append("    customerDocumentSubscription: ").append(toIndentedString(customerDocumentSubscription)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

