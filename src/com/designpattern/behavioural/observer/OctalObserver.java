package com.designpattern.behavioural.observer;

public class OctalObserver implements Observer{

    private Subject subject;

    OctalObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
