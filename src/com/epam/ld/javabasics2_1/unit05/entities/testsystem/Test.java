package com.epam.ld.javabasics2_1.unit05.entities.testsystem;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Test {

    private final String id;
    private final Questionary questionary;
    private final Person person;
    private Map<Question, Set<String>> givenAnswers;

    public Test(String id, Questionary questionary, Person person) {
        this.id = id;
        this.questionary = questionary;
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return id.equals(test.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
