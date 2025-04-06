package com.Dental.Clinic.Website.controller;

import com.Dental.Clinic.Website.entity.Patient;
import com.Dental.Clinic.Website.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PatientController {

    private PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        super();
        this.patientRepository = patientRepository;
    }

    @PostMapping("/insert")
    public Patient createPatient(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }

    @GetMapping
    public List<Patient> getAllPatient(){
        return patientRepository.findAll();
    }
}
