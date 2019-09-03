package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord;
import org.bian.dto.CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceAnalysis;
import org.bian.dto.CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureRetrieveOutputModel
 */
public class CRPartyRelationshipProcedureRetrieveOutputModel   {
  private CRPartyRelationshipProcedureRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private String partyRelationshipProcedureRetrieveActionTaskReference = null;

  private Object partyRelationshipProcedureRetrieveActionTaskRecord = null;

  private String partyRelationshipProcedureRetrieveActionResponse = null;

  private CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceReportRecord partyRelationshipProcedureInstanceReportRecord = null;

  private CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceAnalysis partyRelationshipProcedureInstanceAnalysis = null;


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public CRPartyRelationshipProcedureRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(CRPartyRelationshipProcedureRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Relationship Procedure instance retrieve service call 
   * @return partyRelationshipProcedureRetrieveActionTaskReference
  **/

  public String getPartyRelationshipProcedureRetrieveActionTaskReference() {
    return partyRelationshipProcedureRetrieveActionTaskReference;
  }

  public void setPartyRelationshipProcedureRetrieveActionTaskReference(String partyRelationshipProcedureRetrieveActionTaskReference) {
    this.partyRelationshipProcedureRetrieveActionTaskReference = partyRelationshipProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return partyRelationshipProcedureRetrieveActionTaskRecord
  **/

  public Object getPartyRelationshipProcedureRetrieveActionTaskRecord() {
    return partyRelationshipProcedureRetrieveActionTaskRecord;
  }

  public void setPartyRelationshipProcedureRetrieveActionTaskRecord(Object partyRelationshipProcedureRetrieveActionTaskRecord) {
    this.partyRelationshipProcedureRetrieveActionTaskRecord = partyRelationshipProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return partyRelationshipProcedureRetrieveActionResponse
  **/

  public String getPartyRelationshipProcedureRetrieveActionResponse() {
    return partyRelationshipProcedureRetrieveActionResponse;
  }

  public void setPartyRelationshipProcedureRetrieveActionResponse(String partyRelationshipProcedureRetrieveActionResponse) {
    this.partyRelationshipProcedureRetrieveActionResponse = partyRelationshipProcedureRetrieveActionResponse;
  }


  /**
   * Get partyRelationshipProcedureInstanceReportRecord
   * @return partyRelationshipProcedureInstanceReportRecord
  **/

  public CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceReportRecord getPartyRelationshipProcedureInstanceReportRecord() {
    return partyRelationshipProcedureInstanceReportRecord;
  }

  public void setPartyRelationshipProcedureInstanceReportRecord(CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceReportRecord partyRelationshipProcedureInstanceReportRecord) {
    this.partyRelationshipProcedureInstanceReportRecord = partyRelationshipProcedureInstanceReportRecord;
  }


  /**
   * Get partyRelationshipProcedureInstanceAnalysis
   * @return partyRelationshipProcedureInstanceAnalysis
  **/

  public CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceAnalysis getPartyRelationshipProcedureInstanceAnalysis() {
    return partyRelationshipProcedureInstanceAnalysis;
  }

  public void setPartyRelationshipProcedureInstanceAnalysis(CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceAnalysis partyRelationshipProcedureInstanceAnalysis) {
    this.partyRelationshipProcedureInstanceAnalysis = partyRelationshipProcedureInstanceAnalysis;
  }


}

