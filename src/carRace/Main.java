package carRace;

import java.util.ArrayList;

public class Main {
    static Car[] cars = new Car[11];
    public static void main(String[] args) {
        System.out.println("Car Race Simulator 2000");
        createVehicles();
        StartSim();
        printResults();
    }
    public static void createVehicles() {
        createCars();
        }
    public static void createCars() {
        for (int i = 0; i < 10; i++) {
            cars[i] = new Car();
            String newName = Car.getRandomCarName() + " " + Car.getRandomCarName();
            cars[i].name = newName;
        }
    }
    public static void createMotorcycles() {
        for (int i = 0; i < 10; i++) {
            cars[i] = new Car();
            String newName = Car.getRandomCarName() + " " + Car.getRandomCarName();
            cars[i].name = newName;
        }
    }
    public static void createTrucks() {
        for (int i = 0; i < 10; i++) {
            cars[i] = new Car();
            String newName = Car.getRandomCarName() + " " + Car.getRandomCarName();
            cars[i].name = newName;
        }
    }
    public static void StartSim(){
        for (int i=0;i<5;i++) {
            for (int j=0;j<10;j++) {
                cars[j].moveForAnHour();
            }
        }
    }

    public static void printResults() {
        for (int i=0;i<10;i++) {
            System.out.println(cars[i].name);
            System.out.println(cars[i].distanceTraveled);
        }
    }
}

