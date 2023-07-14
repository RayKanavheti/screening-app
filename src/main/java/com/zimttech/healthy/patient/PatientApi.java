package com.zimttech.healthy.patient;

import com.zimttech.healthy.common.ApiConstants;
import com.zimttech.healthy.common.ApiResponse;
import com.zimttech.healthy.exception.BusinessException;
import com.zimttech.healthy.model.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@Slf4j
public class PatientApi {
    @Autowired
    PatientService service;
    @Autowired
    PatientMapper patientMapper;
    @PostMapping
    public ApiResponse<Patient> save(@RequestBody PatientDto patient){
        Patient savedPatient = service.save(patientMapper.dtoToPatient(patient)).orElseThrow(()-> new BusinessException("Error Occurred. Creating Patient"));
        return new ApiResponse<>(HttpStatus.OK.value(), ApiConstants.SUCCESS_MESSAGE, savedPatient);
    }

    @GetMapping("/numberOfMonths/{numberOfMonths}")
    public ApiResponse<List<Patient>> getPatientsByNumberOfMonthsOnTreatment(@PathVariable("numberOfMonths")int numberOfMonths){
        log.info("List Patients by number of months on treatment {}", numberOfMonths);
        List<Patient> patientList = service.getPatientsByNumberOfMonthsOnTreatment(numberOfMonths);
        return new ApiResponse<>(HttpStatus.OK.value(), ApiConstants.SUCCESS_MESSAGE, patientList);
    }

    @GetMapping("/diabetic-screenings")
    public ApiResponse<List<Patient>> getPatientsDiabeticScreenings(){
        log.info("List Patients with diabetic screenings");
        List<Patient> patientList = service.getPatientsWithDiabeticScreenings();
        return new ApiResponse<>(HttpStatus.OK.value(), ApiConstants.SUCCESS_MESSAGE, patientList);
    }
}
