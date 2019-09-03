package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPrecedentsRetrieveOutputModelPrecedentsInstanceRecord
 */
public class BQPrecedentsRetrieveOutputModelPrecedentsInstanceRecord   {
  private String precedentType = null;

  private String customerPrecedentReference = null;

  private String customerPrecedentValue = null;

  private String customerPrecedentValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of party property tracked (e.g. residential status, marital status, military, in a disaster location, etc.) 
   * @return precedentType
  **/

  public String getPrecedentType() {
    return precedentType;
  }

  public void setPrecedentType(String precedentType) {
    this.precedentType = precedentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the tracked value 
   * @return customerPrecedentReference
  **/

  public String getCustomerPrecedentReference() {
    return customerPrecedentReference;
  }

  public void setCustomerPrecedentReference(String customerPrecedentReference) {
    this.customerPrecedentReference = customerPrecedentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Current (and historical) value of the precedent 
   * @return customerPrecedentValue
  **/

  public String getCustomerPrecedentValue() {
    return customerPrecedentValue;
  }

  public void setCustomerPrecedentValue(String customerPrecedentValue) {
    this.customerPrecedentValue = customerPrecedentValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date when the value was last checked/confirmed 
   * @return customerPrecedentValueDate
  **/

  public String getCustomerPrecedentValueDate() {
    return customerPrecedentValueDate;
  }

  public void setCustomerPrecedentValueDate(String customerPrecedentValueDate) {
    this.customerPrecedentValueDate = customerPrecedentValueDate;
  }


}

