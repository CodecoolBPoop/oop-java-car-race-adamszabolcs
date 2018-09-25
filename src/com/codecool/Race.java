package com.codecool;
import java.util.*;

public class Race {

    public static final String[] carNames = {"Eon", "Crest", "Patron", "Blast", "Zeal", "Temper", "Crux", "Dynamics",
                                            "Flow", "Ivory", "Fragment", "Tradition", "Viper", "Universe", "Escape",
                                            "Magic", "Flux", "Blizzard"};
    public static final int racerNumber = 10;

    private static String randomName = "";

    public static final List<String> racingCarNames = new ArrayList<String>();

    public Race() {

    }

    void createVehicles() {
        for (int i = 0; i < racerNumber; i++) {
            randomName = "";
            for (int j = 0; j < 2; j++) {
                Random carNameIndex = new Random();
                randomName += carNames[carNameIndex.nextInt(carNames.length-1)];
            }
            racingCarNames.add(randomName);
        }

    }

    void simulateRace() {
        moveForAnHour();
    }

    void printRaceResults() {

    }

    boolean isThereABrokenTruck() {
        return false;
    }

    public static void main(String[] args) {
	    Race race = new Race();
    }
}
