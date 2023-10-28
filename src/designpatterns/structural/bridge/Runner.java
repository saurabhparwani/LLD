package designpatterns.structural.bridge;

/*  Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate
hierarchies—abstraction and implementation—which can be developed independently of each other. */

public class Runner {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
