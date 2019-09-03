package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQualificationRetrieveOutputModelQualificationInstanceReport
 */
public class BQQualificationRetrieveOutputModelQualificationInstanceReport   {
  private Object qualificationInstanceReportRecord = null;

  private String qualificationInstanceReportType = null;

  private String qualificationInstanceReportParameters = null;

  private Object qualificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return qualificationInstanceReportRecord
  **/

  public Object getQualificationInstanceReportRecord() {
    return qualificationInstanceReportRecord;
  }

  public void setQualificationInstanceReportRecord(Object qualificationInstanceReportRecord) {
    this.qualificationInstanceReportRecord = qualificationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return qualificationInstanceReportType
  **/

  public String getQualificationInstanceReportType() {
    return qualificationInstanceReportType;
  }

  public void setQualificationInstanceReportType(String qualificationInstanceReportType) {
    this.qualificationInstanceReportType = qualificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return qualificationInstanceReportParameters
  **/

  public String getQualificationInstanceReportParameters() {
    return qualificationInstanceReportParameters;
  }

  public void setQualificationInstanceReportParameters(String qualificationInstanceReportParameters) {
    this.qualificationInstanceReportParameters = qualificationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return qualificationInstanceReport
  **/

  public Object getQualificationInstanceReport() {
    return qualificationInstanceReport;
  }

  public void setQualificationInstanceReport(Object qualificationInstanceReport) {
    this.qualificationInstanceReport = qualificationInstanceReport;
  }


}

