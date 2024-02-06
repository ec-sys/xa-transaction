package com.krakozhia.visa.security_check.application.event;

import com.krakozhia.visa.security_check.domain.model.SecurityStatus;
import com.krakozhia.visa.visa_application.domain.model.VisaApplicationId;
import org.springframework.context.ApplicationEvent;

public class SecurityCheckCompletedEvent extends ApplicationEvent {

    private VisaApplicationId visaApplicationId;
    private SecurityStatus securityStatus;

    public SecurityCheckCompletedEvent(Object source, VisaApplicationId visaApplicationId) {
        super(source);
    }

    public VisaApplicationId getVisaApplicationId() {
        return visaApplicationId;
    }

    public SecurityStatus getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(SecurityStatus securityStatus) {
        this.securityStatus = securityStatus;
    }
}
