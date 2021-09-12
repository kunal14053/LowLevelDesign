package com.designpattern.creational.builder;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 10.25f;
    }
}
