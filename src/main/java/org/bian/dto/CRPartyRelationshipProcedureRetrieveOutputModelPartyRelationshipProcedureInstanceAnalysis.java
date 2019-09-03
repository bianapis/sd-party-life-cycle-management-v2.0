package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceAnalysis
 */
public class CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceAnalysis   {
  private String partyRelationshipProcedureInstanceAnalysisData = null;

  private String partyRelationshipProcedureInstanceAnalysisReportType = null;

  private Object partyRelationshipProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return partyRelationshipProcedureInstanceAnalysisData
  **/

  public String getPartyRelationshipProcedureInstanceAnalysisData() {
    return partyRelationshipProcedureInstanceAnalysisData;
  }

  public void setPartyRelationshipProcedureInstanceAnalysisData(String partyRelationshipProcedureInstanceAnalysisData) {
    this.partyRelationshipProcedureInstanceAnalysisData = partyRelationshipProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return partyRelationshipProcedureInstanceAnalysisReportType
  **/

  public String getPartyRelationshipProcedureInstanceAnalysisReportType() {
    return partyRelationshipProcedureInstanceAnalysisReportType;
  }

  public void setPartyRelationshipProcedureInstanceAnalysisReportType(String partyRelationshipProcedureInstanceAnalysisReportType) {
    this.partyRelationshipProcedureInstanceAnalysisReportType = partyRelationshipProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return partyRelationshipProcedureInstanceAnalysisReport
  **/

  public Object getPartyRelationshipProcedureInstanceAnalysisReport() {
    return partyRelationshipProcedureInstanceAnalysisReport;
  }

  public void setPartyRelationshipProcedureInstanceAnalysisReport(Object partyRelationshipProcedureInstanceAnalysisReport) {
    this.partyRelationshipProcedureInstanceAnalysisReport = partyRelationshipProcedureInstanceAnalysisReport;
  }


}

