package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentationRetrieveOutputModelDocumentationInstanceReport
 */
public class BQDocumentationRetrieveOutputModelDocumentationInstanceReport   {
  private Object documentationInstanceReportRecord = null;

  private String documentationInstanceReportType = null;

  private String documentationInstanceReportParameters = null;

  private Object documentationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return documentationInstanceReportRecord
  **/

  public Object getDocumentationInstanceReportRecord() {
    return documentationInstanceReportRecord;
  }

  public void setDocumentationInstanceReportRecord(Object documentationInstanceReportRecord) {
    this.documentationInstanceReportRecord = documentationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return documentationInstanceReportType
  **/

  public String getDocumentationInstanceReportType() {
    return documentationInstanceReportType;
  }

  public void setDocumentationInstanceReportType(String documentationInstanceReportType) {
    this.documentationInstanceReportType = documentationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return documentationInstanceReportParameters
  **/

  public String getDocumentationInstanceReportParameters() {
    return documentationInstanceReportParameters;
  }

  public void setDocumentationInstanceReportParameters(String documentationInstanceReportParameters) {
    this.documentationInstanceReportParameters = documentationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return documentationInstanceReport
  **/

  public Object getDocumentationInstanceReport() {
    return documentationInstanceReport;
  }

  public void setDocumentationInstanceReport(Object documentationInstanceReport) {
    this.documentationInstanceReport = documentationInstanceReport;
  }


}

