package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private int fullRace = 50;

    private List<Truck> trucks = new ArrayList<>();

    private List<Motorcycle> motorcycles = new ArrayList<>();

    private List<Car> cars = new ArrayList<>();

    public static final int racerNumber = 10;

    public Race() {
    }

    void createVehicles() {
        for (int i = 0; i < racerNumber; i++) {
            Car car = new Car();
            Truck truck = new Truck();
            Motorcycle motor = new Motorcycle();
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
                car.moveForAnHour();
            }
            for (Truck truck : trucks) {
                truck.moveForAnHour();
            }
            for (Motorcycle motor : motorcycles) {
                motor.moveForAnHour();
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
        System.out.println(maxDistance);
        System.out.println(winnerName);
    }

    boolean isThereABrokenTruck() {
        return false;
    }

    public static void main(String[] args) {
	    Race race = new Race();
	    race.simulateRace();
    }
}
