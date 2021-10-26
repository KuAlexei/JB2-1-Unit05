package com.epam.ld.javabasics2_1.unit05.entities.entryjournal;

import java.time.LocalDateTime;
import java.util.Objects;

public class Lesson {

    private final String name;
    private final LocalDateTime startDateTime;
    private String auditorium;
    private String pedagogue;

    public Lesson(String name, LocalDateTime startDateTime) {
        this.name = name;
        this.startDateTime = startDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return name.equals(lesson.name) && startDateTime.equals(lesson.startDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDateTime);
    }
}
