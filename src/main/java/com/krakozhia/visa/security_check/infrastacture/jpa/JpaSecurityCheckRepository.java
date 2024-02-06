package com.krakozhia.visa.security_check.infrastacture.jpa;

import com.krakozhia.visa.security_check.infrastacture.jpa.entity.SecurityCheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSecurityCheckRepository extends JpaRepository<SecurityCheckEntity, Long> {
}

