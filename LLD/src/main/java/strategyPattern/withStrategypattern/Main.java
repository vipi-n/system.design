package withStrategypattern;

import withStrategypattern.strategy.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new SportsCarVehicle();
        Vehicle vehicle1 = new PassengerVehicle();
        vehicle.drive();
        vehicle1.drive();
    }




}
