package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureInitiateInputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask
 */
public class CRPartyRelationshipProcedureInitiateInputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask   {
  private String partyLifecycleMaintenanceTaskType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of task performed (e.g. on-boarding check, periodic refresh) 
   * @return partyLifecycleMaintenanceTaskType
  **/

  public String getPartyLifecycleMaintenanceTaskType() {
    return partyLifecycleMaintenanceTaskType;
  }

  public void setPartyLifecycleMaintenanceTaskType(String partyLifecycleMaintenanceTaskType) {
    this.partyLifecycleMaintenanceTaskType = partyLifecycleMaintenanceTaskType;
  }


}

