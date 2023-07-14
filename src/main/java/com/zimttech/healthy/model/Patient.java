package com.zimttech.healthy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "patients")

public class Patient extends  BaseEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "national_id", nullable = false)
    private String nationalId;
    @Column(name = "age")
    private Long age;
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "diagnosis_date", nullable = false)
    private LocalDateTime diagnosisDate;

    @Column(name = "treatment_notes", nullable = false)
    private String treatmentNotes;

    @OneToMany(mappedBy = "patient")
    private List<DiabeticScreening> diabeticScreenings;


}
