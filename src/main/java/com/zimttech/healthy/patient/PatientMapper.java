package com.zimttech.healthy.patient;

import com.zimttech.healthy.model.Patient;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class PatientMapper {
    public Patient dtoToPatient(PatientDto dto) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        Patient patient = new Patient();
        patient.setFirstName(dto.getFirstName());
        patient.setLastName(dto.getLastName());
        patient.setGender(dto.getGender());
        patient.setAge(dto.getAge());
        patient.setNationalId(dto.getNationalId());
        patient.setDiagnosisDate(LocalDateTime.parse(dto.getDiagnosisDate(), formatter));
        patient.setTreatmentNotes(dto.getTreatmentNotes());
        return  patient;
    }
}
