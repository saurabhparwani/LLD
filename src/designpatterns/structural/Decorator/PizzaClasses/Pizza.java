package designpatterns.structural.Decorator.PizzaClasses;
abstract public class Pizza
{
    String description = "Unknown Pizza";
    public String getDescription()
    {
        return description;
    }
    public abstract int getCost();
}