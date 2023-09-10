package designpatterns.structural.Decorator.PizzaClasses;

import designpatterns.structural.Decorator.PizzaClasses.Pizza;

public class FarmHouse extends Pizza
{
    public FarmHouse() {  description = "FarmHouse"; }
    public int getCost() { return 200; }
}
