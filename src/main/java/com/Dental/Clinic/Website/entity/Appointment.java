package com.Dental.Clinic.Website.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;  // Hastayla ilişki

    @Column(name = "doctor_name")
    private String doctorName;

    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;

    @Column(name = "status")
    private String status; // BEKLEMEDE, TAMAMLANDI, IPTAL_EDILDI vb.

    @Column(name = "department")
    private String department; // Perio, Orto vb.

    // Parametresiz constructor (gerekli)
    public Appointment() {
        super();
    }

    // Parametreli constructor
    public Appointment(Patient patient, String doctorName, LocalDateTime appointmentDate, String status, String department) {
        this.patient = patient;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.status = status;
        this.department = department;
    }

    // Getter ve Setter'lar

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
