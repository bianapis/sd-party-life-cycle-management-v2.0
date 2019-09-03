package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceAnalysis;
import org.bian.dto.CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureRetrieveInputModel
 */
public class CRPartyRelationshipProcedureRetrieveInputModel   {
  private Object partyRelationshipProcedureRetrieveActionTaskRecord = null;

  private String partyRelationshipProcedureRetrieveActionRequest = null;

  private CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceReportRecord partyRelationshipProcedureInstanceReportRecord = null;

  private CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceAnalysis partyRelationshipProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return partyRelationshipProcedureRetrieveActionRequest
  **/

  public String getPartyRelationshipProcedureRetrieveActionRequest() {
    return partyRelationshipProcedureRetrieveActionRequest;
  }

  public void setPartyRelationshipProcedureRetrieveActionRequest(String partyRelationshipProcedureRetrieveActionRequest) {
    this.partyRelationshipProcedureRetrieveActionRequest = partyRelationshipProcedureRetrieveActionRequest;
  }


  /**
   * Get partyRelationshipProcedureInstanceReportRecord
   * @return partyRelationshipProcedureInstanceReportRecord
  **/

  public CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceReportRecord getPartyRelationshipProcedureInstanceReportRecord() {
    return partyRelationshipProcedureInstanceReportRecord;
  }

  public void setPartyRelationshipProcedureInstanceReportRecord(CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceReportRecord partyRelationshipProcedureInstanceReportRecord) {
    this.partyRelationshipProcedureInstanceReportRecord = partyRelationshipProcedureInstanceReportRecord;
  }


  /**
   * Get partyRelationshipProcedureInstanceAnalysis
   * @return partyRelationshipProcedureInstanceAnalysis
  **/

  public CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceAnalysis getPartyRelationshipProcedureInstanceAnalysis() {
    return partyRelationshipProcedureInstanceAnalysis;
  }

  public void setPartyRelationshipProcedureInstanceAnalysis(CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceAnalysis partyRelationshipProcedureInstanceAnalysis) {
    this.partyRelationshipProcedureInstanceAnalysis = partyRelationshipProcedureInstanceAnalysis;
  }


}

