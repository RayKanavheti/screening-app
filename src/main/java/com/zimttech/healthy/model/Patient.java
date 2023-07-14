package com.zimttech.healthy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patients")
@Entity
@Data
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
}
