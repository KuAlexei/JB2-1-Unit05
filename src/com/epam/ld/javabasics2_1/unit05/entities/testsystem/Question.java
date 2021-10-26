package com.epam.ld.javabasics2_1.unit05.entities.testsystem;

import java.util.*;

public class Question {

    private final String id;
    private final String question;
    private boolean multipleChoice;
    private Map<String, String> options =new HashMap<>();
    private Set<String> correctAnswer = new HashSet<>();

    public Question(String id, String question) {
        this.id = id;
        this.question = question;
    }

    public Question(String id, String question, Map<String, String> options, Set<String> correctAnswer, boolean multipleChoice) {
        this(id, question);
        this.multipleChoice = multipleChoice;
        this.options.putAll(options);
        this.correctAnswer.addAll(correctAnswer);
    }

    public Question(String id, String question, Map<String, String> options, Set<String> correctAnswer) {
        this(id, question, options, correctAnswer, false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return id.equals(question1.id) && question.equals(question1.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question);
    }
}
