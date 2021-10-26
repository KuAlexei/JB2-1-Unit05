package com.epam.ld.javabasics2_1.unit05.entities.habittracker;

import java.util.HashSet;
import java.util.Set;

public class HumanHabitTracker {

    private String firstName;
    private String lastName;

    private Set<Habit> habits = new HashSet<>();

    public HumanHabitTracker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
