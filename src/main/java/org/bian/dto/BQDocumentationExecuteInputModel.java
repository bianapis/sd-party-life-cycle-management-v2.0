package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentationExecuteInputModelCRPartyRelationshipProcedureInstanceRecord;
import org.bian.dto.BQDocumentationExecuteInputModelDocumentationInstanceRecord;
import org.bian.dto.CRPartyRelationshipProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQDocumentationExecuteInputModel
 */
public class BQDocumentationExecuteInputModel   {
  private BQDocumentationExecuteInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private String partyRelationshipProcedureInstanceReference = null;

  private String documentationInstanceReference = null;

  private BQDocumentationExecuteInputModelDocumentationInstanceRecord documentationInstanceRecord = null;

  private Object documentationExecuteActionTaskRecord = null;

  private CRPartyRelationshipProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public BQDocumentationExecuteInputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(BQDocumentationExecuteInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
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
   * Get documentationInstanceRecord
   * @return documentationInstanceRecord
  **/

  public BQDocumentationExecuteInputModelDocumentationInstanceRecord getDocumentationInstanceRecord() {
    return documentationInstanceRecord;
  }

  public void setDocumentationInstanceRecord(BQDocumentationExecuteInputModelDocumentationInstanceRecord documentationInstanceRecord) {
    this.documentationInstanceRecord = documentationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return documentationExecuteActionTaskRecord
  **/

  public Object getDocumentationExecuteActionTaskRecord() {
    return documentationExecuteActionTaskRecord;
  }

  public void setDocumentationExecuteActionTaskRecord(Object documentationExecuteActionTaskRecord) {
    this.documentationExecuteActionTaskRecord = documentationExecuteActionTaskRecord;
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

