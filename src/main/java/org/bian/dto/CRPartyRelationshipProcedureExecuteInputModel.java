package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureExecuteInputModelCRPartyRelationshipProcedureInstanceRecord;
import org.bian.dto.CRPartyRelationshipProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureExecuteInputModel
 */
public class CRPartyRelationshipProcedureExecuteInputModel   {
  private String partyLifeCycleManagementServicingSessionReference = null;

  private String partyRelationshipProcedureInstanceReference = null;

  private CRPartyRelationshipProcedureExecuteInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private Object partyRelationshipProcedureExecuteActionTaskRecord = null;

  private CRPartyRelationshipProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public CRPartyRelationshipProcedureExecuteInputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(CRPartyRelationshipProcedureExecuteInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
    this.cRPartyRelationshipProcedureInstanceRecord = cRPartyRelationshipProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return partyRelationshipProcedureExecuteActionTaskRecord
  **/

  public Object getPartyRelationshipProcedureExecuteActionTaskRecord() {
    return partyRelationshipProcedureExecuteActionTaskRecord;
  }

  public void setPartyRelationshipProcedureExecuteActionTaskRecord(Object partyRelationshipProcedureExecuteActionTaskRecord) {
    this.partyRelationshipProcedureExecuteActionTaskRecord = partyRelationshipProcedureExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRPartyRelationshipProcedureExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRPartyRelationshipProcedureExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

