package com.zimttech.healthy.patient;

import com.zimttech.healthy.common.ApiConstants;
import com.zimttech.healthy.common.ApiResponse;
import com.zimttech.healthy.exception.BusinessException;
import com.zimttech.healthy.model.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
