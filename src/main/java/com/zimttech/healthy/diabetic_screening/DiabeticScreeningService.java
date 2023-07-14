package com.zimttech.healthy.diabetic_screening;

import com.zimttech.healthy.common.AppService;
import com.zimttech.healthy.model.BmiStatus;
import com.zimttech.healthy.model.DiabeticScreening;

import java.time.LocalDateTime;
import java.util.List;


public interface DiabeticScreeningService {

    DiabeticScreening save(DiabeticScreening diabeticScreening);

    BmiStatus calculateBmiStatus(double weight, double height);
    double calculateBmiValue(double weight, double height);

    List<DiabeticScreening> findByBmiStatusAndScreeningDate(BmiStatus bmiStatus, LocalDateTime localDateTime);
}
