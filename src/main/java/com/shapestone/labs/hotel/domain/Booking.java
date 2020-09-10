package com.shapestone.labs.hotel.domain;

import java.util.Date;

public final class Booking {
    private final String bookingId;
    private final String roomId;
    private final String guestId;
    private final Date from;
    private final Date until;

    public Booking(String roomId, String guestId, Date from, Date until) {
        this.bookingId = null;
        this.roomId = roomId;
        this.guestId = guestId;
        this.from = from;
        this.until = until;
    }

    public String bookingId() {
        return bookingId;
    }

    public String roomId() {
        return roomId;
    }

    public String guestId() {
        return guestId;
    }

    public Date from() {
        return from;
    }

    public Date until() {
        return until;
    }
}
