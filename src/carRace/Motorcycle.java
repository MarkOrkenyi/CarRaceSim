package carRace;


public class Motorcycle {
    int motorSpeed = 100;
    public String name = null;
    int distanceTraveled = 0;

    void moveForAnHour(){
            this.distanceTraveled = distanceTraveled + motorSpeed;
    }
}
