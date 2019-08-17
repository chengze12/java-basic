package com.chengze.Algrithom.support;

import java.util.Date;
import java.util.List;

public class Partner {
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private List<Integer> availableDates;
    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String LastName) {
        this.lastName = LastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    public void setAvailableDates(List<Integer> availableDates) {
        this.availableDates = availableDates;
    }
    public List<Integer> getAvailableDates() {
        return availableDates;
    }
}
