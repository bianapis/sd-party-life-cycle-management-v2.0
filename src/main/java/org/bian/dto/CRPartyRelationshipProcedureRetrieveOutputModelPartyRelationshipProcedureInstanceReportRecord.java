package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceReportRecord
 */
public class CRPartyRelationshipProcedureRetrieveOutputModelPartyRelationshipProcedureInstanceReportRecord   {
  private String partyRelationshipProcedureInstanceReportData = null;

  private String partyRelationshipProcedureInstanceReportType = null;

  private Object partyRelationshipProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return partyRelationshipProcedureInstanceReportData
  **/

  public String getPartyRelationshipProcedureInstanceReportData() {
    return partyRelationshipProcedureInstanceReportData;
  }

  public void setPartyRelationshipProcedureInstanceReportData(String partyRelationshipProcedureInstanceReportData) {
    this.partyRelationshipProcedureInstanceReportData = partyRelationshipProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return partyRelationshipProcedureInstanceReportType
  **/

  public String getPartyRelationshipProcedureInstanceReportType() {
    return partyRelationshipProcedureInstanceReportType;
  }

  public void setPartyRelationshipProcedureInstanceReportType(String partyRelationshipProcedureInstanceReportType) {
    this.partyRelationshipProcedureInstanceReportType = partyRelationshipProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return partyRelationshipProcedureInstanceReport
  **/

  public Object getPartyRelationshipProcedureInstanceReport() {
    return partyRelationshipProcedureInstanceReport;
  }

  public void setPartyRelationshipProcedureInstanceReport(Object partyRelationshipProcedureInstanceReport) {
    this.partyRelationshipProcedureInstanceReport = partyRelationshipProcedureInstanceReport;
  }


}

