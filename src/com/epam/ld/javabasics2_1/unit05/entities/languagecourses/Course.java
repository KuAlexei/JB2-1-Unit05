package com.epam.ld.javabasics2_1.unit05.entities.languagecourses;

import java.time.LocalDate;
import java.util.Objects;

public class Course {

    private final String name;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private Schedule schedule;
    private String Trainer;

    public Course(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return name.equals(course.name) && startDate.equals(course.startDate) && endDate.equals(course.endDate) && Trainer.equals(course.Trainer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDate, endDate, Trainer);
    }
}
