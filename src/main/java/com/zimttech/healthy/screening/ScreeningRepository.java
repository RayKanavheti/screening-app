package com.zimttech.healthy.screening;

import com.zimttech.healthy.model.Patient;
import com.zimttech.healthy.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {
}
