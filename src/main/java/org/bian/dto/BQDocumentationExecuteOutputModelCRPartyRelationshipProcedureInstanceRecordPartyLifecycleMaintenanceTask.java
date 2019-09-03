package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask
 */
public class BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask   {
  private String partyLifecycleMaintenanceWorkProducts = null;

  private String partyLifecycleMaintenanceTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return partyLifecycleMaintenanceWorkProducts
  **/

  public String getPartyLifecycleMaintenanceWorkProducts() {
    return partyLifecycleMaintenanceWorkProducts;
  }

  public void setPartyLifecycleMaintenanceWorkProducts(String partyLifecycleMaintenanceWorkProducts) {
    this.partyLifecycleMaintenanceWorkProducts = partyLifecycleMaintenanceWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the task (will be used to update the Status and Status Record) 
   * @return partyLifecycleMaintenanceTaskResult
  **/

  public String getPartyLifecycleMaintenanceTaskResult() {
    return partyLifecycleMaintenanceTaskResult;
  }

  public void setPartyLifecycleMaintenanceTaskResult(String partyLifecycleMaintenanceTaskResult) {
    this.partyLifecycleMaintenanceTaskResult = partyLifecycleMaintenanceTaskResult;
  }


}

