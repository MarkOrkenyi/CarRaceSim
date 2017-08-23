package carRace;

import java.util.Random;

public class Motorcycle {
    Random chance = new Random();
    int motorSpeed = 100;
    public String name = null;
    int distanceTraveled = 0;

    Boolean checkRain() {
        Random chance = new Random();
        int rainChance = chance.nextInt(100 + 1) + 0;
        if (rainChance >= 5)
        {
            System.out.println("it rains!");
            return true;
        }
        return false;
    }

    void moveForAnHour(){
            this.distanceTraveled = distanceTraveled + motorSpeed;
    }
}
