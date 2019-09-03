package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQualificationRetrieveOutputModelQualificationInstanceAnalysis
 */
public class BQQualificationRetrieveOutputModelQualificationInstanceAnalysis   {
  private Object qualificationInstanceAnalysisRecord = null;

  private String qualificationInstanceAnalysisReportType = null;

  private String qualificationInstanceAnalysisParameters = null;

  private Object qualificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return qualificationInstanceAnalysisRecord
  **/

  public Object getQualificationInstanceAnalysisRecord() {
    return qualificationInstanceAnalysisRecord;
  }

  public void setQualificationInstanceAnalysisRecord(Object qualificationInstanceAnalysisRecord) {
    this.qualificationInstanceAnalysisRecord = qualificationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return qualificationInstanceAnalysisReportType
  **/

  public String getQualificationInstanceAnalysisReportType() {
    return qualificationInstanceAnalysisReportType;
  }

  public void setQualificationInstanceAnalysisReportType(String qualificationInstanceAnalysisReportType) {
    this.qualificationInstanceAnalysisReportType = qualificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return qualificationInstanceAnalysisParameters
  **/

  public String getQualificationInstanceAnalysisParameters() {
    return qualificationInstanceAnalysisParameters;
  }

  public void setQualificationInstanceAnalysisParameters(String qualificationInstanceAnalysisParameters) {
    this.qualificationInstanceAnalysisParameters = qualificationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return qualificationInstanceAnalysisReport
  **/

  public Object getQualificationInstanceAnalysisReport() {
    return qualificationInstanceAnalysisReport;
  }

  public void setQualificationInstanceAnalysisReport(Object qualificationInstanceAnalysisReport) {
    this.qualificationInstanceAnalysisReport = qualificationInstanceAnalysisReport;
  }


}

