package com.codecool;

import java.util.Random;

public class Truck {
    private static int speed = 100;
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

    int getDistanceTraveled() {
       return distanceTraveled;
    }

    void makeDistance(int speed) {
        distanceTraveled += speed;
    }

    int getSpeed() {
        return speed;
    }

    void setBreakDownTurnsLeft(int breakDownTurnsLeft) {
        this.breakDownTurnsLeft = breakDownTurnsLeft;
    }

    int getBreakDownTurnsLeft() {
        return breakDownTurnsLeft;
    }

    boolean isBroken() {
        if (breakDownTurnsLeft == 0) {
            Random chance = new Random();
            int chanceForBreak = chance.nextInt(20) + 1;
            if (chanceForBreak == 1) {
                setSpeed(0);
                setBreakDownTurnsLeft(2);
                return true;
            }
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

    void oneHourPass() {
        breakDownTurnsLeft -= 1;
    }

    void moveForAnHour(Race race) {
        if (breakDownTurnsLeft != 0) {
            changeSpeed();
            oneHourPass();
        } else {
            isBroken();
            setSpeed(100);
            makeDistance(getSpeed());
        }
    }
}