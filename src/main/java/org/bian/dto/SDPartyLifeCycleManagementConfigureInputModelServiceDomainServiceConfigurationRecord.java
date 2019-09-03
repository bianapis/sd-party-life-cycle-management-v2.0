package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement;
import org.bian.dto.SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup;
import org.bian.dto.SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecord
 */
public class SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecord   {
  private String serviceDomainServiceConfigurationSettingReference = null;

  private String serviceDomainServiceConfigurationSettingType = null;

  private SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup = null;

  private SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription = null;

  private SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return serviceDomainServiceConfigurationSettingReference
  **/

  public String getServiceDomainServiceConfigurationSettingReference() {
    return serviceDomainServiceConfigurationSettingReference;
  }

  public void setServiceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return serviceDomainServiceConfigurationSettingType
  **/

  public String getServiceDomainServiceConfigurationSettingType() {
    return serviceDomainServiceConfigurationSettingType;
  }

  public void setServiceDomainServiceConfigurationSettingType(String serviceDomainServiceConfigurationSettingType) {
    this.serviceDomainServiceConfigurationSettingType = serviceDomainServiceConfigurationSettingType;
  }


  /**
   * Get serviceDomainServiceConfigurationSetup
   * @return serviceDomainServiceConfigurationSetup
  **/

  public SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup getServiceDomainServiceConfigurationSetup() {
    return serviceDomainServiceConfigurationSetup;
  }

  public void setServiceDomainServiceConfigurationSetup(SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
  }


  /**
   * Get serviceDomainServiceSubscription
   * @return serviceDomainServiceSubscription
  **/

  public SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription getServiceDomainServiceSubscription() {
    return serviceDomainServiceSubscription;
  }

  public void setServiceDomainServiceSubscription(SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
  }


  /**
   * Get serviceDomainServiceAgreement
   * @return serviceDomainServiceAgreement
  **/

  public SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement getServiceDomainServiceAgreement() {
    return serviceDomainServiceAgreement;
  }

  public void setServiceDomainServiceAgreement(SDPartyLifeCycleManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
  }


}

