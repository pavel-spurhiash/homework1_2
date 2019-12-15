package com.gmail.pashasimonpure.service.model;

public class Car {


    private String      name;
    private CarModel    model;
    private int         engineСapacity;

    public Car(String name, CarModel model, int capacity){
        this.name = name;
        this.model = model;
        this.engineСapacity = capacity;
    }

    public String getName(){
        return this.name;
    }

    public CarModel getModel(){
        return this.model;
    }

    public Integer getEngineCapacity(){
        return this.engineСapacity;
    }

    @Override
    public String toString(){
        return this.name + " : " + this.model + " : " + this.engineСapacity;
    }

}
