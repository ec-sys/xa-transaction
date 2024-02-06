package com.krakozhia.visa.visa_application.infrastacture.jpa;

import com.krakozhia.visa.visa_application.infrastacture.jpa.entity.ApplicantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaApplicantEntityRepository extends JpaRepository<ApplicantEntity, Long> {
}

