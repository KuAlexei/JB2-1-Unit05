package com.epam.ld.javabasics2_1.unit05.entities.hotel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Room {

    private final String name;
    private Map<String, String> properties = new HashMap<>();
    private List<Booking> upcomingBookings;
    private Booking currentBooking;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return name.equals(room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
