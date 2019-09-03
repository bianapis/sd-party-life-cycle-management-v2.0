package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentationRetrieveOutputModelDocumentationInstanceAnalysis
 */
public class BQDocumentationRetrieveOutputModelDocumentationInstanceAnalysis   {
  private Object documentationInstanceAnalysisRecord = null;

  private String documentationInstanceAnalysisReportType = null;

  private String documentationInstanceAnalysisParameters = null;

  private Object documentationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return documentationInstanceAnalysisRecord
  **/

  public Object getDocumentationInstanceAnalysisRecord() {
    return documentationInstanceAnalysisRecord;
  }

  public void setDocumentationInstanceAnalysisRecord(Object documentationInstanceAnalysisRecord) {
    this.documentationInstanceAnalysisRecord = documentationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return documentationInstanceAnalysisReportType
  **/

  public String getDocumentationInstanceAnalysisReportType() {
    return documentationInstanceAnalysisReportType;
  }

  public void setDocumentationInstanceAnalysisReportType(String documentationInstanceAnalysisReportType) {
    this.documentationInstanceAnalysisReportType = documentationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return documentationInstanceAnalysisParameters
  **/

  public String getDocumentationInstanceAnalysisParameters() {
    return documentationInstanceAnalysisParameters;
  }

  public void setDocumentationInstanceAnalysisParameters(String documentationInstanceAnalysisParameters) {
    this.documentationInstanceAnalysisParameters = documentationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return documentationInstanceAnalysisReport
  **/

  public Object getDocumentationInstanceAnalysisReport() {
    return documentationInstanceAnalysisReport;
  }

  public void setDocumentationInstanceAnalysisReport(Object documentationInstanceAnalysisReport) {
    this.documentationInstanceAnalysisReport = documentationInstanceAnalysisReport;
  }


}

