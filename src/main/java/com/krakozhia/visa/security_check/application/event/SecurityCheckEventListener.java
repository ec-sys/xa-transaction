package com.krakozhia.visa.security_check.application.event;

import com.krakozhia.visa.security_check.application.SecurityCheckService;
import com.krakozhia.visa.visa_application.application.event.SecurityCheckRequiredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SecurityCheckEventListener {
    private final SecurityCheckService securityCheckService;

    public SecurityCheckEventListener(SecurityCheckService securityCheckService) {
        this.securityCheckService = securityCheckService;
    }

    @EventListener
    public void handle(SecurityCheckRequiredEvent securityCheckRequiredEvent) {

        securityCheckService.processSecurityCheckRequest(securityCheckRequiredEvent);

    }

}
