package com.krakozhia.visa.visa_application.infrastacture.rest;

import com.krakozhia.visa.common.exception.DomainException;
import com.krakozhia.visa.visa_application.application.VisaApplicationService;
import com.krakozhia.visa.visa_application.infrastacture.rest.command.VisaApplicationRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visa")
public class VisaApplicationController {


    private final VisaApplicationService visaApplicationService;

    public VisaApplicationController(VisaApplicationService visaApplicationService) {
        this.visaApplicationService = visaApplicationService;
    }

    @PostMapping("/apply")
    @ResponseStatus(HttpStatus.CREATED)
    public void apply(@RequestBody VisaApplicationRequest visaApplicationRequest) throws DomainException {

        visaApplicationService.processVisaApplication(visaApplicationRequest);

    }


}
