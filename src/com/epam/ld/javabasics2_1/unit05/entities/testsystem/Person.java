package com.epam.ld.javabasics2_1.unit05.entities.testsystem;

import java.util.Objects;

public class Person {

    private final String email;
    private String firstName;
    private String lastName;
    private String additionalName;

    public Person(String email) {
        this.email = email;
    }

    public Person(String email, String firstName, String lastName, String additionalName) {
        this(email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.additionalName = additionalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

}
