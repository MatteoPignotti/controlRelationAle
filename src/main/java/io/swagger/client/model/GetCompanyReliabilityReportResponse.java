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
import io.swagger.client.model.Associate;
import io.swagger.client.model.BankruptcyProceeding;
import io.swagger.client.model.BaseResponse;
import io.swagger.client.model.BeneficialOwner;
import io.swagger.client.model.Company;
import io.swagger.client.model.ErrorResult;
import io.swagger.client.model.Exponent;
import io.swagger.client.model.Rappresentative;
import io.swagger.client.model.Result;
import java.util.ArrayList;
import java.util.List;

/**
 * GetCompanyReliabilityReportResponse
 */

public class GetCompanyReliabilityReportResponse {
  @JsonProperty("result")
  private Result result = null;

  @JsonProperty("company")
  private Company company = null;

  @JsonProperty("exponents")
  private List<Exponent> exponents = null;

  @JsonProperty("beneficialOwners")
  private List<BeneficialOwner> beneficialOwners = null;

  @JsonProperty("bankruptcyProceedings")
  private List<BankruptcyProceeding> bankruptcyProceedings = null;

  @JsonProperty("associates")
  private List<Associate> associates = null;

  @JsonProperty("rappresentatives")
  private List<Rappresentative> rappresentatives = null;

  @JsonProperty("fraudRiskErrors")
  private List<ErrorResult> fraudRiskErrors = null;

