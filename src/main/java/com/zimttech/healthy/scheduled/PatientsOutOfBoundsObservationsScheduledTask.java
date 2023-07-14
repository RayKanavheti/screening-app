package com.zimttech.healthy.scheduled;

import com.zimttech.healthy.diabetic_screening.DiabeticScreeningService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PatientsOutOfBoundsObservationsScheduledTask {
    @Autowired
    DiabeticScreeningService diabeticScreeningService;


    @Scheduled(cron = "0 0 0 * * *")// Every 24 hour
    @SchedulerLock(name = "checkPatientsWithOverWeightBmi", lockAtMostFor = "PT1M")

    public void checkPatientsWithOverWeightBmi() {


    }

    @Scheduled(cron = "0 0 0 * * *")// Every 24 hour
    @SchedulerLock(name = "checkPatientsWithObeseBmi", lockAtMostFor = "PT1M")

    public void checkPatientsWithObeseBmi() {


    }

    @Scheduled(cron = "0 0 0 * * *")// Every 24 hour
    @SchedulerLock(name = "checkPatientsWithUnderWeightBmi", lockAtMostFor = "PT1M")

    public void checkPatientsWithUnderWeightBmi() {


    }


}
