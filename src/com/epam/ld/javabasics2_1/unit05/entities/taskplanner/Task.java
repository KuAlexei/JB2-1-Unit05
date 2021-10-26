package com.epam.ld.javabasics2_1.unit05.entities.taskplanner;

import java.time.LocalDateTime;

public class Task {

    private LocalDateTime creationDateTime = LocalDateTime.now();
    private LocalDateTime completionDateTime;
    private LocalDateTime completeBefore;
    private String name;
    private String description;
    private Person createdBy;
    private Person assignee;
    private Status status = Status.OPEN;

    public Task(String name, String description, Person createdBy) {
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
    }

    public Task(String name, String description, Person createdBy, LocalDateTime completeBefore) {
        this(name, description, createdBy);
        this.completeBefore = completeBefore;
    }

}
