package com.krakozhia.visa.visa_application.application.event;

import com.krakozhia.visa.visa_application.domain.model.VisaApplicationId;
import org.springframework.context.ApplicationEvent;

public class VisaRejectedEvent extends ApplicationEvent {
    private VisaApplicationId id;

    public VisaRejectedEvent(Object source, VisaApplicationId id) {
        super(source);
        this.id = id;
    }
}
