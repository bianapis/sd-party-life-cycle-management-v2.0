package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureInitiateOutputModel
 */
public class CRPartyRelationshipProcedureInitiateOutputModel   {
  private String partyRelationshipProcedureInstanceReference = null;

  private String partyRelationshipProcedureInitiateActionReference = null;

  private Object partyRelationshipProcedureInitiateActionRecord = null;

  private String partyRelationshipProcedureInstanceStatus = null;

  private CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Party Relationship Procedure instance 
   * @return partyRelationshipProcedureInstanceReference
  **/

  public String getPartyRelationshipProcedureInstanceReference() {
    return partyRelationshipProcedureInstanceReference;
  }

  public void setPartyRelationshipProcedureInstanceReference(String partyRelationshipProcedureInstanceReference) {
    this.partyRelationshipProcedureInstanceReference = partyRelationshipProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return partyRelationshipProcedureInitiateActionReference
  **/

  public String getPartyRelationshipProcedureInitiateActionReference() {
    return partyRelationshipProcedureInitiateActionReference;
  }

  public void setPartyRelationshipProcedureInitiateActionReference(String partyRelationshipProcedureInitiateActionReference) {
    this.partyRelationshipProcedureInitiateActionReference = partyRelationshipProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return partyRelationshipProcedureInitiateActionRecord
  **/

  public Object getPartyRelationshipProcedureInitiateActionRecord() {
    return partyRelationshipProcedureInitiateActionRecord;
  }

  public void setPartyRelationshipProcedureInitiateActionRecord(Object partyRelationshipProcedureInitiateActionRecord) {
    this.partyRelationshipProcedureInitiateActionRecord = partyRelationshipProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Party Relationship Procedure instance (e.g. initialised, pending, active) 
   * @return partyRelationshipProcedureInstanceStatus
  **/

  public String getPartyRelationshipProcedureInstanceStatus() {
    return partyRelationshipProcedureInstanceStatus;
  }

  public void setPartyRelationshipProcedureInstanceStatus(String partyRelationshipProcedureInstanceStatus) {
    this.partyRelationshipProcedureInstanceStatus = partyRelationshipProcedureInstanceStatus;
  }


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }
   @JsonProperty("cRPartyRelationshipProcedureInstanceRecord")
  public void setCRPartyRelationshipProcedureInstanceRecord(CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
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


}

