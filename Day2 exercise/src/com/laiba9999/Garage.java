package com.laiba9999;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    public List<Car> carList;

    public Garage(){
        this.carList = new ArrayList<>();
    }

    public void insertCar(Car car){
        carList.add(car);
    }

    //setters

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    //getters

    public List<Car> getCarList() {
        return carList;
    }
}
