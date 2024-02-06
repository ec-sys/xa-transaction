package com.krakozhia.visa.visa_application.infrastacture.rest.command;

import com.krakozhia.visa.visa_application.domain.info.VisaType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class VisaApplicationRequest {

    private Long applicantId;
    private String passportNumber;
    private LocalDate passportExpirationDate;
    private String passportIssuingCountryCode;
    private VisaType visaType;
    private LocalDate intendedArriveDate;
    private Long paymentId;


}
