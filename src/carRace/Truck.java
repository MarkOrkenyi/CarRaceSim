package carRace;

import java.util.Random;

public class Truck {
    Random nameInt = new Random();
    int truckNameInt = nameInt.nextInt(1000 + 1 - 0) + 0;
    int truckSpeed = 100;
    public String name = Integer.toString(truckNameInt);
    int distanceTraveled = 0;
    int breakdownTurnsLeft = 0;

    void runTrucks(){
        checkChance();
        moveForAnHour();
    }

    void checkChance() {
        Random chance = new Random();
        int breakdownChance = chance.nextInt(100 + 1) + 0;
        if (breakdownChance >= 5 & breakdownTurnsLeft==0)
        {
            System.out.println("Truck"+ name +" broke down");
            breakdownTurnsLeft = 2;
        }
    }
    void moveForAnHour(){
        if (breakdownTurnsLeft > 0){
            breakdownTurnsLeft--;
        } else{
            this.distanceTraveled = distanceTraveled + truckSpeed;
        }
    }
}