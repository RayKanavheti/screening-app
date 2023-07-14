package com.zimttech.healthy.patient;

import com.zimttech.healthy.model.Gender;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PatientDto {
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String nationalId;
    @NotBlank
    private Long age;
    @NotBlank
    private Gender gender;
    @NotBlank
    private String diagnosisDate;
    @NotBlank
    private String treatmentNotes;
}
