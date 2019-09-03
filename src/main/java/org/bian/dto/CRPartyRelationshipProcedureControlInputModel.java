package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureControlInputModelPartyRelationshipProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureControlInputModel
 */
public class CRPartyRelationshipProcedureControlInputModel   {
  private String partyLifeCycleManagementServicingSessionReference = null;

  private String partyRelationshipProcedureInstanceReference = null;

  private Object partyRelationshipProcedureControlActionTaskRecord = null;

  private CRPartyRelationshipProcedureControlInputModelPartyRelationshipProcedureControlActionRequest partyRelationshipProcedureControlActionRequest = null;


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
   * Get partyRelationshipProcedureControlActionRequest
   * @return partyRelationshipProcedureControlActionRequest
  **/

  public CRPartyRelationshipProcedureControlInputModelPartyRelationshipProcedureControlActionRequest getPartyRelationshipProcedureControlActionRequest() {
    return partyRelationshipProcedureControlActionRequest;
  }

  public void setPartyRelationshipProcedureControlActionRequest(CRPartyRelationshipProcedureControlInputModelPartyRelationshipProcedureControlActionRequest partyRelationshipProcedureControlActionRequest) {
    this.partyRelationshipProcedureControlActionRequest = partyRelationshipProcedureControlActionRequest;
  }


}

