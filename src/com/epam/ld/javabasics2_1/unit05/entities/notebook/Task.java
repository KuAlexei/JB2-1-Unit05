package com.epam.ld.javabasics2_1.unit05.entities.notebook;

import java.time.LocalDateTime;

public class Task extends AbstractNote {

    private LocalDateTime completionDateTime;
    private LocalDateTime completeBefore;

    public Task(LocalDateTime dateTime, String record) {
        this(dateTime, record, null);
    }

    public Task(LocalDateTime dateTime, String record, LocalDateTime completeBefore) {
        super(dateTime, record);
        this.completeBefore = completeBefore;
    }

}
