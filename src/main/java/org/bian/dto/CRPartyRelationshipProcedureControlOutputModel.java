package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureControlOutputModel
 */
public class CRPartyRelationshipProcedureControlOutputModel   {
  private String partyRelationshipProcedureControlActionTaskReference = null;

  private Object partyRelationshipProcedureControlActionTaskRecord = null;

  private String partyRelationshipProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Relationship Procedure instance control processing service call 
   * @return partyRelationshipProcedureControlActionTaskReference
  **/

  public String getPartyRelationshipProcedureControlActionTaskReference() {
    return partyRelationshipProcedureControlActionTaskReference;
  }

  public void setPartyRelationshipProcedureControlActionTaskReference(String partyRelationshipProcedureControlActionTaskReference) {
    this.partyRelationshipProcedureControlActionTaskReference = partyRelationshipProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return partyRelationshipProcedureControlActionTaskRecord
  **/

  public Object getPartyRelationshipProcedureControlActionTaskRecord() {
    return partyRelationshipProcedureControlActionTaskRecord;
  }

  public void setPartyRelationshipProcedureControlActionTaskRecord(Object partyRelationshipProcedureControlActionTaskRecord) {
    this.partyRelationshipProcedureControlActionTaskRecord = partyRelationshipProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return partyRelationshipProcedureControlActionResponse
  **/

  public String getPartyRelationshipProcedureControlActionResponse() {
    return partyRelationshipProcedureControlActionResponse;
  }

  public void setPartyRelationshipProcedureControlActionResponse(String partyRelationshipProcedureControlActionResponse) {
    this.partyRelationshipProcedureControlActionResponse = partyRelationshipProcedureControlActionResponse;
  }


}

