package br.com.ahsr.tortugalpha.model;

import java.util.Collection;

/**
 * Created by Allyson on 24/09/2016.
 */

public class People extends TemplateAtributes{

    private String fullName;
    private String nickname;
    private boolean gender;/*true=masculino false=feminino*/
    private Collection<Adress> adress;
    private Collection<PhoneNumber> phoneNumber;
    private Collection<Email> email;
    private PeopleType peopleType;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Collection<Adress> getAdress() {
        return adress;
    }

    public void setAdress(Collection<Adress> adress) {
        this.adress = adress;
    }

    public Collection<PhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Collection<PhoneNumber> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Collection<Email> getEmail() {
        return email;
    }

    public void setEmail(Collection<Email> email) {
        this.email = email;
    }

    public PeopleType getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(PeopleType peopleType) {
        this.peopleType = peopleType;
    }
}
