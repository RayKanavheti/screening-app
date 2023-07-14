package com.zimttech.healthy.diabetic_screening;

import com.zimttech.healthy.model.DiabeticScreening;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiabeticScreeningRepository extends JpaRepository<DiabeticScreening, Long> {

}
