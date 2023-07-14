package com.zimttech.healthy.diabetic_screening;

import com.zimttech.healthy.model.DiabeticScreening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DiabeticScreeningMapper {
    @Autowired
    DiabeticScreeningService service;
    public DiabeticScreening dtoToDiabeticScreening(DiabeticScreeningDto dto) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DiabeticScreening diabeticScreening = new DiabeticScreening();
        diabeticScreening.setHeight(dto.getHeight());
        diabeticScreening.setWeight(dto.getWeight());

        diabeticScreening.setBloodGlucoseLevel(dto.getBloodGlucoseLevel());
        diabeticScreening.setBloodPressureSystolic(dto.getBloodPressureSystolic());
        diabeticScreening.setBloodPressureDiastolic(dto.getBloodPressureDiastolic());
        diabeticScreening.setPatient(dto.getPatient());
        diabeticScreening.setScreeningDate(LocalDateTime.parse(dto.getScreeningDate(), formatter));
        diabeticScreening.setBmi(service.calculateBmiValue(dto.getWeight(), dto.getHeight()));
        diabeticScreening.setBmiStatus(service.calculateBmiStatus(dto.getWeight(), dto.getHeight()));
        return  diabeticScreening;

    }
}
