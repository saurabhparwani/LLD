package practice.desginpaterns.strategy;

import practice.desginpaterns.strategy.implementation.GoodsVehicle;
import practice.desginpaterns.strategy.implementation.OffroadVehicle;
import practice.desginpaterns.strategy.implementation.SportsVehicle;
import practice.desginpaterns.strategy.implementation.Vehicle;
import practice.desginpaterns.strategy.strategies.NormalDriveStrategy;
import practice.desginpaterns.strategy.strategies.SportsDrivingStrategy;

public class Runner {
    public static void main(String[] args){
        Vehicle sportsVehicle = new SportsVehicle(new NormalDriveStrategy());
        Vehicle goodsVehicle = new GoodsVehicle(new SportsDrivingStrategy());
        Vehicle normalVehicle = new OffroadVehicle(new NormalDriveStrategy());

        sportsVehicle.drive();
        goodsVehicle.drive();
        normalVehicle.drive();

    }
}
