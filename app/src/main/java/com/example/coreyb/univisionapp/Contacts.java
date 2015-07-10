package com.example.coreyb.univisionapp;

/**
 * Created by coreyb on 7/10/15.
 */
public class Contacts {
    private String name;
    private String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
