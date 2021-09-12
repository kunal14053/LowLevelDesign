package com.practice.main.oops;

public class Dog extends Animal{
    String bark;
    String name;
    Animal aaa;

    Dog(String bark, String name){
        super(bark,name);
        this.bark = bark;
        this.name = name;
        this.aaa = new Animal("hell", "yesss");
    }

    @Override
    public void printAnimal() {
        System.out.println("I m a Dog");
    }

    public void test(){
        System.out.println("Testing");
    }

}
