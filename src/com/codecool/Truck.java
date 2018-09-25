package com.codecool;

import java.util.Random;

public class Truck {
    private int speed = 100;
    private int name;
    private int breakDownTurnsLeft;
    private int distanceTraveled = 0;

    public Truck() {
        createName();
        setSpeed(speed);
        setBreakDownTurnsLeft(breakDownTurnsLeft);
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void changeSpeed() {
        if (isBroken()) {
            setSpeed(0);
        } else {
            setSpeed(speed);
        }
    }

    int getSpeed() {
        return speed;
    }

    void setBreakDownTurnsLeft(int breakDownTurnsLeft) {
        this.breakDownTurnsLeft = breakDownTurnsLeft;
    }

    boolean isBroken() {
        Random chance = new Random();
        int chanceForBreak = chance.nextInt(20) + 1;
        if (chanceForBreak == 1) {
            setBreakDownTurnsLeft(2);
            return true;
        }
        return false;
    }

    int getName() {
        return name;
    }

    void createName() {
        Random rand = new Random();
        setName(rand.nextInt(1001));
    }

    void setName(int name) {
        this.name = name;
    }

    void moveForAnHour(Race race) {

    }
}
