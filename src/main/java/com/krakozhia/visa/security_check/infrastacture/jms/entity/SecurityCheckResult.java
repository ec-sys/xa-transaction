package com.krakozhia.visa.security_check.infrastacture.jms.entity;

import com.krakozhia.visa.security_check.domain.model.SecurityStatus;
import lombok.Data;

@Data
public class SecurityCheckResult {

    private Long securityCheckId;
    private SecurityStatus securityStatus;
}
