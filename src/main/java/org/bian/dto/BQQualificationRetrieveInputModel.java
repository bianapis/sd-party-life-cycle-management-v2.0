package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQualificationRetrieveInputModelQualificationInstanceAnalysis;
import org.bian.dto.BQQualificationRetrieveInputModelQualificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQQualificationRetrieveInputModel
 */
public class BQQualificationRetrieveInputModel   {
  private Object qualificationRetrieveActionTaskRecord = null;

  private String qualificationRetrieveActionRequest = null;

  private BQQualificationRetrieveInputModelQualificationInstanceReport qualificationInstanceReport = null;

  private BQQualificationRetrieveInputModelQualificationInstanceAnalysis qualificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return qualificationRetrieveActionTaskRecord
  **/

  public Object getQualificationRetrieveActionTaskRecord() {
    return qualificationRetrieveActionTaskRecord;
  }

  public void setQualificationRetrieveActionTaskRecord(Object qualificationRetrieveActionTaskRecord) {
    this.qualificationRetrieveActionTaskRecord = qualificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return qualificationRetrieveActionRequest
  **/

  public String getQualificationRetrieveActionRequest() {
    return qualificationRetrieveActionRequest;
  }

  public void setQualificationRetrieveActionRequest(String qualificationRetrieveActionRequest) {
    this.qualificationRetrieveActionRequest = qualificationRetrieveActionRequest;
  }


  /**
   * Get qualificationInstanceReport
   * @return qualificationInstanceReport
  **/

  public BQQualificationRetrieveInputModelQualificationInstanceReport getQualificationInstanceReport() {
    return qualificationInstanceReport;
  }

  public void setQualificationInstanceReport(BQQualificationRetrieveInputModelQualificationInstanceReport qualificationInstanceReport) {
    this.qualificationInstanceReport = qualificationInstanceReport;
  }


  /**
   * Get qualificationInstanceAnalysis
   * @return qualificationInstanceAnalysis
  **/

  public BQQualificationRetrieveInputModelQualificationInstanceAnalysis getQualificationInstanceAnalysis() {
    return qualificationInstanceAnalysis;
  }

  public void setQualificationInstanceAnalysis(BQQualificationRetrieveInputModelQualificationInstanceAnalysis qualificationInstanceAnalysis) {
    this.qualificationInstanceAnalysis = qualificationInstanceAnalysis;
  }


}

