package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQualificationRetrieveOutputModelQualificationInstanceRecordQualificationTaskRecord
 */
public class BQQualificationRetrieveOutputModelQualificationInstanceRecordQualificationTaskRecord   {
  private String qualificationTaskDescription = null;

  private String specialistAgencyRegulatorServiceRequestResult = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String qualificationTaskWorkProducts = null;

  private String qualificationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the approach taken 
   * @return qualificationTaskDescription
  **/

  public String getQualificationTaskDescription() {
    return qualificationTaskDescription;
  }

  public void setQualificationTaskDescription(String qualificationTaskDescription) {
    this.qualificationTaskDescription = qualificationTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Result from the qualification service request  
   * @return specialistAgencyRegulatorServiceRequestResult
  **/

  public String getSpecialistAgencyRegulatorServiceRequestResult() {
    return specialistAgencyRegulatorServiceRequestResult;
  }

  public void setSpecialistAgencyRegulatorServiceRequestResult(String specialistAgencyRegulatorServiceRequestResult) {
    this.specialistAgencyRegulatorServiceRequestResult = specialistAgencyRegulatorServiceRequestResult;
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
   * @return qualificationTaskWorkProducts
  **/

  public String getQualificationTaskWorkProducts() {
    return qualificationTaskWorkProducts;
  }

  public void setQualificationTaskWorkProducts(String qualificationTaskWorkProducts) {
    this.qualificationTaskWorkProducts = qualificationTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the qualification workstep 
   * @return qualificationTaskResult
  **/

  public String getQualificationTaskResult() {
    return qualificationTaskResult;
  }

  public void setQualificationTaskResult(String qualificationTaskResult) {
    this.qualificationTaskResult = qualificationTaskResult;
  }


}

