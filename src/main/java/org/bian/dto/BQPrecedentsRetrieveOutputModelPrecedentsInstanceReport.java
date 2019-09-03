package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPrecedentsRetrieveOutputModelPrecedentsInstanceReport
 */
public class BQPrecedentsRetrieveOutputModelPrecedentsInstanceReport   {
  private Object precedentsInstanceReportRecord = null;

  private String precedentsInstanceReportType = null;

  private String precedentsInstanceReportParameters = null;

  private Object precedentsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return precedentsInstanceReportRecord
  **/

  public Object getPrecedentsInstanceReportRecord() {
    return precedentsInstanceReportRecord;
  }

  public void setPrecedentsInstanceReportRecord(Object precedentsInstanceReportRecord) {
    this.precedentsInstanceReportRecord = precedentsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return precedentsInstanceReportType
  **/

  public String getPrecedentsInstanceReportType() {
    return precedentsInstanceReportType;
  }

  public void setPrecedentsInstanceReportType(String precedentsInstanceReportType) {
    this.precedentsInstanceReportType = precedentsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return precedentsInstanceReportParameters
  **/

  public String getPrecedentsInstanceReportParameters() {
    return precedentsInstanceReportParameters;
  }

  public void setPrecedentsInstanceReportParameters(String precedentsInstanceReportParameters) {
    this.precedentsInstanceReportParameters = precedentsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return precedentsInstanceReport
  **/

  public Object getPrecedentsInstanceReport() {
    return precedentsInstanceReport;
  }

  public void setPrecedentsInstanceReport(Object precedentsInstanceReport) {
    this.precedentsInstanceReport = precedentsInstanceReport;
  }


}

