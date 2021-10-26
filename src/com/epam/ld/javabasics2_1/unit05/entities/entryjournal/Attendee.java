package com.epam.ld.javabasics2_1.unit05.entities.entryjournal;

import java.util.Objects;

public class Attendee {

    private final String personalID;
    private String firstName;
    private String lastName;
    private String additionalName;
    private String group;

    public Attendee(String personalID) {
        this.personalID = personalID;
    }

    public Attendee(String personalID, String firstName, String lastName, String additionalName, String group) {
        this(personalID);
        this.firstName = firstName;
        this.lastName = lastName;
        this.additionalName = additionalName;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendee attendee = (Attendee) o;
        return personalID.equals(attendee.personalID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalID);
    }
}
