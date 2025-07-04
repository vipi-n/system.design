package withoutStrategypattern;

public class PassengerVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Passenger car driving strategy");
    }
}
