package com.shapestone.labs.hotel.domain.model;

public final class Room {
    private final String roomId;
    private final int roomNumber;
    private final int beds;
    private final double price;

    public Room(int roomNumber, int beds, double price) {
        this.roomId = null;
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.price = price;
    }

    public String roomId() {
        return roomId;
    }

    public int roomNumber() {
        return roomNumber;
    }

    public int beds() {
        return beds;
    }

    public double price() {
        return price;
    }
}
