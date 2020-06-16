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
import io.swagger.client.model.AddressExtended;
import io.swagger.client.model.Amount;
import io.swagger.client.model.CompanyBasicData;
import io.swagger.client.model.CustomerData;

/**
 * Associate
 */

public class Associate {
  @JsonProperty("crifNumber")
  private String crifNumber = null;

  @JsonProperty("companyInfo")
  private CompanyBasicData companyInfo = null;

  @JsonProperty("companyAddress")
  private Address companyAddress = null;

  @JsonProperty("anagraphicalData")
  private CustomerData anagraphicalData = null;

  @JsonProperty("address")
  private AddressExtended address = null;

  @JsonProperty("shareCapital")
  private Amount shareCapital = null;

  @JsonProperty("companyFilingDate")
  private String companyFilingDate = null;

  @JsonProperty("ownershipType")
  private String ownershipType = null;

  @JsonProperty("capitalStake")
  private Amount capitalStake = null;

  @JsonProperty("capitalStakePercentage")
  private String capitalStakePercentage = null;

  @JsonProperty("flagPrejudicialDeeds")
  private Boolean flagPrejudicialDeeds = null;

  @JsonProperty("flagProtests")
  private Boolean flagProtests = null;

  @JsonProperty("flagExistBankruptcyProceedings.")
  private Boolean flagExistBankruptcyProceedings_ = null;

  @JsonProperty("flagExistPrejudicialDeeds")
  private Boolean flagExistPrejudicialDeeds = null;

  @JsonProperty("flagExistVerifiedProtests")
  private Boolean flagExistVerifiedProtests = null;

  @JsonProperty("flagExistHomonimousProtests")
  private Boolean flagExistHomonimousProtests = null;

  @JsonProperty("flagExistNews")
  private Boolean flagExistNews = null;

  public Associate crifNumber(String crifNumber) {
    this.crifNumber = crifNumber;
    return this;
  }

   /**
   * crif number
   * @return crifNumber
  **/
  @ApiModelProperty(example = "12345", value = "crif number")
  public String getCrifNumber() {
    return crifNumber;
  }

  public void setCrifNumber(String crifNumber) {
    this.crifNumber = crifNumber;
  }

  public Associate companyInfo(CompanyBasicData companyInfo) {
    this.companyInfo = companyInfo;
    return this;
  }

   /**
   * Get companyInfo
   * @return companyInfo
  **/
  @ApiModelProperty(value = "")
  public CompanyBasicData getCompanyInfo() {
    return companyInfo;
  }

  public void setCompanyInfo(CompanyBasicData companyInfo) {
    this.companyInfo = companyInfo;
  }

  public Associate companyAddress(Address companyAddress) {
    this.companyAddress = companyAddress;
    return this;
  }

   /**
   * Get companyAddress
   * @return companyAddress
  **/
  @ApiModelProperty(value = "")
  public Address getCompanyAddress() {
    return companyAddress;
  }

  public void setCompanyAddress(Address companyAddress) {
    this.companyAddress = companyAddress;
  }

  public Associate anagraphicalData(CustomerData anagraphicalData) {
    this.anagraphicalData = anagraphicalData;
    return this;
  }

   /**
   * Get anagraphicalData
   * @return anagraphicalData
  **/
  @ApiModelProperty(value = "")
  public CustomerData getAnagraphicalData() {
    return anagraphicalData;
  }

  public void setAnagraphicalData(CustomerData anagraphicalData) {
    this.anagraphicalData = anagraphicalData;
  }

