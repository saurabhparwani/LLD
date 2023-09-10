package designpatterns.behavioral.strategy.implementation;

import designpatterns.behavioral.strategy.strategies.NormalDriveStrategy;

public class GoodsVehicle extends  Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
