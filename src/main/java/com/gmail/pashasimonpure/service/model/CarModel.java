package com.gmail.pashasimonpure.service.model;

import java.util.Random;

public enum CarModel {

    FORD,
    AUDI,
    VOLKSWAGEN;

    public static CarModel getRandom(){
        return values()[new Random().nextInt(CarModel.values().length)];
    }

}
