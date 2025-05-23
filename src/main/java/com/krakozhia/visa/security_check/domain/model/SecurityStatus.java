package com.krakozhia.visa.security_check.domain.model;

public enum SecurityStatus {

    PENDING("Pending"),
    PASSED("Passed"),
    FAILED("Failed");

    private final String label;

    SecurityStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
