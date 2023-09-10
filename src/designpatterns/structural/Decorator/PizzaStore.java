package designpatterns.structural.Decorator;


import designpatterns.structural.Decorator.PizzaClasses.FarmHouse;
import designpatterns.structural.Decorator.PizzaClasses.Margherita;
import designpatterns.structural.Decorator.PizzaClasses.Pizza;

/*
*  https://www.geeksforgeeks.org/decorator-pattern-set-3-coding-the-design/
*  https://www.youtube.com/watch?v=w6a9MXUwcfY&t=1205s
*
*  Use this pattern to avoid class explosion, when we know that class can have multiple combinations.
*  This patterns helps us to extend the object's behaviour at runtime.
*  Pizza Shop, Coffee Shop , Milkshake : This kind of requirement we can use this pattern.
*
* */
public class PizzaStore {
    public static void main(String args[]){
        // create new margherita pizza
        Pizza pizza = new Margherita();
        System.out.println( pizza.getDescription() +" Cost :" + pizza.getCost());

        // create new FarmHouse pizza
        Pizza pizza2 = new FarmHouse();

        // decorate it with fresh tomato topping
        pizza2 = new FreshTomato(pizza2);

        //decorate it with paneer topping
        pizza2 = new Paneer(pizza2);
        System.out.println( pizza2.getDescription() + " Cost :" + pizza2.getCost());

        Pizza pizza3 = new Barbeque(null);    //no specific pizza
        System.out.println( pizza3.getDescription() + "  Cost :" + pizza3.getCost());
    }
}
