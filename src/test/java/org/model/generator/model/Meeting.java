package org.model.generator.model;

import org.model.generator.annotation.AutoValue;

import java.time.LocalDate;

public class Meeting {

    @AutoValue(pattern = "[0-9]{3}")
    private String id;

    @AutoValue(pattern = "future-date")
    private LocalDate date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "\n id=" + id +
                ",\n date=" + date +
                "\n }";
    }
}