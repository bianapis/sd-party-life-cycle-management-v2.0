package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentationRetrieveOutputModelDocumentationInstanceRecord
 */
public class BQDocumentationRetrieveOutputModelDocumentationInstanceRecord   {
  private String partyLifecycleRequiredDocumentation = null;

  private String partyLifecycleDocumentSchedule = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Describes documents that need to be available and evaluated 
   * @return partyLifecycleRequiredDocumentation
  **/

  public String getPartyLifecycleRequiredDocumentation() {
    return partyLifecycleRequiredDocumentation;
  }

  public void setPartyLifecycleRequiredDocumentation(String partyLifecycleRequiredDocumentation) {
    this.partyLifecycleRequiredDocumentation = partyLifecycleRequiredDocumentation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Describes and records timing required and actual for obtaining and evaluating documents 
   * @return partyLifecycleDocumentSchedule
  **/

  public String getPartyLifecycleDocumentSchedule() {
    return partyLifecycleDocumentSchedule;
  }

  public void setPartyLifecycleDocumentSchedule(String partyLifecycleDocumentSchedule) {
    this.partyLifecycleDocumentSchedule = partyLifecycleDocumentSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to specific documents used in the life-cycle check 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


}

