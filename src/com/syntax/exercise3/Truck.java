package com.syntax.exercise3;

public class Truck extends Car {
    double weight;

    public Truck(double carPrice, String carColor, double weight) {
        super(carPrice,carColor);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice * 0.9;
        } else {
            return carPrice * 0.8;
        }
    }
}
