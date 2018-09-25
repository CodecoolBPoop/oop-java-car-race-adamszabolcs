package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private List<Car> cars = new ArrayList<>();

    public static final int racerNumber = 10;

    public Race() {
        createVehicles();
    }

    void createVehicles() {
        for (int i = 0; i < racerNumber; i++) {
            Car car = new Car();
            cars.add(car);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(Weather.checkIfRaining());
            for (Car car: cars) {
                System.out.println(car.getName());
                System.out.println(car.getNormalSpeed());
                car.addDistanceTraveled();
                System.out.println(car.getDistanceTraveled());
            }
        }
        int maxDistance = 0;
        String winnerName = "";
        for (Car car : cars) {
            if (car.getDistanceTraveled() > maxDistance) {
                maxDistance = car.getDistanceTraveled();
                winnerName = car.getName();
            }
        }
        System.out.println(maxDistance);
        System.out.println(winnerName);
    }

    void simulateRace() {
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
