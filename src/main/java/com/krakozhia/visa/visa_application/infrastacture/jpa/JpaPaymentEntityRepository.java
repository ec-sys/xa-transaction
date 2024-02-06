package com.krakozhia.visa.visa_application.infrastacture.jpa;

import com.krakozhia.visa.visa_application.infrastacture.jpa.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPaymentEntityRepository extends JpaRepository<PaymentEntity, Long> {
}

