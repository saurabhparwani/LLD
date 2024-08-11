package practice.desginpaterns.strategy.implementation;

import practice.desginpaterns.strategy.strategies.Drivestrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(Drivestrategy drivestrategy) {
        super(drivestrategy);
    }
}
