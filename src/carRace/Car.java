package carRace;
import java.util.*;
public class Car {
    Random speed = new Random();
    int carSpeed = speed.nextInt(110+1-80) + 80;
    public String name = null;
    int distanceTraveled = 0;
    void moveForAnHour() {
        this.distanceTraveled = distanceTraveled + carSpeed;
    }
    public static String getRandomCarName() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Roamer");
        names.add("Sliver");
        names.add("Oracle");
        names.add("Astral");
        names.add("Method");
        names.add("Majesty");
        names.add("Prestige");
        names.add("Crown");
        names.add("Umbra");
        names.add("Radiance");
        names.add("Falcon");
        names.add("Celestial");
        names.add("Evolution");
        names.add("Prophecy");
        names.add("Harmony");
        names.add("Augury");
        names.add("Dynamics");
        names.add("Wolf");
        names.add("Elysium");
        names.add("Freedom");
        names.add("Expedition");

        String name = names.get(new Random().nextInt(names.size()));
        return name;
    }
}
