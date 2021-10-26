package com.epam.ld.javabasics2_1.unit05.entities.testsystem;

import java.util.Objects;
import java.util.Set;

public class Questionary {

    private final String id;
    private Set<Question> questions;

    public Questionary(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questionary that = (Questionary) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
