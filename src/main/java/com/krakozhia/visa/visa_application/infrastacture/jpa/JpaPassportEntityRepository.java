package com.krakozhia.visa.visa_application.infrastacture.jpa;

import com.krakozhia.visa.visa_application.infrastacture.jpa.entity.PassportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPassportEntityRepository extends JpaRepository<PassportEntity, Long> {
}

