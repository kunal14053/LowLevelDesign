package com.designpattern.creational.singleton;

public class Singleton {

    private String temp;

    private Singleton(){
        temp = "Hello";
    }

    static Singleton getInstance(){
        return new Singleton();
    }

    public String getTemp() {
        return temp;
    }
}
