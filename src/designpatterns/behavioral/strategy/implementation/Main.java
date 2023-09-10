package designpatterns.behavioral.strategy.implementation;

import designpatterns.behavioral.strategy.strategies.NormalDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}
