package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentationRetrieveInputModelDocumentationInstanceAnalysis
 */
public class BQDocumentationRetrieveInputModelDocumentationInstanceAnalysis   {
  private String documentationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return documentationInstanceAnalysisReference
  **/

  public String getDocumentationInstanceAnalysisReference() {
    return documentationInstanceAnalysisReference;
  }

  public void setDocumentationInstanceAnalysisReference(String documentationInstanceAnalysisReference) {
    this.documentationInstanceAnalysisReference = documentationInstanceAnalysisReference;
  }


}

