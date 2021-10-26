package com.epam.ld.javabasics2_1.unit05.entities.languagecourses;

import java.time.LocalDateTime;
import java.util.Objects;

public class Lesson {

    private final LocalDateTime startDateTime;
    private String auditorium;

    public Lesson(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return startDateTime.equals(lesson.startDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDateTime);
    }
}
