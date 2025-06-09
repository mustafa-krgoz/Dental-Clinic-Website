package com.Dental.Clinic.Website.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Tüm endpoint'ler için geçerli
                .allowedOrigins("http://localhost:3000") // React frontend'in adresi
                .allowedMethods("GET", "POST", "PUT", "DELETE") // İzin verilen methodlar
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
