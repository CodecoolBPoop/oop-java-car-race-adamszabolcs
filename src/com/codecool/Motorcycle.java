package com.codecool;

import java.util.Random;

public class Motorcycle {

    private int speed = 100;
    private String name;
    private int distanceTraveled = 0;

    public Motorcycle(String name) {
        this.name = name;
        createSpeed();
    }

    String getName() {
        return name;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void makeDistance(int speed) {
        distanceTraveled += speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }

    void createSpeed() {
        if (Weather.raining) {
            Random rainingSlow = new Random();
            setSpeed(rainingSlow.nextInt(45) + 51);
        } else {
            setSpeed(speed);
        }
    }

    static String nameNumber;
    int distanceTraveled;
    void moveForAnHour(Race race) {

    }
}
