package com.zimttech.healthy.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zimttech.healthy.model.BmiStatus;
import com.zimttech.healthy.model.Patient;
import com.zimttech.healthy.patient.PatientDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientsOutOfBoundsNotification {

    @JsonProperty("processed")
    private List<PatientDto> patients;
    @JsonProperty("status")
    private BmiStatus status;

}
