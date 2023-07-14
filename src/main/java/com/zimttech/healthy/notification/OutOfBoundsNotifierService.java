package com.zimttech.healthy.notification;

import com.zimttech.healthy.model.BmiStatus;
import com.zimttech.healthy.model.Patient;
import com.zimttech.healthy.patient.PatientDto;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface OutOfBoundsNotifierService {

    @Async
    void notify(List<PatientDto> patients, BmiStatus status);
}
