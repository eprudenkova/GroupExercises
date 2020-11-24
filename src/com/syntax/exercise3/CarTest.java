package com.syntax.exercise3;

public class CarTest {
    public static void main(String[] args) {
        Car sedan1 = new Sedan(10000,"black",25);
        Car sedan2 = new Sedan(10000, "silver",19);

        Car truck1 = new Truck(20000, "red",2200);
        Car truck2 = new Truck(20000, "blue",1900);

        Car[] cars = {sedan1,sedan2,truck1,truck2};
        for(Car car:cars){
            System.out.println(car.calculateSalePrice());
        }
    }
}
