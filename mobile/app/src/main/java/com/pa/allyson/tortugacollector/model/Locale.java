package com.pa.allyson.tortugacollector.model;

public class Locale {
    private String street;
    private String number;
    private String cep;
    private String city;
    private String latitude;
    private String longitude;

    public Locale(String street, String number, String cep, String city, String latitude, String longitude) {
        this.street = street;
        this.number = number;
        this.cep = cep;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
