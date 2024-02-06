package com.krakozhia.visa.visa_application.application.event;

import com.krakozhia.visa.visa_application.domain.model.VisaApplication;
import org.springframework.context.ApplicationEvent;

public class SecurityCheckRequiredEvent extends ApplicationEvent {
    private VisaApplication visaApplication;


    public SecurityCheckRequiredEvent(Object source, VisaApplication visaApplication) {
        super(source);
        this.visaApplication = visaApplication;

    }

    public VisaApplication getVisaApplicationId() {
        return visaApplication;
    }

}