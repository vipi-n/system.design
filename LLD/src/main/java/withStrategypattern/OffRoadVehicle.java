package withStrategypattern;


import withStrategypattern.strategy.SportDriveStrategy;
import withStrategypattern.strategy.Vehicle;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle(){
        super(new SportDriveStrategy());
    }
}
