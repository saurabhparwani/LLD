package designpatterns.structural.Decorator.PizzaClasses;

import designpatterns.structural.Decorator.PizzaClasses.Pizza;

class PeppyPaneer extends Pizza
{
    public PeppyPaneer() { description = "Peppy Paneer"; }
    public int getCost() {  return 100; }
}
