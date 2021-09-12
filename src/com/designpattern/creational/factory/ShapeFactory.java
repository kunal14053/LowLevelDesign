package com.designpattern.creational.factory;

public class ShapeFactory extends AbstractShape{

    @Override
    Shape getShape(ShapeType shapeType) {
        switch (shapeType){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
