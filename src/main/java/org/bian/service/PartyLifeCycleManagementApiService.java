/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PartyLifeCycleManagementApiService {

	SDPartyLifeCycleManagementActivateOutputModel activate(SDPartyLifeCycleManagementActivateInputModel request);
	
	SDPartyLifeCycleManagementConfigureOutputModel configure(String sdReferenceId, SDPartyLifeCycleManagementConfigureInputModel request);
	
	CRPartyRelationshipProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureControlInputModel request);
	
	CRPartyRelationshipProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureExchangeInputModel request);
	
	BQDocumentationExecuteOutputModel executeDocumentation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentationExecuteInputModel request);
	
	CRPartyRelationshipProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureExecuteInputModel request);
	
	SDPartyLifeCycleManagementFeedbackOutputModel feedback(String sdReferenceId, SDPartyLifeCycleManagementFeedbackInputModel request);
	
	CRPartyRelationshipProcedureInitiateOutputModel initiate(String sdReferenceId, CRPartyRelationshipProcedureInitiateInputModel request);
	
	BQDocumentationRequestOutputModel requestDocumentation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentationRequestInputModel request);
	
	CRPartyRelationshipProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureRequestInputModel request);
	
	CRPartyRelationshipProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAuthenticationRetrieveOutputModel retrieveAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDocumentationRetrieveOutputModel retrieveDocumentation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPrecedentsRetrieveOutputModel retrievePrecedents(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQQualificationRetrieveOutputModel retrieveQualification(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDPartyLifeCycleManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRPartyRelationshipProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureUpdateInputModel request);
	
	BQDocumentationUpdateOutputModel updateDocumentation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentationUpdateInputModel request);
	
	BQPrecedentsUpdateOutputModel updatePrecedents(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPrecedentsUpdateInputModel request);
	
}
