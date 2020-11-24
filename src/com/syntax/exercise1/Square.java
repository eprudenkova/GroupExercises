package com.syntax.exercise1;

public class Square implements Shape{
    double length;
    double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of the square is " + (length*width));

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the square is " + (2*(length+width)));
    }
}
