package com.designpattern.creational.builder;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 7.0f;
    }
}
