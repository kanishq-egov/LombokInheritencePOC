package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class EgovModel {
    protected String id;
    protected String tenantId;
    protected Boolean isDeleted = Boolean.FALSE;
    protected Integer rowVersion;
    protected String applicationId;
    protected Boolean hasErrors = Boolean.FALSE;
}
