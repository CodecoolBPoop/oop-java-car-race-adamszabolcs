package com.codecool;

import java.util.Random;

public class Car {

    private static final int carNameLength = 2;
    private static final int brokenTruckSpeed = 75;
    public static final String[] carNames = {"Eon", "Crest", "Patron", "Blast", "Zeal", "Temper", "Crux", "Dynamics",
                                            "Flow", "Ivory", "Fragment", "Tradition", "Viper", "Universe", "Escape",
                                            "Magic", "Flux", "Blizzard"};

    private String name;

    private int normalSpeed;

    private int distanceTraveled = 0;

    private static String randomName = "";

    public Car() {
        createName();
        createNormalSpeed();
    }

    void makeDistance(int normalSpeed) {
        /** Add the actual normalSpeed to the distanceTraveled. */
        distanceTraveled += normalSpeed;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void createNormalSpeed() {
        /** Create speed when new Car() created.
         *  Random speed between 80-110 km/h
         *  Check if there is a broken truck, if true, set normal speed to rainingSpeed (75 km/h).*/
        if (Race.brokenTruck) {
            setNormalSpeed(brokenTruckSpeed);
        } else {
            Random randomSpeed = new Random();
            setNormalSpeed((randomSpeed.nextInt(30) + 1) + 80);
        }
    }

    void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    int getNormalSpeed() {
        return normalSpeed;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void createName() {
        /** Create name when new Car() created.
         *  get two random names from carNames list */
        randomName = "";
        for (int j = 0; j < carNameLength; j++) {
            Random carNameIndex = new Random();
            randomName += carNames[carNameIndex.nextInt(carNames.length - 1)] + " ";
        }
        setName(randomName);
    }

    void moveForAnHour(Race race) {
        createNormalSpeed();
        makeDistance(getNormalSpeed());
    }
}
