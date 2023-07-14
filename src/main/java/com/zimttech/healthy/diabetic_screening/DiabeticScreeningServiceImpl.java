package com.zimttech.healthy.diabetic_screening;

import com.zimttech.healthy.model.BmiStatus;
import com.zimttech.healthy.model.DiabeticScreening;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiabeticScreeningServiceImpl implements DiabeticScreeningService {
    @Autowired
    DiabeticScreeningRepository diabeticScreeningRepository;
    @Override
    public DiabeticScreening save(DiabeticScreening diabeticScreening) {
        return diabeticScreeningRepository.save(diabeticScreening);
    }

    @Override
    public BmiStatus calculateBmiStatus(double weight, double height) {
        double heightInMeters = height / 100.0; // Convert height from cm to meters
      double  bmi = weight / (heightInMeters * heightInMeters);

      if(bmi <= 18.4 ) {
            return  BmiStatus.UNDERWEIGHT;
      } else if (bmi > 18.4 && bmi < 24.9) {
          return BmiStatus.NORMAL;
      } else  if(bmi > 24.9 && bmi < 39.9) {
            return  BmiStatus.OVERWEIGHT;
      } else {
          return  BmiStatus.OBESE;
      }
    }

    @Override
    public double calculateBmiValue(double weight, double height) {
        double heightInMeters = height / 100.0; // Convert height from cm to meters
        return weight / (heightInMeters * heightInMeters);
    }
}
