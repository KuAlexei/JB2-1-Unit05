package com.epam.ld.javabasics2_1.unit05.entities.habittracker;

import java.time.LocalDate;
import java.util.Objects;

public class Habit {

    private final String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public Habit(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habit habit = (Habit) o;
        return name.equals(habit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
