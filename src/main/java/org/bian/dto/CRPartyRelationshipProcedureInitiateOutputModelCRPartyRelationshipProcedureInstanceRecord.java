package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord
 */
public class CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecord   {
  private String partyLifecycleMaintenanceSchedule = null;

  private CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask partyLifecycleMaintenanceTask = null;


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

  public CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask getPartyLifecycleMaintenanceTask() {
    return partyLifecycleMaintenanceTask;
  }

  public void setPartyLifecycleMaintenanceTask(CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask partyLifecycleMaintenanceTask) {
    this.partyLifecycleMaintenanceTask = partyLifecycleMaintenanceTask;
  }


}

