package com.practice.main.oops;

public class Animal implements IAnimal{

    String bark;
    String name;

    Animal(String bark, String name){
        this.bark = bark;
        this.name = name;
    }

    @Override
    public void printAnimal() {
        System.out.println("I am a "+name);
    }

    @Override
    public String returnBark() {
        return bark;
    }


    @Override
    public String toString() {
        return "This Animal Bark like: "+bark;
    }

}
