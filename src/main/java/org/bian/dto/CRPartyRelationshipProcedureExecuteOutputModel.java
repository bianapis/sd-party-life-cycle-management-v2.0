package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureExecuteOutputModel
 */
public class CRPartyRelationshipProcedureExecuteOutputModel   {
  private CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private String partyRelationshipProcedureExecuteActionTaskReference = null;

  private Object partyRelationshipProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Relationship Procedure instance execute service call 
   * @return partyRelationshipProcedureExecuteActionTaskReference
  **/

  public String getPartyRelationshipProcedureExecuteActionTaskReference() {
    return partyRelationshipProcedureExecuteActionTaskReference;
  }

  public void setPartyRelationshipProcedureExecuteActionTaskReference(String partyRelationshipProcedureExecuteActionTaskReference) {
    this.partyRelationshipProcedureExecuteActionTaskReference = partyRelationshipProcedureExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

