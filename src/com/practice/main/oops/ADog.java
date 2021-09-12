package com.practice.main.oops;

public abstract class ADog implements AInterface{

    ADog(String a){
        System.out.println(a);
    }
    ADog(){
        System.out.println("Test");
    }
    abstract void run();

    void testPrint(){
        System.out.println("Hello");
    }

    abstract void helloDummy();

}
