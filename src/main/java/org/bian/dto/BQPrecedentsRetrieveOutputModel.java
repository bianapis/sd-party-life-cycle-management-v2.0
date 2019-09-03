package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPrecedentsRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord;
import org.bian.dto.BQPrecedentsRetrieveOutputModelPrecedentsInstanceAnalysis;
import org.bian.dto.BQPrecedentsRetrieveOutputModelPrecedentsInstanceRecord;
import org.bian.dto.BQPrecedentsRetrieveOutputModelPrecedentsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPrecedentsRetrieveOutputModel
 */
public class BQPrecedentsRetrieveOutputModel   {
  private BQPrecedentsRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private BQPrecedentsRetrieveOutputModelPrecedentsInstanceRecord precedentsInstanceRecord = null;

  private String precedentsRetrieveActionTaskReference = null;

  private Object precedentsRetrieveActionTaskRecord = null;

  private String precedentsRetrieveActionResponse = null;

  private BQPrecedentsRetrieveOutputModelPrecedentsInstanceReport precedentsInstanceReport = null;

  private BQPrecedentsRetrieveOutputModelPrecedentsInstanceAnalysis precedentsInstanceAnalysis = null;


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public BQPrecedentsRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }

  public void setCRPartyRelationshipProcedureInstanceRecord(BQPrecedentsRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
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
   * Get precedentsInstanceRecord
   * @return precedentsInstanceRecord
  **/

  public BQPrecedentsRetrieveOutputModelPrecedentsInstanceRecord getPrecedentsInstanceRecord() {
    return precedentsInstanceRecord;
  }

  public void setPrecedentsInstanceRecord(BQPrecedentsRetrieveOutputModelPrecedentsInstanceRecord precedentsInstanceRecord) {
    this.precedentsInstanceRecord = precedentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Precedents instance retrieve service call 
   * @return precedentsRetrieveActionTaskReference
  **/

  public String getPrecedentsRetrieveActionTaskReference() {
    return precedentsRetrieveActionTaskReference;
  }

  public void setPrecedentsRetrieveActionTaskReference(String precedentsRetrieveActionTaskReference) {
    this.precedentsRetrieveActionTaskReference = precedentsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return precedentsRetrieveActionTaskRecord
  **/

  public Object getPrecedentsRetrieveActionTaskRecord() {
    return precedentsRetrieveActionTaskRecord;
  }

  public void setPrecedentsRetrieveActionTaskRecord(Object precedentsRetrieveActionTaskRecord) {
    this.precedentsRetrieveActionTaskRecord = precedentsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return precedentsRetrieveActionResponse
  **/

  public String getPrecedentsRetrieveActionResponse() {
    return precedentsRetrieveActionResponse;
  }

  public void setPrecedentsRetrieveActionResponse(String precedentsRetrieveActionResponse) {
    this.precedentsRetrieveActionResponse = precedentsRetrieveActionResponse;
  }


  /**
   * Get precedentsInstanceReport
   * @return precedentsInstanceReport
  **/

  public BQPrecedentsRetrieveOutputModelPrecedentsInstanceReport getPrecedentsInstanceReport() {
    return precedentsInstanceReport;
  }

  public void setPrecedentsInstanceReport(BQPrecedentsRetrieveOutputModelPrecedentsInstanceReport precedentsInstanceReport) {
    this.precedentsInstanceReport = precedentsInstanceReport;
  }


  /**
   * Get precedentsInstanceAnalysis
   * @return precedentsInstanceAnalysis
  **/

  public BQPrecedentsRetrieveOutputModelPrecedentsInstanceAnalysis getPrecedentsInstanceAnalysis() {
    return precedentsInstanceAnalysis;
  }

  public void setPrecedentsInstanceAnalysis(BQPrecedentsRetrieveOutputModelPrecedentsInstanceAnalysis precedentsInstanceAnalysis) {
    this.precedentsInstanceAnalysis = precedentsInstanceAnalysis;
  }


}

