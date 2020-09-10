package com.shapestone.labs.hotel.domain;

public final class Guest {
    private final String guestId;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final String postalCode;

    public Guest(String firstName, String lastName, String address, String city, String state, String postalCode) {
        this.guestId = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String guestId() {
        return guestId;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String address() {
        return address;
    }

    public String city() {
        return city;
    }

    public String state() {
        return state;
    }

    public String postalCode() {
        return postalCode;
    }
}
