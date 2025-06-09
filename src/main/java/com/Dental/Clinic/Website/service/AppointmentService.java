package com.Dental.Clinic.Website.service;

import com.Dental.Clinic.Website.dto.AppointmentRequestDTO;
import com.Dental.Clinic.Website.entity.Appointment;
import com.Dental.Clinic.Website.entity.Patient;
import com.Dental.Clinic.Website.repository.AppointmentRepository;
import com.Dental.Clinic.Website.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AppointmentService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    public void createAppointment(AppointmentRequestDTO dto) {
        // 1. Patient oluştur
        Patient patient = new Patient(
                dto.getFirstName(),
                dto.getLastName(),
                dto.getPhoneNumber(),
                dto.getEmail(),
                dto.getNote()
        );

        // Kaydet ve ID al
        Patient savedPatient = patientRepository.save(patient);

        // 2. Appointment oluştur
        LocalDateTime appointmentDateTime = LocalDateTime.parse(dto.getAppointmentDate()); // ISO 8601 format: "2025-06-12T14:00"

        Appointment appointment = new Appointment(
                savedPatient,
                dto.getDoctorName(),
                appointmentDateTime,
                "BEKLEMEDE", // varsayılan durum
                dto.getDepartment()
        );

        appointmentRepository.save(appointment);
    }
}
