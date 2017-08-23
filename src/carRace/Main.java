package carRace;


public class Main {

    public static void main(String[] args) {
        System.out.println("Car Race Simulator 2000");
        Simulation simulation = new Simulation();
        simulation.startSim();
        printRaceResults();
    }


    public static void printRaceResults() {
        System.out.println("Cars: ");
        for (int i=0;i<10;i++) {
            System.out.print(Simulation.cars[i].name);
            System.out.print(" ");
            System.out.print(Simulation.cars[i].distanceTraveled);
            System.out.println("");
        }
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Motorcycles: ");
        for (int i=0;i<10;i++) {
            System.out.print(Simulation.motorcycles[i].name);
            System.out.print(" ");
            System.out.print(Simulation.motorcycles[i].distanceTraveled);
            System.out.println("");
        }
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Trucks: ");
        for (int i=0;i<10;i++) {
            System.out.print(Simulation.trucks[i].name);
            System.out.print(" ");
            System.out.print(Simulation.trucks[i].distanceTraveled);
            System.out.println("");
        }
    }
}

