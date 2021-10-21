package com.laiba9999;

public class Main {

    public static void main(String[] args) {
    Garage laibaGarage = new Garage();
    Car laibaCar = new Car ("BMW", "i8", "Black");

    laibaGarage.insertCar(laibaCar);
    laibaGarage.getCarList().forEach(car -> System.out.println(car));
    }
}
