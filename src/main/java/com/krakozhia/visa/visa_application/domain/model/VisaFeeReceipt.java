package com.krakozhia.visa.visa_application.domain.model;

import java.math.BigDecimal;


public class VisaFeeReceipt {
    public Boolean valid;
    private VisaFeeReceiptId visaFeeReceiptId;
    private BigDecimal chargedAmount;

    public VisaFeeReceipt(VisaFeeReceiptId visaFeeReceiptId, BigDecimal chargedAmount, Boolean valid) {
        this.visaFeeReceiptId = visaFeeReceiptId;
        this.chargedAmount = chargedAmount;
        this.valid = valid;
    }

    public VisaFeeReceiptId id() {
        return visaFeeReceiptId;
    }

    public BigDecimal chargedAmount() {
        return chargedAmount;
    }

    public Boolean valid() {
        return valid;
    }
}
