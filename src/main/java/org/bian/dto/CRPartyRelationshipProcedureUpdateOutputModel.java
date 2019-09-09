package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureUpdateOutputModel
 */
public class CRPartyRelationshipProcedureUpdateOutputModel   {
  private CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private String partyRelationshipProcedureUpdateActionTaskReference = null;

  private Object partyRelationshipProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }
  @JsonProperty("cRPartyRelationshipProcedureInstanceRecord")
  public void setCRPartyRelationshipProcedureInstanceRecord(CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
    this.cRPartyRelationshipProcedureInstanceRecord = cRPartyRelationshipProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return customerPrecedentProfileUpdateLog
  **/

  public String getCustomerPrecedentProfileUpdateLog() {
    return customerPrecedentProfileUpdateLog;
  }

  public void setCustomerPrecedentProfileUpdateLog(String customerPrecedentProfileUpdateLog) {
    this.customerPrecedentProfileUpdateLog = customerPrecedentProfileUpdateLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return partyRelationshipProcedureUpdateActionTaskReference
  **/

  public String getPartyRelationshipProcedureUpdateActionTaskReference() {
    return partyRelationshipProcedureUpdateActionTaskReference;
  }

  public void setPartyRelationshipProcedureUpdateActionTaskReference(String partyRelationshipProcedureUpdateActionTaskReference) {
    this.partyRelationshipProcedureUpdateActionTaskReference = partyRelationshipProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return partyRelationshipProcedureUpdateActionTaskRecord
  **/

  public Object getPartyRelationshipProcedureUpdateActionTaskRecord() {
    return partyRelationshipProcedureUpdateActionTaskRecord;
  }

  public void setPartyRelationshipProcedureUpdateActionTaskRecord(Object partyRelationshipProcedureUpdateActionTaskRecord) {
    this.partyRelationshipProcedureUpdateActionTaskRecord = partyRelationshipProcedureUpdateActionTaskRecord;
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

