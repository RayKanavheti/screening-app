package com.zimttech.healthy.patient;

import com.zimttech.healthy.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
  List<Patient> findByDiagnosisDateGreaterThan (LocalDateTime diagnosisDate);

  List<Patient> findByDiabeticScreeningsIsNotEmpty();

}
