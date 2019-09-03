package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceReportRecord
 */
public class CRPartyRelationshipProcedureRetrieveInputModelPartyRelationshipProcedureInstanceReportRecord   {
  private String partyRelationshipProcedureInstanceReportReference = null;

  private String partyRelationshipProcedureInstanceReportType = null;

  private String partyRelationshipProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return partyRelationshipProcedureInstanceReportReference
  **/

  public String getPartyRelationshipProcedureInstanceReportReference() {
    return partyRelationshipProcedureInstanceReportReference;
  }

  public void setPartyRelationshipProcedureInstanceReportReference(String partyRelationshipProcedureInstanceReportReference) {
    this.partyRelationshipProcedureInstanceReportReference = partyRelationshipProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return partyRelationshipProcedureInstanceReportParameters
  **/

  public String getPartyRelationshipProcedureInstanceReportParameters() {
    return partyRelationshipProcedureInstanceReportParameters;
  }

  public void setPartyRelationshipProcedureInstanceReportParameters(String partyRelationshipProcedureInstanceReportParameters) {
    this.partyRelationshipProcedureInstanceReportParameters = partyRelationshipProcedureInstanceReportParameters;
  }


}

