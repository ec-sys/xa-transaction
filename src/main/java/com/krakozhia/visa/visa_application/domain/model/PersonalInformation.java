package com.krakozhia.visa.visa_application.domain.model;

import com.krakozhia.visa.visa_application.domain.info.Gender;

import java.time.LocalDate;

public class PersonalInformation {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;


    public PersonalInformation(String name, LocalDate dateOfBirth, Gender gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
}
