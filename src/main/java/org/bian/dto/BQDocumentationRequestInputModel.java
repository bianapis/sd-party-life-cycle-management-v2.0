package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentationRequestInputModelCRPartyRelationshipProcedureInstanceRecord;
import org.bian.dto.BQDocumentationRequestInputModelDocumentationInstanceRecord;
import org.bian.dto.CRPartyRelationshipProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQDocumentationRequestInputModel
 */
public class BQDocumentationRequestInputModel   {
  private BQDocumentationRequestInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private String partyRelationshipProcedureInstanceReference = null;

  private String documentationInstanceReference = null;

  private BQDocumentationRequestInputModelDocumentationInstanceRecord documentationInstanceRecord = null;

  private Object documentationRequestActionTaskRecord = null;

  private CRPartyRelationshipProcedureRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public BQDocumentationRequestInputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(BQDocumentationRequestInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
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

  public BQDocumentationRequestInputModelDocumentationInstanceRecord getDocumentationInstanceRecord() {
    return documentationInstanceRecord;
  }

  public void setDocumentationInstanceRecord(BQDocumentationRequestInputModelDocumentationInstanceRecord documentationInstanceRecord) {
    this.documentationInstanceRecord = documentationInstanceRecord;
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

