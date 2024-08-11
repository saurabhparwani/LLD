package practice.desginpaterns.strategy.implementation;

import practice.desginpaterns.strategy.strategies.Drivestrategy;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle(Drivestrategy drivestrategy) {
        super(drivestrategy);
    }
}
