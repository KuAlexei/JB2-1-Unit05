package com.epam.ld.javabasics2_1.unit05.entities.notebook;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class AbstractNote {

    private LocalDateTime dateTime;
    private String record;

    public AbstractNote(LocalDateTime dateTime, String record) {
        this.dateTime = dateTime;
        this.record = record;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractNote note = (AbstractNote) o;
        return dateTime.equals(note.dateTime) && record.equals(note.record);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, record);
    }

}
