package com.codecool;

import java.util.Random;

public class Weather {

    public static boolean raining;

    private static int rainingNumber;

    static void setRaining() {
        Random randomWeather = new Random();
        rainingNumber = randomWeather.nextInt(10) + 1;
        isRaining();
    }

    static boolean isRaining() {
        if (rainingNumber > 3) {
            raining = true;
        } else {
            raining = false;
        }
        return raining;
    }

}
