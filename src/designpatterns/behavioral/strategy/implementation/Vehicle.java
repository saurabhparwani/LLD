package designpatterns.behavioral.strategy.implementation;

import designpatterns.behavioral.strategy.strategies.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy ;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }

}
