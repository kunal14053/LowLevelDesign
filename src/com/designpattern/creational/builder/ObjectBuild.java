package com.designpattern.creational.builder;

public class ObjectBuild {
    private String first_name;
    private String last_name;
    private String address;

    private ObjectBuild(){}

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static ObjectBuild build(){
        return new ObjectBuild();
    }

    public ObjectBuild withFirstName(String name){
        this.setFirst_name(name);
        return this;
    }

    public ObjectBuild withLastName(String name){
        this.setLast_name(name);
        return this;
    }

    public ObjectBuild withAddress(String address){
        this.setAddress(address);
        return this;
    }

}
