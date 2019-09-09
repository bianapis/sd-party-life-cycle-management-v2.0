package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentationExecuteInputModelDocumentationInstanceRecord;
import org.bian.dto.BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDocumentationExecuteOutputModel
 */
public class BQDocumentationExecuteOutputModel   {
  private BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private BQDocumentationExecuteInputModelDocumentationInstanceRecord documentationInstanceRecord = null;

  private String documentationExecuteActionTaskReference = null;

  private Object documentationExecuteActionTaskRecord = null;

  private String documentationExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }
  @JsonProperty("cRPartyRelationshipProcedureInstanceRecord")
  public void setCRPartyRelationshipProcedureInstanceRecord(BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Documentation instance execute service call 
   * @return documentationExecuteActionTaskReference
  **/

  public String getDocumentationExecuteActionTaskReference() {
    return documentationExecuteActionTaskReference;
  }

  public void setDocumentationExecuteActionTaskReference(String documentationExecuteActionTaskReference) {
    this.documentationExecuteActionTaskReference = documentationExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Documentation execute transaction/record 
   * @return documentationExecuteRecordReference
  **/

  public String getDocumentationExecuteRecordReference() {
    return documentationExecuteRecordReference;
  }

  public void setDocumentationExecuteRecordReference(String documentationExecuteRecordReference) {
    this.documentationExecuteRecordReference = documentationExecuteRecordReference;
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

