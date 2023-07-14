package com.zimttech.healthy.patient;

import com.zimttech.healthy.common.AppService;
import com.zimttech.healthy.model.Patient;

import java.util.List;

public interface PatientService extends AppService<Patient> {

    List<Patient> getPatientsByNumberOfMonthsOnTreatment(int numberOfMonths);
    List<Patient> getPatientsWithDiabeticScreenings() ;
}
