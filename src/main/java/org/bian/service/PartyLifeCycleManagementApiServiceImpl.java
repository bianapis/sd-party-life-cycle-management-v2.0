/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PartyLifeCycleManagementApiServiceImpl implements PartyLifeCycleManagementApiService {

	public SDPartyLifeCycleManagementActivateOutputModel activate(SDPartyLifeCycleManagementActivateInputModel request){
		return JsonReader.read("activate-SDPartyLifeCycleManagementActivateOutputModel.json",new TypeReference<SDPartyLifeCycleManagementActivateOutputModel>(){});
	}
	
	public SDPartyLifeCycleManagementConfigureOutputModel configure(String sdReferenceId, SDPartyLifeCycleManagementConfigureInputModel request){
		return JsonReader.read("configure-SDPartyLifeCycleManagementConfigureOutputModel.json",new TypeReference<SDPartyLifeCycleManagementConfigureOutputModel>(){});
	}
	
	public CRPartyRelationshipProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureControlInputModel request){
		return JsonReader.read("control-CRPartyRelationshipProcedureControlOutputModel.json",new TypeReference<CRPartyRelationshipProcedureControlOutputModel>(){});
	}
	
	public CRPartyRelationshipProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRPartyRelationshipProcedureExchangeOutputModel.json",new TypeReference<CRPartyRelationshipProcedureExchangeOutputModel>(){});
	}
	
	public BQDocumentationExecuteOutputModel executeDocumentation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentationExecuteInputModel request){
		return JsonReader.read("execute-BQDocumentationExecuteOutputModel.json",new TypeReference<BQDocumentationExecuteOutputModel>(){});
	}
	
	public CRPartyRelationshipProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRPartyRelationshipProcedureExecuteOutputModel.json",new TypeReference<CRPartyRelationshipProcedureExecuteOutputModel>(){});
	}
	
	public SDPartyLifeCycleManagementFeedbackOutputModel feedback(String sdReferenceId, SDPartyLifeCycleManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDPartyLifeCycleManagementFeedbackOutputModel.json",new TypeReference<SDPartyLifeCycleManagementFeedbackOutputModel>(){});
	}
	
	public CRPartyRelationshipProcedureInitiateOutputModel initiate(String sdReferenceId, CRPartyRelationshipProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRPartyRelationshipProcedureInitiateOutputModel.json",new TypeReference<CRPartyRelationshipProcedureInitiateOutputModel>(){});
	}
	
	public BQDocumentationRequestOutputModel requestDocumentation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentationRequestInputModel request){
		return JsonReader.read("request-BQDocumentationRequestOutputModel.json",new TypeReference<BQDocumentationRequestOutputModel>(){});
	}
	
	public CRPartyRelationshipProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureRequestInputModel request){
		return JsonReader.read("request-CRPartyRelationshipProcedureRequestOutputModel.json",new TypeReference<CRPartyRelationshipProcedureRequestOutputModel>(){});
	}
	
	public CRPartyRelationshipProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRPartyRelationshipProcedureRetrieveOutputModel.json",new TypeReference<CRPartyRelationshipProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAuthenticationRetrieveOutputModel retrieveAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAuthenticationRetrieveOutputModel.json",new TypeReference<BQAuthenticationRetrieveOutputModel>(){});
	}
	
	public BQDocumentationRetrieveOutputModel retrieveDocumentation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDocumentationRetrieveOutputModel.json",new TypeReference<BQDocumentationRetrieveOutputModel>(){});
	}
	
	public BQPrecedentsRetrieveOutputModel retrievePrecedents(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPrecedentsRetrieveOutputModel.json",new TypeReference<BQPrecedentsRetrieveOutputModel>(){});
	}
	
	public BQQualificationRetrieveOutputModel retrieveQualification(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQQualificationRetrieveOutputModel.json",new TypeReference<BQQualificationRetrieveOutputModel>(){});
	}
	
	public SDPartyLifeCycleManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPartyLifeCycleManagementRetrieveOutputModel.json",new TypeReference<SDPartyLifeCycleManagementRetrieveOutputModel>(){});
	}
	
	public CRPartyRelationshipProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPartyRelationshipProcedureUpdateInputModel request){
		return JsonReader.read("update-CRPartyRelationshipProcedureUpdateOutputModel.json",new TypeReference<CRPartyRelationshipProcedureUpdateOutputModel>(){});
	}
	
	public BQDocumentationUpdateOutputModel updateDocumentation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentationUpdateInputModel request){
		return JsonReader.read("update-BQDocumentationUpdateOutputModel.json",new TypeReference<BQDocumentationUpdateOutputModel>(){});
	}
	
	public BQPrecedentsUpdateOutputModel updatePrecedents(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPrecedentsUpdateInputModel request){
		return JsonReader.read("update-BQPrecedentsUpdateOutputModel.json",new TypeReference<BQPrecedentsUpdateOutputModel>(){});
	}
	
}
