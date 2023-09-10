package designpatterns.structural.Decorator.PizzaClasses;

import designpatterns.structural.Decorator.PizzaClasses.Pizza;

public class SimplePizza extends Pizza
{
    public SimplePizza() { description = "SimplePizza"; }
    public int getCost() {  return 50;  }
}
