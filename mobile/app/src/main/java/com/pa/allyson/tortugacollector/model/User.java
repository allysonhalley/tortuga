package com.pa.allyson.tortugacollector.model;

public class User {
    private Client client;
    private String email;
    private String password;

    public User(String email, String password) {
        this.client = client;
        this.email = client.getEmail();
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
