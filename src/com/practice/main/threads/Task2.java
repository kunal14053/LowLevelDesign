package com.practice.main.threads;

public class Task2 extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("This is task 2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
