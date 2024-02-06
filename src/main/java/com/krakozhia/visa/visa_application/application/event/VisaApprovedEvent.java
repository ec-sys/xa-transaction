package com.krakozhia.visa.visa_application.application.event;

import com.krakozhia.visa.visa_application.domain.model.VisaApplicationId;
import org.springframework.context.ApplicationEvent;

public class VisaApprovedEvent extends ApplicationEvent {
    private VisaApplicationId id;

    public VisaApprovedEvent(Object source, VisaApplicationId id) {
        super(source);
        this.id = id;
    }
}
