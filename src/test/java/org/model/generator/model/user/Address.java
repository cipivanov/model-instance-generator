package org.model.generator.model.user;

import org.model.generator.annotation.AutoValue;

public class Address {

    @AutoValue(pattern = "[A-Z]{5,8} Street")
    private String street;

    private House house;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}