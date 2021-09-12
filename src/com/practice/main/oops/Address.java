package com.practice.main.oops;

public class Address {
    private String street;
    private String houseNo;
    private String floor;
    private FloorType floorType;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public FloorType getFloorType() {
        return floorType;
    }

    public void setFloorType(FloorType floorType) {
        this.floorType = floorType;
    }
}
