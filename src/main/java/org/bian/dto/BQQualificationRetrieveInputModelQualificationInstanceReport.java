package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQualificationRetrieveInputModelQualificationInstanceReport
 */
public class BQQualificationRetrieveInputModelQualificationInstanceReport   {
  private String qualificationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return qualificationInstanceReportReference
  **/

  public String getQualificationInstanceReportReference() {
    return qualificationInstanceReportReference;
  }

  public void setQualificationInstanceReportReference(String qualificationInstanceReportReference) {
    this.qualificationInstanceReportReference = qualificationInstanceReportReference;
  }


}

