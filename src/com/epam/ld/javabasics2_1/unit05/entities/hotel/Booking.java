package com.epam.ld.javabasics2_1.unit05.entities.hotel;

import java.time.LocalDate;
import java.util.Objects;

public class Booking {

    private final LocalDate from;
    private final LocalDate till;
    private final Person by;

    public Booking(LocalDate from, LocalDate till, Person by) {
        this.from = from;
        this.till = till;
        this.by = by;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return from.equals(booking.from) && till.equals(booking.till) && by.equals(booking.by);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, till, by);
    }
}
