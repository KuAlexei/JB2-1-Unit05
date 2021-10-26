package com.epam.ld.javabasics2_1.unit05.entities.entryjournal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Journal {

    private String name;
    private final Map<Lesson, Set<Attendee>> journal = new HashMap<>();

}
