package designpatterns.behavioral.strategy.implementation;

import designpatterns.behavioral.strategy.strategies.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
