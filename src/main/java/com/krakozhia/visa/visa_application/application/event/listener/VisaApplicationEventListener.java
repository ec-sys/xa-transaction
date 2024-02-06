package com.krakozhia.visa.visa_application.application.event.listener;

import com.krakozhia.visa.common.exception.DomainException;
import com.krakozhia.visa.security_check.application.event.SecurityCheckCompletedEvent;
import com.krakozhia.visa.visa_application.application.VisaApplicationService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class VisaApplicationEventListener {
    private final VisaApplicationService visaApplicationService;

    public VisaApplicationEventListener(VisaApplicationService visaApplicationService) {
        this.visaApplicationService = visaApplicationService;
    }

    @EventListener
    public void handle(SecurityCheckCompletedEvent checkResponseEvent) throws DomainException {
        visaApplicationService.processSecurityCheckResponse(checkResponseEvent);
    }

}
