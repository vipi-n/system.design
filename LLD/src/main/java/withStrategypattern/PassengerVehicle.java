package withStrategypattern;

import withStrategypattern.strategy.NormalDriveStrategy;
import withStrategypattern.strategy.Vehicle;

public class PassengerVehicle extends Vehicle {

   PassengerVehicle(){
       super(new NormalDriveStrategy());
   }
}
