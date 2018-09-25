package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {

    private static final int carNameLength = 2;
    private static final int rainingSpeed = 75;
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
        distanceTraveled += normalSpeed;
    }

    void addDistanceTraveled() {
        makeDistance(normalSpeed);
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void createNormalSpeed() {
        if (Weather.isRaining) {
            setNormalSpeed(rainingSpeed);
        } else {
            Random randomSpeed = new Random();
            setNormalSpeed((randomSpeed.nextInt(30) + 1) + 80);
        }
    }

    void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    int getNormalSpeed() {
        createNormalSpeed();
        return normalSpeed;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void createName() {
        randomName = "";
        for (int j = 0; j < carNameLength; j++) {
            Random carNameIndex = new Random();
            randomName += carNames[carNameIndex.nextInt(carNames.length - 1)] + " ";
        }
        setName(randomName);
    }

    String getNameByDistance(int distanceTraveled) {
        if (distanceTraveled == this.distanceTraveled) {
            return name;
        }
        return "";
    }

    void moveForAnHour(Race race) {

    }
}
