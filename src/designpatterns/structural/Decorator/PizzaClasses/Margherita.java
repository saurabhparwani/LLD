package designpatterns.structural.Decorator.PizzaClasses;

import designpatterns.structural.Decorator.PizzaClasses.Pizza;

public class Margherita extends Pizza
{
    public Margherita()  { description = "Margherita"; }
    public int getCost() { return 100;  }
}
