package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureUpdateInputModel
 */
public class CRPartyRelationshipProcedureUpdateInputModel   {
  private String partyLifeCycleManagementServicingSessionReference = null;

  private String partyRelationshipProcedureInstanceReference = null;

  private CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private Object partyRelationshipProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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

  public CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
    this.cRPartyRelationshipProcedureInstanceRecord = cRPartyRelationshipProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return customerPrecedentProfileUpdateLog
  **/

  public String getCustomerPrecedentProfileUpdateLog() {
    return customerPrecedentProfileUpdateLog;
  }

  public void setCustomerPrecedentProfileUpdateLog(String customerPrecedentProfileUpdateLog) {
    this.customerPrecedentProfileUpdateLog = customerPrecedentProfileUpdateLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return partyRelationshipProcedureUpdateActionTaskRecord
  **/

  public Object getPartyRelationshipProcedureUpdateActionTaskRecord() {
    return partyRelationshipProcedureUpdateActionTaskRecord;
  }

  public void setPartyRelationshipProcedureUpdateActionTaskRecord(Object partyRelationshipProcedureUpdateActionTaskRecord) {
    this.partyRelationshipProcedureUpdateActionTaskRecord = partyRelationshipProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

