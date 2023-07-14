package com.zimttech.healthy.patient;

import com.zimttech.healthy.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
