package withoutStrategypattern;
public class SportsCarVehicle extends Vehicle {

    // code duplicate
    @Override
    public void drive() {
        System.out.println("Sports car driving strategy");
    }
}
