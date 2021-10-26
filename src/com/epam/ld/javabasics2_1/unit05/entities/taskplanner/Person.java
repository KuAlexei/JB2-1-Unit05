package com.epam.ld.javabasics2_1.unit05.entities.taskplanner;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private final String personalID;
    private String firstName;
    private String lastName;
    private String additionalName;
    private LocalDate birthday;
    private LocalDate deceased;

    public Person(String personalID) {
        this.personalID = personalID;
    }

    public Person(String personalID, String firstName, String lastName, String additionalName, LocalDate birthday) {
        this(personalID);
        this.firstName = firstName;
        this.lastName = lastName;
        this.additionalName = additionalName;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personalID, person.personalID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalID);
    }
}
