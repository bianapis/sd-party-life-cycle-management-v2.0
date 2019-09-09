package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecord;
import org.bian.dto.BQDocumentationRequestInputModelDocumentationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDocumentationRequestOutputModel
 */
public class BQDocumentationRequestOutputModel   {
  private BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private BQDocumentationRequestInputModelDocumentationInstanceRecord documentationInstanceRecord = null;

  private String documentationRequestActionTaskReference = null;

  private Object documentationRequestActionTaskRecord = null;

  private String documentationRequestRecordReference = null;

  private Object requestResponseRecord = null;


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

  public BQDocumentationRequestInputModelDocumentationInstanceRecord getDocumentationInstanceRecord() {
    return documentationInstanceRecord;
  }

  public void setDocumentationInstanceRecord(BQDocumentationRequestInputModelDocumentationInstanceRecord documentationInstanceRecord) {
    this.documentationInstanceRecord = documentationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Documentation instance request service call 
   * @return documentationRequestActionTaskReference
  **/

  public String getDocumentationRequestActionTaskReference() {
    return documentationRequestActionTaskReference;
  }

  public void setDocumentationRequestActionTaskReference(String documentationRequestActionTaskReference) {
    this.documentationRequestActionTaskReference = documentationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return documentationRequestActionTaskRecord
  **/

  public Object getDocumentationRequestActionTaskRecord() {
    return documentationRequestActionTaskRecord;
  }

  public void setDocumentationRequestActionTaskRecord(Object documentationRequestActionTaskRecord) {
    this.documentationRequestActionTaskRecord = documentationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Documentation service request record 
   * @return documentationRequestRecordReference
  **/

  public String getDocumentationRequestRecordReference() {
    return documentationRequestRecordReference;
  }

  public void setDocumentationRequestRecordReference(String documentationRequestRecordReference) {
    this.documentationRequestRecordReference = documentationRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

