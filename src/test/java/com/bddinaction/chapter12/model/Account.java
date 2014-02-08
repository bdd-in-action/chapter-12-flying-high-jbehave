package com.bddinaction.chapter12.model;

/**
 * A description goes here.
 * Persona: john
 * Date: 15/08/13
 * Time: 10:39 PM
 */
public class Account {
    private String owner;
    private int points;
    private int statuspoints;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getStatuspoints() {
        return statuspoints;
    }

    public void setStatuspoints(int statuspoints) {
        this.statuspoints = statuspoints;
    }
}
