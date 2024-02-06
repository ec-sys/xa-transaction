package com.krakozhia.visa.visa_application.application;

import com.krakozhia.visa.common.exception.DomainException;
import com.krakozhia.visa.security_check.application.event.SecurityCheckCompletedEvent;
import com.krakozhia.visa.visa_application.domain.model.PassportInformation;
import com.krakozhia.visa.visa_application.domain.model.*;
import com.krakozhia.visa.visa_application.domain.repository.VisaApplicationRepository;
import com.krakozhia.visa.visa_application.infrastacture.VisaApplicationRepositoryImpl;
import com.krakozhia.visa.visa_application.infrastacture.rest.command.VisaApplicationRequest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class VisaApplicationService {

    private final VisaApplicationRepository repository;

    private final ApplicationEventPublisher applicationEventPublisher;


    public VisaApplicationService(VisaApplicationRepositoryImpl visaApplicationRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.repository = visaApplicationRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Transactional(transactionManager = "transactionManager")
    public void processVisaApplication(VisaApplicationRequest request) throws DomainException {
        PassportInformation passportInformation = new PassportInformation(request.getPassportNumber(), request.getPassportExpirationDate(), request.getPassportIssuingCountryCode());
        VisaFeeReceipt visaPayment = repository.getVisaFeeReceipt(request.getPaymentId())
                .orElseThrow(() -> new DomainException("Visa Fee Receipt couldn't found. "));
        Applicant applicant = repository.getApplicant(request.getApplicantId())
                .orElseThrow(() -> new DomainException("Applicant couldn't found. "));
        Address address = repository.getAddress(request.getApplicantId())
                .orElseThrow(() -> new DomainException("Address couldn't found. "));

        if (!repository.isCountryEligibleForVisa(passportInformation.country().getCountryCode())) {
            throw new DomainException("Applicant's country is not eligible for the selected purpose of visit.");
        }

       /*
        some other checks
       * */

        VisaApplication visaApplication = new VisaApplication(new VisaApplicationId(repository.generateId()),
                applicant, passportInformation, LocalDate.now(), request.getVisaType(), request.getIntendedArriveDate(), address, visaPayment);

        visaApplication.validateForSubmission();
        repository.save(visaApplication);

        visaApplication.getDomainEvents().stream().forEach(applicationEventPublisher::publishEvent);
        visaApplication.clearDomainEvents();
    }

    public void processSecurityCheckResponse(SecurityCheckCompletedEvent checkResponseEvent) throws DomainException {
        VisaApplication visaApplication = retreiveVisaApplication(checkResponseEvent.getVisaApplicationId());
        visaApplication.applySecurityCheck(checkResponseEvent.getSecurityStatus());
    }

    public VisaApplication retreiveVisaApplication(VisaApplicationId visaApplicationId) throws DomainException {
        return repository.retrieveVisaApplicationById(visaApplicationId);
    }


}
