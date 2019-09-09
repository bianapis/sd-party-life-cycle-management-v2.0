package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureRequestOutputModel
 */
public class CRPartyRelationshipProcedureRequestOutputModel   {
  private CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private String partyRelationshipProcedureRequestActionTaskReference = null;

  private Object partyRelationshipProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Relationship Procedure instance request service call 
   * @return partyRelationshipProcedureRequestActionTaskReference
  **/

  public String getPartyRelationshipProcedureRequestActionTaskReference() {
    return partyRelationshipProcedureRequestActionTaskReference;
  }

  public void setPartyRelationshipProcedureRequestActionTaskReference(String partyRelationshipProcedureRequestActionTaskReference) {
    this.partyRelationshipProcedureRequestActionTaskReference = partyRelationshipProcedureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return partyRelationshipProcedureRequestActionTaskRecord
  **/

  public Object getPartyRelationshipProcedureRequestActionTaskRecord() {
    return partyRelationshipProcedureRequestActionTaskRecord;
  }

  public void setPartyRelationshipProcedureRequestActionTaskRecord(Object partyRelationshipProcedureRequestActionTaskRecord) {
    this.partyRelationshipProcedureRequestActionTaskRecord = partyRelationshipProcedureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

