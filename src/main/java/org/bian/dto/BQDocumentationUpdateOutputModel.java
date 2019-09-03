package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentationUpdateOutputModel
 */
public class BQDocumentationUpdateOutputModel   {
  private String documentationUpdateActionTaskReference = null;

  private Object documentationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return documentationUpdateActionTaskReference
  **/

  public String getDocumentationUpdateActionTaskReference() {
    return documentationUpdateActionTaskReference;
  }

  public void setDocumentationUpdateActionTaskReference(String documentationUpdateActionTaskReference) {
    this.documentationUpdateActionTaskReference = documentationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return documentationUpdateActionTaskRecord
  **/

  public Object getDocumentationUpdateActionTaskRecord() {
    return documentationUpdateActionTaskRecord;
  }

  public void setDocumentationUpdateActionTaskRecord(Object documentationUpdateActionTaskRecord) {
    this.documentationUpdateActionTaskRecord = documentationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

