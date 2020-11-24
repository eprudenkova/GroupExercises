package com.syntax.exercise1;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square(3,3);
        square.calculateArea();
        square.calculatePerimeter();
    }
}
