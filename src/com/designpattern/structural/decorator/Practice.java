package com.designpattern.structural.decorator;


public class Practice {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redSquare = new RedShapeDecorator(new Square());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redSquare.draw();
    }
}
