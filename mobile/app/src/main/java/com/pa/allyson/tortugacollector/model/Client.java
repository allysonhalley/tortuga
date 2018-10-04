package com.pa.allyson.tortugacollector.model;

import java.io.Serializable;

public class Client implements Serializable {
    private int id;
    private String name;
    private String cpf;
    private Locale adress;
    private String email;
    private String phone;

    public Client(int id, String name, String cpf, Locale adress, String email, String phone) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Locale getAdress() {
        return adress;
    }

    public void setAdress(Locale adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o){
        return this.id == ((Client)o).id;
    }

    @Override
    public int hashCode(){
        return this.id;
    }
}