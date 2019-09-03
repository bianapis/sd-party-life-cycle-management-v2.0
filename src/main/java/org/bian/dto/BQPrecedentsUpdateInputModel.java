package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPrecedentsUpdateInputModelPrecedentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPrecedentsUpdateInputModel
 */
public class BQPrecedentsUpdateInputModel   {
  private String partyRelationshipProcedureInstanceReference = null;

  private String precedentsInstanceReference = null;

  private BQPrecedentsUpdateInputModelPrecedentsInstanceRecord precedentsInstanceRecord = null;

  private Object precedentsUpdateActionTaskRecord = null;

  private String precedentsUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Party Relationship Procedure instance 
   * @return partyRelationshipProcedureInstanceReference
  **/

  public String getPartyRelationshipProcedureInstanceReference() {
    return partyRelationshipProcedureInstanceReference;
  }

  public void setPartyRelationshipProcedureInstanceReference(String partyRelationshipProcedureInstanceReference) {
    this.partyRelationshipProcedureInstanceReference = partyRelationshipProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Precedents instance 
   * @return precedentsInstanceReference
  **/

  public String getPrecedentsInstanceReference() {
    return precedentsInstanceReference;
  }

  public void setPrecedentsInstanceReference(String precedentsInstanceReference) {
    this.precedentsInstanceReference = precedentsInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return precedentsUpdateActionRequest
  **/

  public String getPrecedentsUpdateActionRequest() {
    return precedentsUpdateActionRequest;
  }

  public void setPrecedentsUpdateActionRequest(String precedentsUpdateActionRequest) {
    this.precedentsUpdateActionRequest = precedentsUpdateActionRequest;
  }


}

