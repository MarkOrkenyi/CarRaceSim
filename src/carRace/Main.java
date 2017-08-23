package carRace;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Car[] cars = new Car[11];
    static Motorcycle[] motorcycles = new Motorcycle[11];
    static Truck[] trucks = new Truck[[11];
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
            motorcycles[i] = new Motorcycle();
            String newName = "Motorcycle " + Integer.toString(i+1);
            motorcycles[i].name = newName;
        }
    }
    public static void createTrucks() {
        for (int i = 0; i < 10; i++) {
            trucks[i] = new Truck();
            Random nameInt = new Random();
            int truckNameInt = nameInt.nextInt(1000 + 1 - 0) + 0;
            trucks[i].name = Integer.toString(truckNameInt);
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

