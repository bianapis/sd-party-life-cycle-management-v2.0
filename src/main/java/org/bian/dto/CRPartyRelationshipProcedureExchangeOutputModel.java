package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureExchangeOutputModel
 */
public class CRPartyRelationshipProcedureExchangeOutputModel   {
  private String partyRelationshipProcedureExchangeActionTaskReference = null;

  private Object partyRelationshipProcedureExchangeActionTaskRecord = null;

  private String partyRelationshipProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Relationship Procedure instance exchange service call 
   * @return partyRelationshipProcedureExchangeActionTaskReference
  **/

  public String getPartyRelationshipProcedureExchangeActionTaskReference() {
    return partyRelationshipProcedureExchangeActionTaskReference;
  }

  public void setPartyRelationshipProcedureExchangeActionTaskReference(String partyRelationshipProcedureExchangeActionTaskReference) {
    this.partyRelationshipProcedureExchangeActionTaskReference = partyRelationshipProcedureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return partyRelationshipProcedureExchangeActionTaskRecord
  **/

  public Object getPartyRelationshipProcedureExchangeActionTaskRecord() {
    return partyRelationshipProcedureExchangeActionTaskRecord;
  }

  public void setPartyRelationshipProcedureExchangeActionTaskRecord(Object partyRelationshipProcedureExchangeActionTaskRecord) {
    this.partyRelationshipProcedureExchangeActionTaskRecord = partyRelationshipProcedureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return partyRelationshipProcedureExchangeActionResponse
  **/

  public String getPartyRelationshipProcedureExchangeActionResponse() {
    return partyRelationshipProcedureExchangeActionResponse;
  }

  public void setPartyRelationshipProcedureExchangeActionResponse(String partyRelationshipProcedureExchangeActionResponse) {
    this.partyRelationshipProcedureExchangeActionResponse = partyRelationshipProcedureExchangeActionResponse;
  }


}

