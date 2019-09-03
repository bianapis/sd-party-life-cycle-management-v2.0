package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask;

import javax.validation.Valid;
  
/**
 * BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecord
 */
public class BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecord   {
  private String partyLifecycleMaintenanceSchedule = null;

  private BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask partyLifecycleMaintenanceTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines scheduled update/review tasks covering all tracked properties 
   * @return partyLifecycleMaintenanceSchedule
  **/

  public String getPartyLifecycleMaintenanceSchedule() {
    return partyLifecycleMaintenanceSchedule;
  }

  public void setPartyLifecycleMaintenanceSchedule(String partyLifecycleMaintenanceSchedule) {
    this.partyLifecycleMaintenanceSchedule = partyLifecycleMaintenanceSchedule;
  }


  /**
   * Get partyLifecycleMaintenanceTask
   * @return partyLifecycleMaintenanceTask
  **/

  public BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask getPartyLifecycleMaintenanceTask() {
    return partyLifecycleMaintenanceTask;
  }

  public void setPartyLifecycleMaintenanceTask(BQDocumentationExecuteOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask partyLifecycleMaintenanceTask) {
    this.partyLifecycleMaintenanceTask = partyLifecycleMaintenanceTask;
  }


}

