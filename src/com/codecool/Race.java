package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private Race race;

    private int fullRace = 50;

    private List<Truck> trucks = new ArrayList<>();

    private List<Motorcycle> motorcycles = new ArrayList<>();

    private List<Car> cars = new ArrayList<>();

    public static final int racerNumber = 10;

    public static boolean brokenTruck = false;

    public Race() {
        createVehicles();
        simulateRace();
    }

    void createVehicles() {
        for (int i = 0; i < racerNumber; i++) {
            Car car = new Car();
            Truck truck = new Truck();
            Motorcycle motor = new Motorcycle("Motorcycle " + (i+1));
            cars.add(car);
            trucks.add(truck);
            motorcycles.add(motor);
        }
    }

    void simulateRace() {
        createVehicles();
        for (int i = 0; i < fullRace; i++) {
            Weather.setRaining();
            for (Car car: cars) {
                car.moveForAnHour(race);
            }
            for (Truck truck : trucks) {
                truck.moveForAnHour(race);
            }
            for (Motorcycle motor : motorcycles) {
                motor.moveForAnHour(race);
            }
        }
        printRaceResults();
    }

    void printRaceResults() {
        int maxDistance = 0;
        String winnerName = "";
        for (Car car : cars) {
            if (car.getDistanceTraveled() > maxDistance) {
                maxDistance = car.getDistanceTraveled();
                winnerName = car.getName();
            }
        }
        System.out.println("Race winner " + winnerName + "made " + maxDistance + "km distance on the race.");
        maxDistance = 0;
        for (Motorcycle motor : motorcycles) {
            if (motor.getDistanceTraveled() > maxDistance) {
                maxDistance = motor.getDistanceTraveled();
                winnerName = motor.getName();
            }
        }
        System.out.println("Motor winner " + winnerName + " made " + maxDistance + "km distance on the race.");
        maxDistance = 0;
        int winnerTruck = 0;
        for (Truck truck : trucks) {
            if (truck.getDistanceTraveled() > maxDistance) {
                maxDistance = truck.getDistanceTraveled();
                winnerTruck = truck.getName();
            }
        }
        System.out.println("Truck winner " + winnerTruck + " made " + maxDistance + "km distance on the race.");
    }

    boolean isThereABrokenTruck() {
        for (Truck truck : trucks) {
            truck.isBroken();
            if (truck.getBreakDownTurnsLeft() > 0) {
                brokenTruck = true;
                return brokenTruck;
            }
        }
        return brokenTruck;
    }

    public static void main(String[] args) {
	    Race race = new Race();
    }
}
