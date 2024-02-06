package com.krakozhia.visa.visa_application.infrastacture.jpa;

import com.krakozhia.visa.visa_application.infrastacture.jpa.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaAddressEntityRepository extends JpaRepository<AddressEntity, Long> {
}

