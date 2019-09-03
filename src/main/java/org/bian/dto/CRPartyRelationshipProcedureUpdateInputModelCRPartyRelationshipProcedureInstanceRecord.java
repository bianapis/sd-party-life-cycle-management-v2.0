package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask;

import javax.validation.Valid;
  
/**
 * CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord
 */
public class CRPartyRelationshipProcedureUpdateInputModelCRPartyRelationshipProcedureInstanceRecord   {
  private String customerReference = null;

  private String partyReference = null;

  private String partyRelationshipType = null;

  private String partyLifecycleMaintenanceSchedule = null;

  private CRPartyRelationshipProcedureInitiateOutputModelCRPartyRelationshipProcedureInstanceRecordPartyLifecycleMaintenanceTask partyLifecycleMaintenanceTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the legal entity (typically the customer) 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the nature of the bank association with the party (e.g. customer, supplier) 
   * @return partyRelationshipType
  **/

  public String getPartyRelationshipType() {
    return partyRelationshipType;
  }

  public void setPartyRelationshipType(String partyRelationshipType) {
    this.partyRelationshipType = partyRelationshipType;
  }


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

