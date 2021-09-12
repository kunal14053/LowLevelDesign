package com.practice.main.oops;

public class Practice2 {

    public static void main(String[] args) {
        Animal a = new Animal("Meaoo","Cat");

        a.printAnimal();
        System.out.println(a.toString());

        Animal b = new Dog("Meaoo","Cat");

        b.printAnimal();
        System.out.println(b.toString());


        Dog d = new Dog("Meaoo","Cat");

        d.printAnimal();
        System.out.println(d.toString());
        d.test();
        System.out.println(d.aaa.toString());

    }
}
