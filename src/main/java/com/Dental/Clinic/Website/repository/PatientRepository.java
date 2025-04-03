package com.Dental.Clinic.Website.repository;

import com.Dental.Clinic.Website.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
