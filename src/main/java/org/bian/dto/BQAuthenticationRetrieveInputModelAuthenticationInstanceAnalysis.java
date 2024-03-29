package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveInputModelAuthenticationInstanceAnalysis
 */
public class BQAuthenticationRetrieveInputModelAuthenticationInstanceAnalysis   {
  private String authenticationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return authenticationInstanceAnalysisReference
  **/

  public String getAuthenticationInstanceAnalysisReference() {
    return authenticationInstanceAnalysisReference;
  }

  public void setAuthenticationInstanceAnalysisReference(String authenticationInstanceAnalysisReference) {
    this.authenticationInstanceAnalysisReference = authenticationInstanceAnalysisReference;
  }


}

