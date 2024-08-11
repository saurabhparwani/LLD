package practice.desginpaterns.strategy.implementation;

import practice.desginpaterns.strategy.strategies.Drivestrategy;

public abstract class Vehicle {
    Drivestrategy drivestrategy;

    public Vehicle(Drivestrategy drivestrategy) {
        this.drivestrategy = drivestrategy;
    }
    public void drive(){
        this.drivestrategy.drive();
    }
}
