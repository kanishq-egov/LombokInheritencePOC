package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EgovModel {
    protected String id;
    protected String tenantId;
//    protected AdditionalFields additionalFields;
    protected Boolean isDeleted = Boolean.FALSE; //-> status obj
    protected Integer rowVersion;
    protected String applicationId;
    protected Boolean hasErrors = Boolean.FALSE;
//    protected AuditDetails auditDetails;
}
