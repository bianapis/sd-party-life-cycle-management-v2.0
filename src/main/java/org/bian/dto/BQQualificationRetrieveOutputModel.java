package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQualificationRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord;
import org.bian.dto.BQQualificationRetrieveOutputModelQualificationInstanceAnalysis;
import org.bian.dto.BQQualificationRetrieveOutputModelQualificationInstanceRecord;
import org.bian.dto.BQQualificationRetrieveOutputModelQualificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQQualificationRetrieveOutputModel
 */
public class BQQualificationRetrieveOutputModel   {
  private BQQualificationRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord = null;

  private String customerPrecedentProfileUpdateLog = null;

  private BQQualificationRetrieveOutputModelQualificationInstanceRecord qualificationInstanceRecord = null;

  private String qualificationRetrieveActionTaskReference = null;

  private Object qualificationRetrieveActionTaskRecord = null;

  private String qualificationRetrieveActionResponse = null;

  private BQQualificationRetrieveOutputModelQualificationInstanceReport qualificationInstanceReport = null;

  private BQQualificationRetrieveOutputModelQualificationInstanceAnalysis qualificationInstanceAnalysis = null;


  /**
   * Get cRPartyRelationshipProcedureInstanceRecord
   * @return cRPartyRelationshipProcedureInstanceRecord
  **/

  public BQQualificationRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord getCRPartyRelationshipProcedureInstanceRecord() {
    return cRPartyRelationshipProcedureInstanceRecord;
  }
  @JsonProperty("cRPartyRelationshipProcedureInstanceRecord")
  public void setCRPartyRelationshipProcedureInstanceRecord(BQQualificationRetrieveOutputModelCRPartyRelationshipProcedureInstanceRecord cRPartyRelationshipProcedureInstanceRecord) {
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
   * Get qualificationInstanceRecord
   * @return qualificationInstanceRecord
  **/

  public BQQualificationRetrieveOutputModelQualificationInstanceRecord getQualificationInstanceRecord() {
    return qualificationInstanceRecord;
  }

  public void setQualificationInstanceRecord(BQQualificationRetrieveOutputModelQualificationInstanceRecord qualificationInstanceRecord) {
    this.qualificationInstanceRecord = qualificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Qualification instance retrieve service call 
   * @return qualificationRetrieveActionTaskReference
  **/

  public String getQualificationRetrieveActionTaskReference() {
    return qualificationRetrieveActionTaskReference;
  }

  public void setQualificationRetrieveActionTaskReference(String qualificationRetrieveActionTaskReference) {
    this.qualificationRetrieveActionTaskReference = qualificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return qualificationRetrieveActionTaskRecord
  **/

  public Object getQualificationRetrieveActionTaskRecord() {
    return qualificationRetrieveActionTaskRecord;
  }

  public void setQualificationRetrieveActionTaskRecord(Object qualificationRetrieveActionTaskRecord) {
    this.qualificationRetrieveActionTaskRecord = qualificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return qualificationRetrieveActionResponse
  **/

  public String getQualificationRetrieveActionResponse() {
    return qualificationRetrieveActionResponse;
  }

  public void setQualificationRetrieveActionResponse(String qualificationRetrieveActionResponse) {
    this.qualificationRetrieveActionResponse = qualificationRetrieveActionResponse;
  }


  /**
   * Get qualificationInstanceReport
   * @return qualificationInstanceReport
  **/

  public BQQualificationRetrieveOutputModelQualificationInstanceReport getQualificationInstanceReport() {
    return qualificationInstanceReport;
  }

  public void setQualificationInstanceReport(BQQualificationRetrieveOutputModelQualificationInstanceReport qualificationInstanceReport) {
    this.qualificationInstanceReport = qualificationInstanceReport;
  }


  /**
   * Get qualificationInstanceAnalysis
   * @return qualificationInstanceAnalysis
  **/

  public BQQualificationRetrieveOutputModelQualificationInstanceAnalysis getQualificationInstanceAnalysis() {
    return qualificationInstanceAnalysis;
  }

  public void setQualificationInstanceAnalysis(BQQualificationRetrieveOutputModelQualificationInstanceAnalysis qualificationInstanceAnalysis) {
    this.qualificationInstanceAnalysis = qualificationInstanceAnalysis;
  }


}

