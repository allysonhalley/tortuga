package br.com.ahsr.tortuga30.model;

/**
 * Created by Allyson on 20/09/2016.
 */

public class PhoneNumber extends TemplateAtributes {

    private String phoneNumber;
    private String cityCode;
    private String countyConde;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountyConde() {
        return countyConde;
    }

    public void setCountyConde(String countyConde) {
        this.countyConde = countyConde;
    }
}
