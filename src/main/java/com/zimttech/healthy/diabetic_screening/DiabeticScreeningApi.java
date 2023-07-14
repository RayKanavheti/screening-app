package com.zimttech.healthy.diabetic_screening;

import com.zimttech.healthy.common.ApiConstants;
import com.zimttech.healthy.common.ApiResponse;
import com.zimttech.healthy.exception.BusinessException;
import com.zimttech.healthy.model.DiabeticScreening;
import com.zimttech.healthy.model.Patient;
import com.zimttech.healthy.patient.PatientDto;
import com.zimttech.healthy.patient.PatientMapper;
import com.zimttech.healthy.patient.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diabetic_screening")
@Slf4j
public class DiabeticScreeningApi {
    @Autowired
    DiabeticScreeningService service;
    @Autowired
    DiabeticScreeningMapper diabeticScreeningMapper;
    @PostMapping
    public ApiResponse<DiabeticScreening> save(@RequestBody DiabeticScreeningDto diabeticScreeningDto){
        DiabeticScreening diabeticScreening = service.save(diabeticScreeningMapper.dtoToDiabeticScreening(diabeticScreeningDto));
        return new ApiResponse<>(HttpStatus.OK.value(), ApiConstants.SUCCESS_MESSAGE, diabeticScreening);
    }
}
