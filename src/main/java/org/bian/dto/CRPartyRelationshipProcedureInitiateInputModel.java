package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureInitiateInputModelCRPartyRelationshipProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureInitiateInputModel
 */
public class CRPartyRelationshipProcedureInitiateInputModel   {
  private String partyLifeCycleManagementServicingSessionReference = null;

  private Object partyRelationshipProcedureInitiateActionRecord = null;

  private String partyRelationshipProcedureInstanceStatus = null;

  private CRPartyRelationshipProcedureInitiateInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return partyRelationshipProcedureInitiateActionRecord
  **/

  public Object getPartyRelationshipProcedureInitiateActionRecord() {
    return partyRelationshipProcedureInitiateActionRecord;
  }

  public void setPartyRelationshipProcedureInitiateActionRecord(Object partyRelationshipProcedureInitiateActionRecord) {
    this.partyRelationshipProcedureInitiateActionRecord = partyRelationshipProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Party Relationship Procedure instance (e.g. initialised, pending, active) 
   * @return partyRelationshipProcedureInstanceStatus
  **/

  public String getPartyRelationshipProcedureInstanceStatus() {
    return partyRelationshipProcedureInstanceStatus;
  }

  public void setPartyRelationshipProcedureInstanceStatus(String partyRelationshipProcedureInstanceStatus) {
    this.partyRelationshipProcedureInstanceStatus = partyRelationshipProcedureInstanceStatus;
  }


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public CRPartyRelationshipProcedureInitiateInputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(CRPartyRelationshipProcedureInitiateInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
    this.cRPartyRelationshipProcedureInstanceRecord = cRPartyRelationshipProcedureInstanceRecord;
  }


}

