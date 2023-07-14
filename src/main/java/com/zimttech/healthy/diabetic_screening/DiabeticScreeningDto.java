package com.zimttech.healthy.diabetic_screening;

import com.zimttech.healthy.model.Patient;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
public class DiabeticScreeningDto {

    private String screeningDate;

    private double weight; // Unit: kg

    private double height; // Unit: cm

    private double bloodPressureSystolic; // Unit: mmHg


    private double bloodPressureDiastolic; // Unit: mmHg


    private double bloodGlucoseLevel; // Unit: mg/dL

    private Patient patient;

}
