package practice.desginpaterns.strategy.implementation;

import practice.desginpaterns.strategy.strategies.Drivestrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(Drivestrategy drivestrategy) {
        super(drivestrategy);
    }
}
