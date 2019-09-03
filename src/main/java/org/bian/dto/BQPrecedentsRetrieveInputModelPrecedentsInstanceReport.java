package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPrecedentsRetrieveInputModelPrecedentsInstanceReport
 */
public class BQPrecedentsRetrieveInputModelPrecedentsInstanceReport   {
  private String precedentsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return precedentsInstanceReportReference
  **/

  public String getPrecedentsInstanceReportReference() {
    return precedentsInstanceReportReference;
  }

  public void setPrecedentsInstanceReportReference(String precedentsInstanceReportReference) {
    this.precedentsInstanceReportReference = precedentsInstanceReportReference;
  }


}

