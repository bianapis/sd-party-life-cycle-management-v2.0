package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureRequestInputModelCRPartyRelationshipProcedureInstanceRecord;
import org.bian.dto.CRPartyRelationshipProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureRequestInputModel
 */
public class CRPartyRelationshipProcedureRequestInputModel   {
  private String partyLifeCycleManagementServicingSessionReference = null;

  private String partyRelationshipProcedureInstanceReference = null;

  private CRPartyRelationshipProcedureRequestInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private Object partyRelationshipProcedureRequestActionTaskRecord = null;

  private CRPartyRelationshipProcedureRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRPartyRelationshipProcedureRequestInputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(CRPartyRelationshipProcedureRequestInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
    this.cRPartyRelationshipProcedureInstanceRecord = cRPartyRelationshipProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return partyRelationshipProcedureRequestActionTaskRecord
  **/

  public Object getPartyRelationshipProcedureRequestActionTaskRecord() {
    return partyRelationshipProcedureRequestActionTaskRecord;
  }

  public void setPartyRelationshipProcedureRequestActionTaskRecord(Object partyRelationshipProcedureRequestActionTaskRecord) {
    this.partyRelationshipProcedureRequestActionTaskRecord = partyRelationshipProcedureRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRPartyRelationshipProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRPartyRelationshipProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

