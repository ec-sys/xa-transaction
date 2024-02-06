package com.krakozhia.visa.visa_application.application.event;

import com.krakozhia.visa.visa_application.domain.model.PassportInformation;
import com.krakozhia.visa.visa_application.domain.info.VisaApplicationStatus;
import com.krakozhia.visa.visa_application.domain.model.Address;
import com.krakozhia.visa.visa_application.domain.model.Applicant;
import org.springframework.context.ApplicationEvent;

public class NotifyApplicantEvent extends ApplicationEvent {

    private Address applicantAddress;
    private Applicant applicantPersonalInfo;
    private PassportInformation applicantPassportInfo;
    private VisaApplicationStatus status;

    public NotifyApplicantEvent(Object source, Address applicantAddress, Applicant applicantPersonalInfo, PassportInformation applicantPassportInfo, VisaApplicationStatus status) {
        super(source);
        this.applicantAddress = applicantAddress;
        this.applicantPersonalInfo = applicantPersonalInfo;
        this.applicantPassportInfo = applicantPassportInfo;
        this.status = status;
    }
}
