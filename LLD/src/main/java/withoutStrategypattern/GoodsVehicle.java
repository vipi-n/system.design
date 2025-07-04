package withoutStrategypattern;

public class GoodsVehicle  extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Goods car driving strategy");
    }
}
