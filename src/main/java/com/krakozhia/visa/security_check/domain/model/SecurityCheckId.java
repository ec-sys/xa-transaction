package com.krakozhia.visa.security_check.domain.model;

import com.krakozhia.visa.common.ID;

public class SecurityCheckId implements ID {

    private Long id;

    public SecurityCheckId(Long id) {
        this.id = id;
    }

    public Long value() {
        return id;
    }
}
