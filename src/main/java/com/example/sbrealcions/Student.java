package com.example.sbrealcions;

import java.time.LocalDate;

public class Student {
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private boolean wantsNewsletter;

    public Student(String lastName, String firstName, LocalDate birthDate, boolean wantsNewsletter ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.wantsNewsletter = wantsNewsletter;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isWantsNewsletter() {
        return wantsNewsletter;
    }

    public void setWantsNewsletter(boolean wantsNewsletter) {
        this.wantsNewsletter = wantsNewsletter;
    }
}
