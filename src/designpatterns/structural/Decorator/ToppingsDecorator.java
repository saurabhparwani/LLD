package designpatterns.structural.Decorator;

import designpatterns.structural.Decorator.PizzaClasses.Pizza;

abstract class ToppingsDecorator extends Pizza {
    public abstract String getDescription();
}
