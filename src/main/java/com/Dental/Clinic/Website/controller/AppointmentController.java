package com.Dental.Clinic.Website.controller;

import com.Dental.Clinic.Website.dto.AppointmentRequestDTO;
import com.Dental.Clinic.Website.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/appointments")
    public ResponseEntity<String> createAppointment(@RequestBody AppointmentRequestDTO dto) {
        appointmentService.createAppointment(dto);
        return ResponseEntity.ok("Randevu başarıyla oluşturuldu.");
    }
}
