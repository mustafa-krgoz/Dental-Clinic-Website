package com.Dental.Clinic.Website.dto;

public class AppointmentRequestDTO {

    // Hasta bilgileri
    private String firstName;      // ✅ artık ayrı ayrı
    private String lastName;       // ✅ artık ayrı ayrı
    private String phoneNumber;
    private String email;
    private String note;

    // Randevu bilgileri
    private String doctorName;
    private String department;
    private String appointmentDate; // ISO 8601: "2025-06-12T14:30"

    public AppointmentRequestDTO() {}

    // ✅ Getter ve Setter'lar
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
