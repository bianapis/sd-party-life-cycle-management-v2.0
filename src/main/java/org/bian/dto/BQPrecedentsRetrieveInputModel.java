package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPrecedentsRetrieveInputModelPrecedentsInstanceAnalysis;
import org.bian.dto.BQPrecedentsRetrieveInputModelPrecedentsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPrecedentsRetrieveInputModel
 */
public class BQPrecedentsRetrieveInputModel   {
  private Object precedentsRetrieveActionTaskRecord = null;

  private String precedentsRetrieveActionRequest = null;

  private BQPrecedentsRetrieveInputModelPrecedentsInstanceReport precedentsInstanceReport = null;

  private BQPrecedentsRetrieveInputModelPrecedentsInstanceAnalysis precedentsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return precedentsRetrieveActionTaskRecord
  **/

  public Object getPrecedentsRetrieveActionTaskRecord() {
    return precedentsRetrieveActionTaskRecord;
  }

  public void setPrecedentsRetrieveActionTaskRecord(Object precedentsRetrieveActionTaskRecord) {
    this.precedentsRetrieveActionTaskRecord = precedentsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return precedentsRetrieveActionRequest
  **/

  public String getPrecedentsRetrieveActionRequest() {
    return precedentsRetrieveActionRequest;
  }

  public void setPrecedentsRetrieveActionRequest(String precedentsRetrieveActionRequest) {
    this.precedentsRetrieveActionRequest = precedentsRetrieveActionRequest;
  }


  /**
   * Get precedentsInstanceReport
   * @return precedentsInstanceReport
  **/

  public BQPrecedentsRetrieveInputModelPrecedentsInstanceReport getPrecedentsInstanceReport() {
    return precedentsInstanceReport;
  }

  public void setPrecedentsInstanceReport(BQPrecedentsRetrieveInputModelPrecedentsInstanceReport precedentsInstanceReport) {
    this.precedentsInstanceReport = precedentsInstanceReport;
  }


  /**
   * Get precedentsInstanceAnalysis
   * @return precedentsInstanceAnalysis
  **/

  public BQPrecedentsRetrieveInputModelPrecedentsInstanceAnalysis getPrecedentsInstanceAnalysis() {
    return precedentsInstanceAnalysis;
  }

  public void setPrecedentsInstanceAnalysis(BQPrecedentsRetrieveInputModelPrecedentsInstanceAnalysis precedentsInstanceAnalysis) {
    this.precedentsInstanceAnalysis = precedentsInstanceAnalysis;
  }


}

