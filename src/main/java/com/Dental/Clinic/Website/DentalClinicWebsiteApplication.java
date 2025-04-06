package com.Dental.Clinic.Website;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.Dental.Clinic.Website")
@SpringBootApplication
public class DentalClinicWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DentalClinicWebsiteApplication.class, args);
	}

}
