package carRace;

import java.util.Random;


public class Simulation {
    static Car[] cars = new Car[11];
    static Motorcycle[] motorcycles = new Motorcycle[11];
    static Truck[] trucks = new Truck[11];
    static Boolean raining = false;

    void startSim() {
        System.out.println("Starting Sim");
        createVehicles();
        simulateRace();
    }

    void createVehicles() {
        createCars();
        createMotorcycles();
        createTrucks();
    }
    public static void simulateRace(){
        for (int i=0;i<50;i++) {
            raining = checkRain();
            for (int j=0;j<10;j++) {
                runCars();
                runMotorcycles();
                runTrucks();
            }
        }
    }

    public static Boolean checkRain() {
        Random chance = new Random();
        int rainChance = chance.nextInt(100 + 1) + 0;
        if (rainChance >= 30) {
            return true;
        }
        return false;
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
            String newName = "Motorcycle " + Integer.toString(i + 1);
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

    public static void runCars() {
        for (int j = 0; j < 10; j++) {
            if (raining) {
                cars[j].carSpeed = 70;
            }else{
                Random randomSpeed = new Random();
                int carSpeed = randomSpeed.nextInt(110+1-80) + 80;
                cars[j].carSpeed = carSpeed;
            }
            cars[j].moveForAnHour();
        }
    }

    public static void runMotorcycles() {
        for (int j = 0; j < 10; j++) {
            if (raining) {
                motorcycles[j].motorSpeed = 100;
                Random slower = new Random();
                int speedDecrease = slower.nextInt(50 + 1 - 5) + 5;
                motorcycles[j].motorSpeed = motorcycles[j].motorSpeed - speedDecrease;
            }else{
                motorcycles[j].motorSpeed = 100;
            }
            motorcycles[j].moveForAnHour();
        }
    }

    public static void runTrucks() {
        for (int j = 0; j < 10; j++) {
            trucks[j].runTruck();
        }
    }

}