  public GetCompanyReliabilityReportResponse result(Result result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public GetCompanyReliabilityReportResponse company(Company company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public GetCompanyReliabilityReportResponse exponents(List<Exponent> exponents) {
    this.exponents = exponents;
    return this;
  }

  public GetCompanyReliabilityReportResponse addExponentsItem(Exponent exponentsItem) {
    if (this.exponents == null) {
      this.exponents = new ArrayList<>();
    }
    this.exponents.add(exponentsItem);
    return this;
  }

   /**
   * Get exponents
   * @return exponents
  **/
  @ApiModelProperty(value = "")
  public List<Exponent> getExponents() {
    return exponents;
  }

  public void setExponents(List<Exponent> exponents) {
    this.exponents = exponents;
  }

  public GetCompanyReliabilityReportResponse beneficialOwners(List<BeneficialOwner> beneficialOwners) {
    this.beneficialOwners = beneficialOwners;
    return this;
  }

  public GetCompanyReliabilityReportResponse addBeneficialOwnersItem(BeneficialOwner beneficialOwnersItem) {
    if (this.beneficialOwners == null) {
      this.beneficialOwners = new ArrayList<>();
    }
    this.beneficialOwners.add(beneficialOwnersItem);
    return this;
  }

   /**
   * Get beneficialOwners
   * @return beneficialOwners
  **/
  @ApiModelProperty(value = "")
  public List<BeneficialOwner> getBeneficialOwners() {
    return beneficialOwners;
  }

  public void setBeneficialOwners(List<BeneficialOwner> beneficialOwners) {
    this.beneficialOwners = beneficialOwners;
  }

  public GetCompanyReliabilityReportResponse bankruptcyProceedings(List<BankruptcyProceeding> bankruptcyProceedings) {
    this.bankruptcyProceedings = bankruptcyProceedings;
    return this;
  }

  public GetCompanyReliabilityReportResponse addBankruptcyProceedingsItem(BankruptcyProceeding bankruptcyProceedingsItem) {
    if (this.bankruptcyProceedings == null) {
      this.bankruptcyProceedings = new ArrayList<>();
    }
    this.bankruptcyProceedings.add(bankruptcyProceedingsItem);
    return this;
  }

   /**
   * Get bankruptcyProceedings
   * @return bankruptcyProceedings
  **/
  @ApiModelProperty(value = "")
  public List<BankruptcyProceeding> getBankruptcyProceedings() {
    return bankruptcyProceedings;
  }

  public void setBankruptcyProceedings(List<BankruptcyProceeding> bankruptcyProceedings) {
    this.bankruptcyProceedings = bankruptcyProceedings;
  }

  public GetCompanyReliabilityReportResponse associates(List<Associate> associates) {
    this.associates = associates;
    return this;
  }

  public GetCompanyReliabilityReportResponse addAssociatesItem(Associate associatesItem) {
    if (this.associates == null) {
      this.associates = new ArrayList<>();
    }
    this.associates.add(associatesItem);
    return this;
  }

   /**
   * Get associates
   * @return associates
  **/
  @ApiModelProperty(value = "")
  public List<Associate> getAssociates() {
    return associates;
  }

  public void setAssociates(List<Associate> associates) {
    this.associates = associates;
  }

  public GetCompanyReliabilityReportResponse rappresentatives(List<Rappresentative> rappresentatives) {
    this.rappresentatives = rappresentatives;
    return this;
  }

  public GetCompanyReliabilityReportResponse addRappresentativesItem(Rappresentative rappresentativesItem) {
    if (this.rappresentatives == null) {
      this.rappresentatives = new ArrayList<>();
    }
    this.rappresentatives.add(rappresentativesItem);
    return this;
  }

   /**
   * Get rappresentatives
   * @return rappresentatives
  **/
  @ApiModelProperty(value = "")
  public List<Rappresentative> getRappresentatives() {
    return rappresentatives;
  }

  public void setRappresentatives(List<Rappresentative> rappresentatives) {
    this.rappresentatives = rappresentatives;
  }

  public GetCompanyReliabilityReportResponse fraudRiskErrors(List<ErrorResult> fraudRiskErrors) {
    this.fraudRiskErrors = fraudRiskErrors;
    return this;
  }

  public GetCompanyReliabilityReportResponse addFraudRiskErrorsItem(ErrorResult fraudRiskErrorsItem) {
    if (this.fraudRiskErrors == null) {
      this.fraudRiskErrors = new ArrayList<>();
    }
    this.fraudRiskErrors.add(fraudRiskErrorsItem);
    return this;
  }

   /**
   * Get fraudRiskErrors
   * @return fraudRiskErrors
  **/
  @ApiModelProperty(value = "")
  public List<ErrorResult> getFraudRiskErrors() {
    return fraudRiskErrors;
  }

  public void setFraudRiskErrors(List<ErrorResult> fraudRiskErrors) {
    this.fraudRiskErrors = fraudRiskErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCompanyReliabilityReportResponse getCompanyReliabilityReportResponse = (GetCompanyReliabilityReportResponse) o;
    return Objects.equals(this.result, getCompanyReliabilityReportResponse.result) &&
        Objects.equals(this.company, getCompanyReliabilityReportResponse.company) &&
        Objects.equals(this.exponents, getCompanyReliabilityReportResponse.exponents) &&
        Objects.equals(this.beneficialOwners, getCompanyReliabilityReportResponse.beneficialOwners) &&
        Objects.equals(this.bankruptcyProceedings, getCompanyReliabilityReportResponse.bankruptcyProceedings) &&
        Objects.equals(this.associates, getCompanyReliabilityReportResponse.associates) &&
        Objects.equals(this.rappresentatives, getCompanyReliabilityReportResponse.rappresentatives) &&
        Objects.equals(this.fraudRiskErrors, getCompanyReliabilityReportResponse.fraudRiskErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, company, exponents, beneficialOwners, bankruptcyProceedings, associates, rappresentatives, fraudRiskErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCompanyReliabilityReportResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    exponents: ").append(toIndentedString(exponents)).append("\n");
    sb.append("    beneficialOwners: ").append(toIndentedString(beneficialOwners)).append("\n");
    sb.append("    bankruptcyProceedings: ").append(toIndentedString(bankruptcyProceedings)).append("\n");
    sb.append("    associates: ").append(toIndentedString(associates)).append("\n");
    sb.append("    rappresentatives: ").append(toIndentedString(rappresentatives)).append("\n");
    sb.append("    fraudRiskErrors: ").append(toIndentedString(fraudRiskErrors)).append("\n");
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

