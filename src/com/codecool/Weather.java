package com.codecool;

import java.util.Random;

public class Weather {

    public static boolean isRaining;

    public static boolean checkIfRaining() {
        Random randomWeather = new Random();
        int rainingNumber = randomWeather.nextInt(10) + 1;
        if (rainingNumber > 3) {
            isRaining = true;
        } else {
            isRaining = false;
        }
        return isRaining;
    }

}
