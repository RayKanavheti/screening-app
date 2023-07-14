package com.zimttech.healthy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "diabetic_screenings")

public class DiabeticScreening extends  BaseEntity{

    @CreatedDate
    @Column(name = "screening_date", nullable = false, updatable = false)
    private LocalDateTime screeningDate = LocalDateTime.now();
    @Column(name = "weight", nullable = false)
    private double weight; // Unit: kg
    @Column(name = "height", nullable = false)
    private double height; // Unit: cm
    @Column(nullable = false, name = "blood_pressure_systolic")
    private double bloodPressureSystolic; // Unit: mmHg

    @Column(nullable = false, name = "blood_pressure_diastolic")
    private double bloodPressureDiastolic; // Unit: mmHg

    @Column(nullable = false, name = "blood_glucose_level")
    private double bloodGlucoseLevel; // Unit: mg/dL
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Patient patient;
}
