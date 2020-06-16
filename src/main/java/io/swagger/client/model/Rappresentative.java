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
import io.swagger.client.model.Mandate;
import java.util.ArrayList;
import java.util.List;

/**
 * Rappresentative
 */

public class Rappresentative {
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

  @JsonProperty("mandates")
  private List<Mandate> mandates = null;

  @JsonProperty("administrator")
  private String administrator = null;

  @JsonProperty("flagSignPower")
  private Boolean flagSignPower = null;

  @JsonProperty("flagRapresentative")
  private Boolean flagRapresentative = null;

  @JsonProperty("capitalStake")
  private Amount capitalStake = null;

  @JsonProperty("capitalStakePercentage")
  private String capitalStakePercentage = null;

  @JsonProperty("totalShare")
  private Amount totalShare = null;

  @JsonProperty("flagLegalRapresentative")
  private Boolean flagLegalRapresentative = null;

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

  public Rappresentative crifNumber(String crifNumber) {
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

  public Rappresentative companyInfo(CompanyBasicData companyInfo) {
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

  public Rappresentative companyAddress(Address companyAddress) {
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

  public Rappresentative anagraphicalData(CustomerData anagraphicalData) {
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

  public Rappresentative address(AddressExtended address) {
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

  public Rappresentative mandates(List<Mandate> mandates) {
    this.mandates = mandates;
    return this;
  }

  public Rappresentative addMandatesItem(Mandate mandatesItem) {
    if (this.mandates == null) {
      this.mandates = new ArrayList<>();
    }
    this.mandates.add(mandatesItem);
    return this;
  }

   /**
   * Get mandates
   * @return mandates
  **/
  @ApiModelProperty(value = "")
  public List<Mandate> getMandates() {
    return mandates;
  }

  public void setMandates(List<Mandate> mandates) {
    this.mandates = mandates;
  }

  public Rappresentative administrator(String administrator) {
    this.administrator = administrator;
    return this;
  }

   /**
   * administrator
   * @return administrator
  **/
  @ApiModelProperty(value = "administrator")
  public String getAdministrator() {
    return administrator;
  }

  public void setAdministrator(String administrator) {
    this.administrator = administrator;
  }

  public Rappresentative flagSignPower(Boolean flagSignPower) {
    this.flagSignPower = flagSignPower;
    return this;
  }

   /**
   * sign power
   * @return flagSignPower
  **/
  @ApiModelProperty(example = "false", value = "sign power")
  public Boolean isFlagSignPower() {
    return flagSignPower;
  }

  public void setFlagSignPower(Boolean flagSignPower) {
    this.flagSignPower = flagSignPower;
  }

  public Rappresentative flagRapresentative(Boolean flagRapresentative) {
    this.flagRapresentative = flagRapresentative;
    return this;
  }

   /**
   * flag rapresentative
   * @return flagRapresentative
  **/
  @ApiModelProperty(example = "false", value = "flag rapresentative")
  public Boolean isFlagRapresentative() {
    return flagRapresentative;
  }

  public void setFlagRapresentative(Boolean flagRapresentative) {
    this.flagRapresentative = flagRapresentative;
  }

  public Rappresentative capitalStake(Amount capitalStake) {
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

  public Rappresentative capitalStakePercentage(String capitalStakePercentage) {
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

  public Rappresentative totalShare(Amount totalShare) {
    this.totalShare = totalShare;
    return this;
  }

   /**
   * total share in company
   * @return totalShare
  **/
  @ApiModelProperty(value = "total share in company")
  public Amount getTotalShare() {
    return totalShare;
  }

  public void setTotalShare(Amount totalShare) {
    this.totalShare = totalShare;
  }

  public Rappresentative flagLegalRapresentative(Boolean flagLegalRapresentative) {
    this.flagLegalRapresentative = flagLegalRapresentative;
    return this;
  }

   /**
   * flag that indicate presence of Prejudicial Deeds
   * @return flagLegalRapresentative
  **/
  @ApiModelProperty(example = "false", value = "flag that indicate presence of Prejudicial Deeds")
  public Boolean isFlagLegalRapresentative() {
    return flagLegalRapresentative;
  }

  public void setFlagLegalRapresentative(Boolean flagLegalRapresentative) {
    this.flagLegalRapresentative = flagLegalRapresentative;
  }

  public Rappresentative flagPrejudicialDeeds(Boolean flagPrejudicialDeeds) {
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

  public Rappresentative flagProtests(Boolean flagProtests) {
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

  public Rappresentative flagExistBankruptcyProceedings_(Boolean flagExistBankruptcyProceedings_) {
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

  public Rappresentative flagExistPrejudicialDeeds(Boolean flagExistPrejudicialDeeds) {
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

  public Rappresentative flagExistVerifiedProtests(Boolean flagExistVerifiedProtests) {
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

  public Rappresentative flagExistHomonimousProtests(Boolean flagExistHomonimousProtests) {
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

  public Rappresentative flagExistNews(Boolean flagExistNews) {
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
    Rappresentative rappresentative = (Rappresentative) o;
    return Objects.equals(this.crifNumber, rappresentative.crifNumber) &&
        Objects.equals(this.companyInfo, rappresentative.companyInfo) &&
        Objects.equals(this.companyAddress, rappresentative.companyAddress) &&
        Objects.equals(this.anagraphicalData, rappresentative.anagraphicalData) &&
        Objects.equals(this.address, rappresentative.address) &&
        Objects.equals(this.mandates, rappresentative.mandates) &&
        Objects.equals(this.administrator, rappresentative.administrator) &&
        Objects.equals(this.flagSignPower, rappresentative.flagSignPower) &&
        Objects.equals(this.flagRapresentative, rappresentative.flagRapresentative) &&
        Objects.equals(this.capitalStake, rappresentative.capitalStake) &&
        Objects.equals(this.capitalStakePercentage, rappresentative.capitalStakePercentage) &&
        Objects.equals(this.totalShare, rappresentative.totalShare) &&
        Objects.equals(this.flagLegalRapresentative, rappresentative.flagLegalRapresentative) &&
        Objects.equals(this.flagPrejudicialDeeds, rappresentative.flagPrejudicialDeeds) &&
        Objects.equals(this.flagProtests, rappresentative.flagProtests) &&
        Objects.equals(this.flagExistBankruptcyProceedings_, rappresentative.flagExistBankruptcyProceedings_) &&
        Objects.equals(this.flagExistPrejudicialDeeds, rappresentative.flagExistPrejudicialDeeds) &&
        Objects.equals(this.flagExistVerifiedProtests, rappresentative.flagExistVerifiedProtests) &&
        Objects.equals(this.flagExistHomonimousProtests, rappresentative.flagExistHomonimousProtests) &&
        Objects.equals(this.flagExistNews, rappresentative.flagExistNews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crifNumber, companyInfo, companyAddress, anagraphicalData, address, mandates, administrator, flagSignPower, flagRapresentative, capitalStake, capitalStakePercentage, totalShare, flagLegalRapresentative, flagPrejudicialDeeds, flagProtests, flagExistBankruptcyProceedings_, flagExistPrejudicialDeeds, flagExistVerifiedProtests, flagExistHomonimousProtests, flagExistNews);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rappresentative {\n");
    
    sb.append("    crifNumber: ").append(toIndentedString(crifNumber)).append("\n");
    sb.append("    companyInfo: ").append(toIndentedString(companyInfo)).append("\n");
    sb.append("    companyAddress: ").append(toIndentedString(companyAddress)).append("\n");
    sb.append("    anagraphicalData: ").append(toIndentedString(anagraphicalData)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    mandates: ").append(toIndentedString(mandates)).append("\n");
    sb.append("    administrator: ").append(toIndentedString(administrator)).append("\n");
    sb.append("    flagSignPower: ").append(toIndentedString(flagSignPower)).append("\n");
    sb.append("    flagRapresentative: ").append(toIndentedString(flagRapresentative)).append("\n");
    sb.append("    capitalStake: ").append(toIndentedString(capitalStake)).append("\n");
    sb.append("    capitalStakePercentage: ").append(toIndentedString(capitalStakePercentage)).append("\n");
    sb.append("    totalShare: ").append(toIndentedString(totalShare)).append("\n");
    sb.append("    flagLegalRapresentative: ").append(toIndentedString(flagLegalRapresentative)).append("\n");
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

