package com.syntax.exercise1;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of the circle is " + (Math.PI * radius * radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the circle is " + (2*Math.PI* radius));
    }
}
