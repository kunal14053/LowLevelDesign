package com.designpattern.behavioural.observer;

public class BinaryObserver implements Observer{

    private Subject subject;

    BinaryObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
