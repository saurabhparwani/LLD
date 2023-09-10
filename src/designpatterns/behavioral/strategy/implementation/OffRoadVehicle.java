package designpatterns.behavioral.strategy.implementation;
import designpatterns.behavioral.strategy.strategies.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
