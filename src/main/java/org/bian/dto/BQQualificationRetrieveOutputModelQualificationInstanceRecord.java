package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQualificationRetrieveOutputModelQualificationInstanceRecordQualificationTaskRecord;

import javax.validation.Valid;
  
/**
 * BQQualificationRetrieveOutputModelQualificationInstanceRecord
 */
public class BQQualificationRetrieveOutputModelQualificationInstanceRecord   {
  private String qualificationType = null;

  private String publicDirectoryReference = null;

  private String specialistAgencyServiceReference = null;

  private BQQualificationRetrieveOutputModelQualificationInstanceRecordQualificationTaskRecord qualificationTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of qualification check (e.g. PEP/watch list checks, credit worthiness, legal jeopardy) 
   * @return qualificationType
  **/

  public String getQualificationType() {
    return qualificationType;
  }

  public void setQualificationType(String qualificationType) {
    this.qualificationType = qualificationType;
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
   * Get qualificationTaskRecord
   * @return qualificationTaskRecord
  **/

  public BQQualificationRetrieveOutputModelQualificationInstanceRecordQualificationTaskRecord getQualificationTaskRecord() {
    return qualificationTaskRecord;
  }

  public void setQualificationTaskRecord(BQQualificationRetrieveOutputModelQualificationInstanceRecordQualificationTaskRecord qualificationTaskRecord) {
    this.qualificationTaskRecord = qualificationTaskRecord;
  }


}

