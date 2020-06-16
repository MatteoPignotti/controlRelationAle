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
import io.swagger.client.model.AnnualRevenue;
import java.util.ArrayList;
import java.util.List;

/**
 * Balance
 */

public class Balance {
  @JsonProperty("balanceSheet")
  private List<AnnualRevenue> balanceSheet = null;

  @JsonProperty("annualRevenue")
  private List<AnnualRevenue> annualRevenue = null;

  @JsonProperty("profits")
  private List<AnnualRevenue> profits = null;

  @JsonProperty("profitMargins")
  private List<AnnualRevenue> profitMargins = null;

  @JsonProperty("stockholdersEquity")
  private List<AnnualRevenue> stockholdersEquity = null;

  @JsonProperty("operatingRevenues")
  private List<AnnualRevenue> operatingRevenues = null;

  public Balance balanceSheet(List<AnnualRevenue> balanceSheet) {
    this.balanceSheet = balanceSheet;
    return this;
  }

  public Balance addBalanceSheetItem(AnnualRevenue balanceSheetItem) {
    if (this.balanceSheet == null) {
      this.balanceSheet = new ArrayList<>();
    }
    this.balanceSheet.add(balanceSheetItem);
    return this;
  }

   /**
   * Get balanceSheet
   * @return balanceSheet
  **/
  @ApiModelProperty(value = "")
  public List<AnnualRevenue> getBalanceSheet() {
    return balanceSheet;
  }

  public void setBalanceSheet(List<AnnualRevenue> balanceSheet) {
    this.balanceSheet = balanceSheet;
  }

  public Balance annualRevenue(List<AnnualRevenue> annualRevenue) {
    this.annualRevenue = annualRevenue;
    return this;
  }

  public Balance addAnnualRevenueItem(AnnualRevenue annualRevenueItem) {
    if (this.annualRevenue == null) {
      this.annualRevenue = new ArrayList<>();
    }
    this.annualRevenue.add(annualRevenueItem);
    return this;
  }

   /**
   * Get annualRevenue
   * @return annualRevenue
  **/
  @ApiModelProperty(value = "")
  public List<AnnualRevenue> getAnnualRevenue() {
    return annualRevenue;
  }

  public void setAnnualRevenue(List<AnnualRevenue> annualRevenue) {
    this.annualRevenue = annualRevenue;
  }

  public Balance profits(List<AnnualRevenue> profits) {
    this.profits = profits;
    return this;
  }

  public Balance addProfitsItem(AnnualRevenue profitsItem) {
    if (this.profits == null) {
      this.profits = new ArrayList<>();
    }
    this.profits.add(profitsItem);
    return this;
  }

   /**
   * Get profits
   * @return profits
  **/
  @ApiModelProperty(value = "")
  public List<AnnualRevenue> getProfits() {
    return profits;
  }

  public void setProfits(List<AnnualRevenue> profits) {
    this.profits = profits;
  }

  public Balance profitMargins(List<AnnualRevenue> profitMargins) {
    this.profitMargins = profitMargins;
    return this;
  }

  public Balance addProfitMarginsItem(AnnualRevenue profitMarginsItem) {
    if (this.profitMargins == null) {
      this.profitMargins = new ArrayList<>();
    }
    this.profitMargins.add(profitMarginsItem);
    return this;
  }

   /**
   * Get profitMargins
   * @return profitMargins
  **/
  @ApiModelProperty(value = "")
  public List<AnnualRevenue> getProfitMargins() {
    return profitMargins;
  }

  public void setProfitMargins(List<AnnualRevenue> profitMargins) {
    this.profitMargins = profitMargins;
  }

  public Balance stockholdersEquity(List<AnnualRevenue> stockholdersEquity) {
    this.stockholdersEquity = stockholdersEquity;
    return this;
  }

  public Balance addStockholdersEquityItem(AnnualRevenue stockholdersEquityItem) {
    if (this.stockholdersEquity == null) {
      this.stockholdersEquity = new ArrayList<>();
    }
    this.stockholdersEquity.add(stockholdersEquityItem);
    return this;
  }

   /**
   * Get stockholdersEquity
   * @return stockholdersEquity
  **/
  @ApiModelProperty(value = "")
  public List<AnnualRevenue> getStockholdersEquity() {
    return stockholdersEquity;
  }

  public void setStockholdersEquity(List<AnnualRevenue> stockholdersEquity) {
    this.stockholdersEquity = stockholdersEquity;
  }

  public Balance operatingRevenues(List<AnnualRevenue> operatingRevenues) {
    this.operatingRevenues = operatingRevenues;
    return this;
  }

  public Balance addOperatingRevenuesItem(AnnualRevenue operatingRevenuesItem) {
    if (this.operatingRevenues == null) {
      this.operatingRevenues = new ArrayList<>();
    }
    this.operatingRevenues.add(operatingRevenuesItem);
    return this;
  }

   /**
   * Get operatingRevenues
   * @return operatingRevenues
  **/
  @ApiModelProperty(value = "")
  public List<AnnualRevenue> getOperatingRevenues() {
    return operatingRevenues;
  }

  public void setOperatingRevenues(List<AnnualRevenue> operatingRevenues) {
    this.operatingRevenues = operatingRevenues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.balanceSheet, balance.balanceSheet) &&
        Objects.equals(this.annualRevenue, balance.annualRevenue) &&
        Objects.equals(this.profits, balance.profits) &&
        Objects.equals(this.profitMargins, balance.profitMargins) &&
        Objects.equals(this.stockholdersEquity, balance.stockholdersEquity) &&
        Objects.equals(this.operatingRevenues, balance.operatingRevenues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceSheet, annualRevenue, profits, profitMargins, stockholdersEquity, operatingRevenues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    balanceSheet: ").append(toIndentedString(balanceSheet)).append("\n");
    sb.append("    annualRevenue: ").append(toIndentedString(annualRevenue)).append("\n");
    sb.append("    profits: ").append(toIndentedString(profits)).append("\n");
    sb.append("    profitMargins: ").append(toIndentedString(profitMargins)).append("\n");
    sb.append("    stockholdersEquity: ").append(toIndentedString(stockholdersEquity)).append("\n");
    sb.append("    operatingRevenues: ").append(toIndentedString(operatingRevenues)).append("\n");
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

