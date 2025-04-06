package com.Dental.Clinic.Website.controller;

import com.Dental.Clinic.Website.entity.Appointment;
import com.Dental.Clinic.Website.entity.Patient;
import com.Dental.Clinic.Website.repository.AppointmentRepository;
import com.Dental.Clinic.Website.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;

    @Autowired
    public AppointmentController(AppointmentRepository appointmentRepository, PatientRepository patientRepository) {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
    }

    @PostMapping("/insert")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        Long patientId = appointment.getPatient().getId(); // Sadece ID geliyor
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Hasta bulunamadı: ID = " + patientId));

        appointment.setPatient(patient); // Veritabanından gelen tam hasta bilgisi set ediliyor

        return appointmentRepository.save(appointment);
    }

    @GetMapping
    public List<Appointment> getAllAppointment(){
        return appointmentRepository.findAll();
    }
}
