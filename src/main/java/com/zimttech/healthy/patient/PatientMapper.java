package com.zimttech.healthy.patient;

import com.zimttech.healthy.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {
    public Patient dtoToPatient(PatientDto dto) {

        Patient patient = new Patient();
        patient.setFirstName(dto.getFirstName());
        patient.setLastName(dto.getLastName());
        patient.setGender(dto.getGender());
        patient.setAge(dto.getAge());
        patient.setNationalId(dto.getNationalId());
        patient.setDiagnosisDate(dto.getDiagnosisDate());
        patient.setTreatmentNotes(dto.getTreatmentNotes());
        return  patient;
    }
}
