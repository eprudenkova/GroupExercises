package com.syntax.exercise3;

public class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String carColor, double length) {
        super(carPrice, carColor);
        this.length = length;
    }


    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.9;
        }
    }
}
