package org.model.generator.model.user;

public class Block {

    private String id;

    private Integer floor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Block {" +
                "\n id='" + id + '\'' +
                ",\n floor=" + floor +
                "}";
    }
}