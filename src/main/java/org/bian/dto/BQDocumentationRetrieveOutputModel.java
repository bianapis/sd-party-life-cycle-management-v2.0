package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentationRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord;
import org.bian.dto.BQDocumentationRetrieveOutputModelDocumentationInstanceAnalysis;
import org.bian.dto.BQDocumentationRetrieveOutputModelDocumentationInstanceRecord;
import org.bian.dto.BQDocumentationRetrieveOutputModelDocumentationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDocumentationRetrieveOutputModel
 */
public class BQDocumentationRetrieveOutputModel   {
  private BQDocumentationRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private BQDocumentationRetrieveOutputModelDocumentationInstanceRecord documentationInstanceRecord = null;

  private String documentationRetrieveActionTaskReference = null;

  private Object documentationRetrieveActionTaskRecord = null;

  private String documentationRetrieveActionResponse = null;

  private BQDocumentationRetrieveOutputModelDocumentationInstanceReport documentationInstanceReport = null;

  private BQDocumentationRetrieveOutputModelDocumentationInstanceAnalysis documentationInstanceAnalysis = null;


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public BQDocumentationRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(BQDocumentationRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
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

  public BQDocumentationRetrieveOutputModelDocumentationInstanceRecord getDocumentationInstanceRecord() {
    return documentationInstanceRecord;
  }

  public void setDocumentationInstanceRecord(BQDocumentationRetrieveOutputModelDocumentationInstanceRecord documentationInstanceRecord) {
    this.documentationInstanceRecord = documentationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Documentation instance retrieve service call 
   * @return documentationRetrieveActionTaskReference
  **/

  public String getDocumentationRetrieveActionTaskReference() {
    return documentationRetrieveActionTaskReference;
  }

  public void setDocumentationRetrieveActionTaskReference(String documentationRetrieveActionTaskReference) {
    this.documentationRetrieveActionTaskReference = documentationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return documentationRetrieveActionTaskRecord
  **/

  public Object getDocumentationRetrieveActionTaskRecord() {
    return documentationRetrieveActionTaskRecord;
  }

  public void setDocumentationRetrieveActionTaskRecord(Object documentationRetrieveActionTaskRecord) {
    this.documentationRetrieveActionTaskRecord = documentationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return documentationRetrieveActionResponse
  **/

  public String getDocumentationRetrieveActionResponse() {
    return documentationRetrieveActionResponse;
  }

  public void setDocumentationRetrieveActionResponse(String documentationRetrieveActionResponse) {
    this.documentationRetrieveActionResponse = documentationRetrieveActionResponse;
  }


  /**
   * Get documentationInstanceReport
   * @return documentationInstanceReport
  **/

  public BQDocumentationRetrieveOutputModelDocumentationInstanceReport getDocumentationInstanceReport() {
    return documentationInstanceReport;
  }

  public void setDocumentationInstanceReport(BQDocumentationRetrieveOutputModelDocumentationInstanceReport documentationInstanceReport) {
    this.documentationInstanceReport = documentationInstanceReport;
  }


  /**
   * Get documentationInstanceAnalysis
   * @return documentationInstanceAnalysis
  **/

  public BQDocumentationRetrieveOutputModelDocumentationInstanceAnalysis getDocumentationInstanceAnalysis() {
    return documentationInstanceAnalysis;
  }

  public void setDocumentationInstanceAnalysis(BQDocumentationRetrieveOutputModelDocumentationInstanceAnalysis documentationInstanceAnalysis) {
    this.documentationInstanceAnalysis = documentationInstanceAnalysis;
  }


}

