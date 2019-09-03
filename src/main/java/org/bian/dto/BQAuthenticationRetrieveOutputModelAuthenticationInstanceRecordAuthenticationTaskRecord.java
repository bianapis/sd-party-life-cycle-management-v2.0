package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecordAuthenticationTaskRecord
 */
public class BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecordAuthenticationTaskRecord   {
  private String authenticationTaskDescription = null;

  private String specialistAgencyServiceRequestResult = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String authenticationTaskWorkProducts = null;

  private String authenticationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the authentication procedure 
   * @return authenticationTaskDescription
  **/

  public String getAuthenticationTaskDescription() {
    return authenticationTaskDescription;
  }

  public void setAuthenticationTaskDescription(String authenticationTaskDescription) {
    this.authenticationTaskDescription = authenticationTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Result from the authentication service request  
   * @return specialistAgencyServiceRequestResult
  **/

  public String getSpecialistAgencyServiceRequestResult() {
    return specialistAgencyServiceRequestResult;
  }

  public void setSpecialistAgencyServiceRequestResult(String specialistAgencyServiceRequestResult) {
    this.specialistAgencyServiceRequestResult = specialistAgencyServiceRequestResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to documents used for authentication 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return authenticationTaskWorkProducts
  **/

  public String getAuthenticationTaskWorkProducts() {
    return authenticationTaskWorkProducts;
  }

  public void setAuthenticationTaskWorkProducts(String authenticationTaskWorkProducts) {
    this.authenticationTaskWorkProducts = authenticationTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the authentication workstep 
   * @return authenticationTaskResult
  **/

  public String getAuthenticationTaskResult() {
    return authenticationTaskResult;
  }

  public void setAuthenticationTaskResult(String authenticationTaskResult) {
    this.authenticationTaskResult = authenticationTaskResult;
  }


}

