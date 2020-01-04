package com.example.homework3.model;

public class Address {
    private String country;
    private String city;
    private String state;

    public Address(String country, String city, String state) {
        this.country = country;
        this.city = city;
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
