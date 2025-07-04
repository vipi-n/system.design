package withoutStrategypattern;

public class OffRoadVehicle extends Vehicle {

    // code duplicate from SportsCarVehicle
    @Override
    public void drive() {
        System.out.println("Sports car driving strategy");
    }
}
