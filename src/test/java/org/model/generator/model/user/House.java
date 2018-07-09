package org.model.generator.model.user;

import org.model.generator.annotation.AutoValue;

public class House {

    @AutoValue(pattern = "[0-9]{3}")
    private String number;

    @AutoValue(pattern = "[0-9]{2}")
    private String floor;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "number='" + number + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}