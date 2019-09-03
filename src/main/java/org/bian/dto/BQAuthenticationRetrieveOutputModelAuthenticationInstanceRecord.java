package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecordAuthenticationTaskRecord;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecord
 */
public class BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecord   {
  private String authenticationType = null;

  private String publicDirectoryReference = null;

  private String specialistAgencyServiceReference = null;

  private BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecordAuthenticationTaskRecord authenticationTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The method used to authenticate (e.g. public directory, document, 3rd party service providers) 
   * @return authenticationType
  **/

  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an external verification source (e.g. for registered address/location verification) 
   * @return publicDirectoryReference
  **/

  public String getPublicDirectoryReference() {
    return publicDirectoryReference;
  }

  public void setPublicDirectoryReference(String publicDirectoryReference) {
    this.publicDirectoryReference = publicDirectoryReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an external verification service (e.g. to perform background verification checks) 
   * @return specialistAgencyServiceReference
  **/

  public String getSpecialistAgencyServiceReference() {
    return specialistAgencyServiceReference;
  }

  public void setSpecialistAgencyServiceReference(String specialistAgencyServiceReference) {
    this.specialistAgencyServiceReference = specialistAgencyServiceReference;
  }


  /**
   * Get authenticationTaskRecord
   * @return authenticationTaskRecord
  **/

  public BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecordAuthenticationTaskRecord getAuthenticationTaskRecord() {
    return authenticationTaskRecord;
  }

  public void setAuthenticationTaskRecord(BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecordAuthenticationTaskRecord authenticationTaskRecord) {
    this.authenticationTaskRecord = authenticationTaskRecord;
  }


}

