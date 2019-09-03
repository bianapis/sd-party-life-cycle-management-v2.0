package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceAnalysis
 */
public class CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceAnalysis   {
  private String partyRelationshipProcedureInstanceAnalysisReference = null;

  private String partyRelationshipProcedureInstanceAnalysisReportType = null;

  private String partyRelationshipProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return partyRelationshipProcedureInstanceAnalysisReference
  **/

  public String getPartyRelationshipProcedureInstanceAnalysisReference() {
    return partyRelationshipProcedureInstanceAnalysisReference;
  }

  public void setPartyRelationshipProcedureInstanceAnalysisReference(String partyRelationshipProcedureInstanceAnalysisReference) {
    this.partyRelationshipProcedureInstanceAnalysisReference = partyRelationshipProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return partyRelationshipProcedureInstanceAnalysisParameters
  **/

  public String getPartyRelationshipProcedureInstanceAnalysisParameters() {
    return partyRelationshipProcedureInstanceAnalysisParameters;
  }

  public void setPartyRelationshipProcedureInstanceAnalysisParameters(String partyRelationshipProcedureInstanceAnalysisParameters) {
    this.partyRelationshipProcedureInstanceAnalysisParameters = partyRelationshipProcedureInstanceAnalysisParameters;
  }


}

