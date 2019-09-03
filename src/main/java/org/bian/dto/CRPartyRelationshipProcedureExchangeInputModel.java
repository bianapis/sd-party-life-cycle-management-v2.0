package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureExchangeInputModelPartyRelationshipProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureExchangeInputModel
 */
public class CRPartyRelationshipProcedureExchangeInputModel   {
  private String partyLifeCycleManagementServicingSessionReference = null;

  private String partyRelationshipProcedureInstanceReference = null;

  private Object partyRelationshipProcedureExchangeActionTaskRecord = null;

  private CRPartyRelationshipProcedureExchangeInputModelPartyRelationshipProcedureExchangeActionRequest partyRelationshipProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return partyLifeCycleManagementServicingSessionReference
  **/

  public String getPartyLifeCycleManagementServicingSessionReference() {
    return partyLifeCycleManagementServicingSessionReference;
  }

  public void setPartyLifeCycleManagementServicingSessionReference(String partyLifeCycleManagementServicingSessionReference) {
    this.partyLifeCycleManagementServicingSessionReference = partyLifeCycleManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Party Relationship Procedure instance 
   * @return partyRelationshipProcedureInstanceReference
  **/

  public String getPartyRelationshipProcedureInstanceReference() {
    return partyRelationshipProcedureInstanceReference;
  }

  public void setPartyRelationshipProcedureInstanceReference(String partyRelationshipProcedureInstanceReference) {
    this.partyRelationshipProcedureInstanceReference = partyRelationshipProcedureInstanceReference;
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
   * Get partyRelationshipProcedureExchangeActionRequest
   * @return partyRelationshipProcedureExchangeActionRequest
  **/

  public CRPartyRelationshipProcedureExchangeInputModelPartyRelationshipProcedureExchangeActionRequest getPartyRelationshipProcedureExchangeActionRequest() {
    return partyRelationshipProcedureExchangeActionRequest;
  }

  public void setPartyRelationshipProcedureExchangeActionRequest(CRPartyRelationshipProcedureExchangeInputModelPartyRelationshipProcedureExchangeActionRequest partyRelationshipProcedureExchangeActionRequest) {
    this.partyRelationshipProcedureExchangeActionRequest = partyRelationshipProcedureExchangeActionRequest;
  }


}

