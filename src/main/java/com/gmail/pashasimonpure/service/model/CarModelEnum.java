package com.gmail.pashasimonpure.service.model;

import java.util.Random;

public enum CarModelEnum {

    FORD,
    AUDI,
    VOLKSWAGEN;

    public static CarModelEnum getRandom() {
        return values()[new Random().nextInt(CarModelEnum.values().length)];
    }

}
