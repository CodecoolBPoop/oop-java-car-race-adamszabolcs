package com.codecool;

import java.util.Random;

public class Weather {

    public static int raining;

    void setRaining() {
        Random randomRaining = new Random();
        raining = randomRaining.nextInt(10) + 1;
    }

    boolean isRaining() {
        if (raining > 3) {
            return false;
        }
        return true;
    }
}
