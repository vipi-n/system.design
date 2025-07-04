package withStrategypattern;

import withStrategypattern.strategy.NormalDriveStrategy;
import withStrategypattern.strategy.Vehicle;

public class GoodsVehicle  extends Vehicle {

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
