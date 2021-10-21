package com.laiba9999;

public class Car {
    private String make;
    private String model;
    private String colour;

    public Car(String make, String model, String colour){
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

   public Car(){

   }

   //setters


    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //Getters


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }


}
