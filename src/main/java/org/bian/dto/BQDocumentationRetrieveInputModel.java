package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentationRetrieveInputModelDocumentationInstanceAnalysis;
import org.bian.dto.BQDocumentationRetrieveInputModelDocumentationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDocumentationRetrieveInputModel
 */
public class BQDocumentationRetrieveInputModel   {
  private Object documentationRetrieveActionTaskRecord = null;

  private String documentationRetrieveActionRequest = null;

  private BQDocumentationRetrieveInputModelDocumentationInstanceReport documentationInstanceReport = null;

  private BQDocumentationRetrieveInputModelDocumentationInstanceAnalysis documentationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return documentationRetrieveActionTaskRecord
  **/

  public Object getDocumentationRetrieveActionTaskRecord() {
    return documentationRetrieveActionTaskRecord;
  }

  public void setDocumentationRetrieveActionTaskRecord(Object documentationRetrieveActionTaskRecord) {
    this.documentationRetrieveActionTaskRecord = documentationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return documentationRetrieveActionRequest
  **/

  public String getDocumentationRetrieveActionRequest() {
    return documentationRetrieveActionRequest;
  }

  public void setDocumentationRetrieveActionRequest(String documentationRetrieveActionRequest) {
    this.documentationRetrieveActionRequest = documentationRetrieveActionRequest;
  }


  /**
   * Get documentationInstanceReport
   * @return documentationInstanceReport
  **/

  public BQDocumentationRetrieveInputModelDocumentationInstanceReport getDocumentationInstanceReport() {
    return documentationInstanceReport;
  }

  public void setDocumentationInstanceReport(BQDocumentationRetrieveInputModelDocumentationInstanceReport documentationInstanceReport) {
    this.documentationInstanceReport = documentationInstanceReport;
  }


  /**
   * Get documentationInstanceAnalysis
   * @return documentationInstanceAnalysis
  **/

  public BQDocumentationRetrieveInputModelDocumentationInstanceAnalysis getDocumentationInstanceAnalysis() {
    return documentationInstanceAnalysis;
  }

  public void setDocumentationInstanceAnalysis(BQDocumentationRetrieveInputModelDocumentationInstanceAnalysis documentationInstanceAnalysis) {
    this.documentationInstanceAnalysis = documentationInstanceAnalysis;
  }


}

