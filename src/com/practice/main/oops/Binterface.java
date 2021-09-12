package com.practice.main.oops;

public interface Binterface extends AInterface{

    default void msg(){System.out.println("default method");}

    static int cube(int x){return x*x*x;}

    void hello();
}
