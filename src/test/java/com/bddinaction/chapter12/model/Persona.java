package com.bddinaction.chapter12.model;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class Persona {

    private static final Persona jane = new Persona("Jane","Smith","jane@acme.com");
    private static final Persona joe = new Persona("Joe","Blogs","joe@acme.com");

    private static Map<String, Persona> PERSONA_STORE = ImmutableMap.of("Jane", jane,
                                                                        "Joe", joe);

    private String firstName;
    private String lastName;
    private String email;
    private Status status;

    private Persona(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static Persona withName(String name) {
        return jane;
    }

    public void save() {
        //To change body of created methods use File | Settings | File Templates.
    }

    public String getAddress() {
        return "";
    }
}
