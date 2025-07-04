package withStrategypattern;

import withStrategypattern.strategy.SportDriveStrategy;
import withStrategypattern.strategy.Vehicle;

public class SportsCarVehicle extends Vehicle {

    public SportsCarVehicle() {
        super(new SportDriveStrategy());
    }
}
