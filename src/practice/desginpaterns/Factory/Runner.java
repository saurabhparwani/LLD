package practice.desginpaterns.Factory;

public class Runner {
    public static void main(String[] args){
        Shape shape = ShapeFactory.getShape("adadsdad");
        Shape rectangle = ShapeFactory.getShape("rectangle");
        Shape circle = ShapeFactory.getShape("circle");
        Shape square = ShapeFactory.getShape("square");

        rectangle.Draw();
        circle.Draw();
        square.Draw();
    }
}
