package com.zimttech.healthy.notification;

import com.zimttech.healthy.model.BmiStatus;
import com.zimttech.healthy.model.Patient;
import com.zimttech.healthy.patient.PatientDto;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OutOfBoundsNotifierServiceImpl implements OutOfBoundsNotifierService {
    private final SimpMessagingTemplate messagingTemplate;
    @Override
    public void notify(List<PatientDto> patients, BmiStatus status) {
        messagingTemplate.convertAndSend("/topic/patients-out-of-bounds-observations/" , PatientsOutOfBoundsNotification.builder()
                        .patients(patients)
                        .status(status)
                .build()
        );
    }
}
