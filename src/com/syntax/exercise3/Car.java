package com.syntax.exercise3;

public class Car {
   double carPrice;
   String carColor;

    public Car(double carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }

    public Car() {

    }

    double calculateSalePrice(){
       return carPrice;
   }
}
