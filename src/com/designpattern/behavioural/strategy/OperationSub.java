package com.designpattern.behavioural.strategy;

public class OperationSub implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return Math.abs(num1-num2);
    }
}
