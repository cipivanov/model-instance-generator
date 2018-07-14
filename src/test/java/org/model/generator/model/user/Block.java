package org.model.generator.model.user;

public class Block {

    private String id;

    private Integer floor;

    private Boolean renovated;

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

    public Boolean getRenovated() {
        return renovated;
    }

    public void setRenovated(Boolean renovated) {
        this.renovated = renovated;
    }

    @Override
    public String toString() {
        return "Block {" +
                "\n id='" + id + '\'' +
                ",\n floor=" + floor +
                ",\n floor=" + renovated +
                "}";
    }
}