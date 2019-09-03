package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPrecedentsUpdateInputModelPrecedentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPrecedentsUpdateOutputModel
 */
public class BQPrecedentsUpdateOutputModel   {
  private BQPrecedentsUpdateInputModelPrecedentsInstanceRecord precedentsInstanceRecord = null;

  private String precedentsUpdateActionTaskReference = null;

  private Object precedentsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get precedentsInstanceRecord
   * @return precedentsInstanceRecord
  **/

  public BQPrecedentsUpdateInputModelPrecedentsInstanceRecord getPrecedentsInstanceRecord() {
    return precedentsInstanceRecord;
  }

  public void setPrecedentsInstanceRecord(BQPrecedentsUpdateInputModelPrecedentsInstanceRecord precedentsInstanceRecord) {
    this.precedentsInstanceRecord = precedentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return precedentsUpdateActionTaskReference
  **/

  public String getPrecedentsUpdateActionTaskReference() {
    return precedentsUpdateActionTaskReference;
  }

  public void setPrecedentsUpdateActionTaskReference(String precedentsUpdateActionTaskReference) {
    this.precedentsUpdateActionTaskReference = precedentsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return precedentsUpdateActionTaskRecord
  **/

  public Object getPrecedentsUpdateActionTaskRecord() {
    return precedentsUpdateActionTaskRecord;
  }

  public void setPrecedentsUpdateActionTaskRecord(Object precedentsUpdateActionTaskRecord) {
    this.precedentsUpdateActionTaskRecord = precedentsUpdateActionTaskRecord;
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

