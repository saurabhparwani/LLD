package designpatterns.structural.Decorator.PizzaClasses;

import designpatterns.structural.Decorator.PizzaClasses.Pizza;

public class ChickenFiesta extends Pizza {
    public ChickenFiesta() { description = "ChickenFiesta";}
    public int getCost() { return 200; }
}
