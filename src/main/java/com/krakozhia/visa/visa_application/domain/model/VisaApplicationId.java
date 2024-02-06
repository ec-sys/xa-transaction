package com.krakozhia.visa.visa_application.domain.model;

import com.krakozhia.visa.common.ID;

public class VisaApplicationId implements ID {

    private Long id;

    public VisaApplicationId(Long id) {
        this.id = id;
    }

    @Override
    public Long value() {
        return id;
    }
}
