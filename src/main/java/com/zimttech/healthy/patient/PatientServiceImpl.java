package com.zimttech.healthy.patient;

import com.zimttech.healthy.diabetic_screening.DiabeticScreeningRepository;
import com.zimttech.healthy.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepository patientRepository;


    @Override
    public Optional<Patient> get(Object id) {
        return Optional.empty();
    }

    @Override
    public List<Patient> getAll(int page, int size) {
        return null;
    }

    @Override
    public List<Patient> getAll() {
        return null;
    }

    @Override
    public Optional<Patient> save(Patient patient) {
        return Optional.of(patientRepository.save(patient));

    }

    @Override
    public Optional<Patient> update(Patient patient) {
        return Optional.empty();
    }

    @Override
    public void delete(Patient patient) {

    }

    @Override
    public List<Patient> getPatientsByNumberOfMonthsOnTreatment(int numberOfMonths) {
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime resultDate = currentDate.minusMonths(numberOfMonths);
        return patientRepository.findByDiagnosisDateGreaterThan(resultDate);

    }

    @Override
    public List<Patient> getPatientsWithDiabeticScreenings() {
        return patientRepository.findByDiabeticScreeningsIsNotEmpty();
    }
}
