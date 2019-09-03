package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPrecedentsRetrieveOutputModelPrecedentsInstanceAnalysis
 */
public class BQPrecedentsRetrieveOutputModelPrecedentsInstanceAnalysis   {
  private Object precedentsInstanceAnalysisRecord = null;

  private String precedentsInstanceAnalysisReportType = null;

  private String precedentsInstanceAnalysisParameters = null;

  private Object precedentsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return precedentsInstanceAnalysisRecord
  **/

  public Object getPrecedentsInstanceAnalysisRecord() {
    return precedentsInstanceAnalysisRecord;
  }

  public void setPrecedentsInstanceAnalysisRecord(Object precedentsInstanceAnalysisRecord) {
    this.precedentsInstanceAnalysisRecord = precedentsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return precedentsInstanceAnalysisReportType
  **/

  public String getPrecedentsInstanceAnalysisReportType() {
    return precedentsInstanceAnalysisReportType;
  }

  public void setPrecedentsInstanceAnalysisReportType(String precedentsInstanceAnalysisReportType) {
    this.precedentsInstanceAnalysisReportType = precedentsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return precedentsInstanceAnalysisParameters
  **/

  public String getPrecedentsInstanceAnalysisParameters() {
    return precedentsInstanceAnalysisParameters;
  }

  public void setPrecedentsInstanceAnalysisParameters(String precedentsInstanceAnalysisParameters) {
    this.precedentsInstanceAnalysisParameters = precedentsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return precedentsInstanceAnalysisReport
  **/

  public Object getPrecedentsInstanceAnalysisReport() {
    return precedentsInstanceAnalysisReport;
  }

  public void setPrecedentsInstanceAnalysisReport(Object precedentsInstanceAnalysisReport) {
    this.precedentsInstanceAnalysisReport = precedentsInstanceAnalysisReport;
  }


}

