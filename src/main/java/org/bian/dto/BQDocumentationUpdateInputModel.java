package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentationUpdateInputModel
 */
public class BQDocumentationUpdateInputModel   {
  private String partyRelationshipProcedureInstanceReference = null;

  private String documentationInstanceReference = null;

  private Object documentationUpdateActionTaskRecord = null;

  private String documentationUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Party Relationship Procedure instance 
   * @return partyRelationshipProcedureInstanceReference
  **/

  public String getPartyRelationshipProcedureInstanceReference() {
    return partyRelationshipProcedureInstanceReference;
  }

  public void setPartyRelationshipProcedureInstanceReference(String partyRelationshipProcedureInstanceReference) {
    this.partyRelationshipProcedureInstanceReference = partyRelationshipProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Documentation instance 
   * @return documentationInstanceReference
  **/

  public String getDocumentationInstanceReference() {
    return documentationInstanceReference;
  }

  public void setDocumentationInstanceReference(String documentationInstanceReference) {
    this.documentationInstanceReference = documentationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return documentationUpdateActionTaskRecord
  **/

  public Object getDocumentationUpdateActionTaskRecord() {
    return documentationUpdateActionTaskRecord;
  }

  public void setDocumentationUpdateActionTaskRecord(Object documentationUpdateActionTaskRecord) {
    this.documentationUpdateActionTaskRecord = documentationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return documentationUpdateActionRequest
  **/

  public String getDocumentationUpdateActionRequest() {
    return documentationUpdateActionRequest;
  }

  public void setDocumentationUpdateActionRequest(String documentationUpdateActionRequest) {
    this.documentationUpdateActionRequest = documentationUpdateActionRequest;
  }


}

