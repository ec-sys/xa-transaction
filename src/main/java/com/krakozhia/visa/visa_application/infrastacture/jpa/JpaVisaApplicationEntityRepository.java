package com.krakozhia.visa.visa_application.infrastacture.jpa;

import com.krakozhia.visa.visa_application.infrastacture.jpa.entity.VisaApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaVisaApplicationEntityRepository extends JpaRepository<VisaApplicationEntity, String> {

    Optional<VisaApplicationEntity> findById(Long refNumber);

}

