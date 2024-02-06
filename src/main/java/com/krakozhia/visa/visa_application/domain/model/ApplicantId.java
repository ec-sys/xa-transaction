package com.krakozhia.visa.visa_application.domain.model;

import com.krakozhia.visa.common.ID;

public class ApplicantId implements ID {

    private Long id;

    public ApplicantId(Long id) {
        this.id = id;
    }

    @Override
    public Long value() {
        return id;
    }
}