  public Associate address(AddressExtended address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public AddressExtended getAddress() {
    return address;
  }

  public void setAddress(AddressExtended address) {
    this.address = address;
  }

  public Associate shareCapital(Amount shareCapital) {
    this.shareCapital = shareCapital;
    return this;
  }

   /**
   * share capital
   * @return shareCapital
  **/
  @ApiModelProperty(value = "share capital")
  public Amount getShareCapital() {
    return shareCapital;
  }

  public void setShareCapital(Amount shareCapital) {
    this.shareCapital = shareCapital;
  }

  public Associate companyFilingDate(String companyFilingDate) {
    this.companyFilingDate = companyFilingDate;
    return this;
  }

   /**
   * filing date of company
   * @return companyFilingDate
  **/
  @ApiModelProperty(value = "filing date of company")
  public String getCompanyFilingDate() {
    return companyFilingDate;
  }

  public void setCompanyFilingDate(String companyFilingDate) {
    this.companyFilingDate = companyFilingDate;
  }

  public Associate ownershipType(String ownershipType) {
    this.ownershipType = ownershipType;
    return this;
  }

   /**
   * ownership type in company
   * @return ownershipType
  **/
  @ApiModelProperty(value = "ownership type in company")
  public String getOwnershipType() {
    return ownershipType;
  }

  public void setOwnershipType(String ownershipType) {
    this.ownershipType = ownershipType;
  }

  public Associate capitalStake(Amount capitalStake) {
    this.capitalStake = capitalStake;
    return this;
  }

   /**
   * capital stake in company
   * @return capitalStake
  **/
  @ApiModelProperty(value = "capital stake in company")
  public Amount getCapitalStake() {
    return capitalStake;
  }

  public void setCapitalStake(Amount capitalStake) {
    this.capitalStake = capitalStake;
  }

  public Associate capitalStakePercentage(String capitalStakePercentage) {
    this.capitalStakePercentage = capitalStakePercentage;
    return this;
  }

   /**
   * capital stake percentage in company
   * @return capitalStakePercentage
  **/
  @ApiModelProperty(value = "capital stake percentage in company")
  public String getCapitalStakePercentage() {
    return capitalStakePercentage;
  }

  public void setCapitalStakePercentage(String capitalStakePercentage) {
    this.capitalStakePercentage = capitalStakePercentage;
  }

  public Associate flagPrejudicialDeeds(Boolean flagPrejudicialDeeds) {
    this.flagPrejudicialDeeds = flagPrejudicialDeeds;
    return this;
  }

   /**
   * flag that indicate presence of Prejudicial Deeds
   * @return flagPrejudicialDeeds
  **/
  @ApiModelProperty(example = "false", value = "flag that indicate presence of Prejudicial Deeds")
  public Boolean isFlagPrejudicialDeeds() {
    return flagPrejudicialDeeds;
  }

  public void setFlagPrejudicialDeeds(Boolean flagPrejudicialDeeds) {
    this.flagPrejudicialDeeds = flagPrejudicialDeeds;
  }

  public Associate flagProtests(Boolean flagProtests) {
    this.flagProtests = flagProtests;
    return this;
  }

   /**
   * flag that indicate presence of protests
   * @return flagProtests
  **/
  @ApiModelProperty(example = "false", value = "flag that indicate presence of protests")
  public Boolean isFlagProtests() {
    return flagProtests;
  }

  public void setFlagProtests(Boolean flagProtests) {
    this.flagProtests = flagProtests;
  }

  public Associate flagExistBankruptcyProceedings_(Boolean flagExistBankruptcyProceedings_) {
    this.flagExistBankruptcyProceedings_ = flagExistBankruptcyProceedings_;
    return this;
  }

   /**
   * flag that indicate extisting of bankruptcy proceedings
   * @return flagExistBankruptcyProceedings_
  **/
  @ApiModelProperty(example = "false", value = "flag that indicate extisting of bankruptcy proceedings")
  public Boolean isFlagExistBankruptcyProceedings_() {
    return flagExistBankruptcyProceedings_;
  }

  public void setFlagExistBankruptcyProceedings_(Boolean flagExistBankruptcyProceedings_) {
    this.flagExistBankruptcyProceedings_ = flagExistBankruptcyProceedings_;
  }

  public Associate flagExistPrejudicialDeeds(Boolean flagExistPrejudicialDeeds) {
    this.flagExistPrejudicialDeeds = flagExistPrejudicialDeeds;
    return this;
  }

   /**
   * flag that indicate presence of Prejudicial Deeds
   * @return flagExistPrejudicialDeeds
  **/
  @ApiModelProperty(example = "false", value = "flag that indicate presence of Prejudicial Deeds")
  public Boolean isFlagExistPrejudicialDeeds() {
    return flagExistPrejudicialDeeds;
  }

  public void setFlagExistPrejudicialDeeds(Boolean flagExistPrejudicialDeeds) {
    this.flagExistPrejudicialDeeds = flagExistPrejudicialDeeds;
  }

  public Associate flagExistVerifiedProtests(Boolean flagExistVerifiedProtests) {
    this.flagExistVerifiedProtests = flagExistVerifiedProtests;
    return this;
  }

   /**
   * flag that indicate presence of VerifiedProtests
   * @return flagExistVerifiedProtests
  **/
  @ApiModelProperty(example = "false", value = "flag that indicate presence of VerifiedProtests")
  public Boolean isFlagExistVerifiedProtests() {
    return flagExistVerifiedProtests;
  }

  public void setFlagExistVerifiedProtests(Boolean flagExistVerifiedProtests) {
    this.flagExistVerifiedProtests = flagExistVerifiedProtests;
  }

  public Associate flagExistHomonimousProtests(Boolean flagExistHomonimousProtests) {
    this.flagExistHomonimousProtests = flagExistHomonimousProtests;
    return this;
  }

   /**
   * flag that indicate presence of Homonimous Protests
   * @return flagExistHomonimousProtests
  **/
  @ApiModelProperty(example = "false", value = "flag that indicate presence of Homonimous Protests")
  public Boolean isFlagExistHomonimousProtests() {
    return flagExistHomonimousProtests;
  }

  public void setFlagExistHomonimousProtests(Boolean flagExistHomonimousProtests) {
    this.flagExistHomonimousProtests = flagExistHomonimousProtests;
  }

  public Associate flagExistNews(Boolean flagExistNews) {
    this.flagExistNews = flagExistNews;
    return this;
  }

   /**
   * flag exist news
   * @return flagExistNews
  **/
  @ApiModelProperty(example = "false", value = "flag exist news")
  public Boolean isFlagExistNews() {
    return flagExistNews;
  }

  public void setFlagExistNews(Boolean flagExistNews) {
    this.flagExistNews = flagExistNews;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Associate associate = (Associate) o;
    return Objects.equals(this.crifNumber, associate.crifNumber) &&
        Objects.equals(this.companyInfo, associate.companyInfo) &&
        Objects.equals(this.companyAddress, associate.companyAddress) &&
        Objects.equals(this.anagraphicalData, associate.anagraphicalData) &&
        Objects.equals(this.address, associate.address) &&
        Objects.equals(this.shareCapital, associate.shareCapital) &&
        Objects.equals(this.companyFilingDate, associate.companyFilingDate) &&
        Objects.equals(this.ownershipType, associate.ownershipType) &&
        Objects.equals(this.capitalStake, associate.capitalStake) &&
        Objects.equals(this.capitalStakePercentage, associate.capitalStakePercentage) &&
        Objects.equals(this.flagPrejudicialDeeds, associate.flagPrejudicialDeeds) &&
        Objects.equals(this.flagProtests, associate.flagProtests) &&
        Objects.equals(this.flagExistBankruptcyProceedings_, associate.flagExistBankruptcyProceedings_) &&
        Objects.equals(this.flagExistPrejudicialDeeds, associate.flagExistPrejudicialDeeds) &&
        Objects.equals(this.flagExistVerifiedProtests, associate.flagExistVerifiedProtests) &&
        Objects.equals(this.flagExistHomonimousProtests, associate.flagExistHomonimousProtests) &&
        Objects.equals(this.flagExistNews, associate.flagExistNews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crifNumber, companyInfo, companyAddress, anagraphicalData, address, shareCapital, companyFilingDate, ownershipType, capitalStake, capitalStakePercentage, flagPrejudicialDeeds, flagProtests, flagExistBankruptcyProceedings_, flagExistPrejudicialDeeds, flagExistVerifiedProtests, flagExistHomonimousProtests, flagExistNews);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Associate {\n");
    
    sb.append("    crifNumber: ").append(toIndentedString(crifNumber)).append("\n");
    sb.append("    companyInfo: ").append(toIndentedString(companyInfo)).append("\n");
    sb.append("    companyAddress: ").append(toIndentedString(companyAddress)).append("\n");
    sb.append("    anagraphicalData: ").append(toIndentedString(anagraphicalData)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    shareCapital: ").append(toIndentedString(shareCapital)).append("\n");
    sb.append("    companyFilingDate: ").append(toIndentedString(companyFilingDate)).append("\n");
    sb.append("    ownershipType: ").append(toIndentedString(ownershipType)).append("\n");
    sb.append("    capitalStake: ").append(toIndentedString(capitalStake)).append("\n");
    sb.append("    capitalStakePercentage: ").append(toIndentedString(capitalStakePercentage)).append("\n");
    sb.append("    flagPrejudicialDeeds: ").append(toIndentedString(flagPrejudicialDeeds)).append("\n");
    sb.append("    flagProtests: ").append(toIndentedString(flagProtests)).append("\n");
    sb.append("    flagExistBankruptcyProceedings_: ").append(toIndentedString(flagExistBankruptcyProceedings_)).append("\n");
    sb.append("    flagExistPrejudicialDeeds: ").append(toIndentedString(flagExistPrejudicialDeeds)).append("\n");
    sb.append("    flagExistVerifiedProtests: ").append(toIndentedString(flagExistVerifiedProtests)).append("\n");
    sb.append("    flagExistHomonimousProtests: ").append(toIndentedString(flagExistHomonimousProtests)).append("\n");
    sb.append("    flagExistNews: ").append(toIndentedString(flagExistNews)).append("\n");
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

