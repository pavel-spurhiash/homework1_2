package com.gmail.pashasimonpure.service.util;

import java.util.Random;

public class Utilites {

    private static final Random rand = new Random();

    public static final Integer getRandomInt(Integer min, Integer max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public static final Integer getRandomInt() {
        return rand.nextInt();
    }
}
