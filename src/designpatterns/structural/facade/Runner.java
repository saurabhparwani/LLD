package designpatterns.structural.facade;

/* Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
   Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
 */

public class Runner {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
