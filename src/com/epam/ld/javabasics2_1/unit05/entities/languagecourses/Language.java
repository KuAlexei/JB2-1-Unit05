package com.epam.ld.javabasics2_1.unit05.entities.languagecourses;

import java.util.Objects;

public class Language {

    private final String name;

    public Language(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return name.equals(language.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
