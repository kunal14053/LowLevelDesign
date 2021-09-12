package com.practice.main.threads;

public class Task1 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("This is Task 1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
