package practice.desginpaterns.Factory;

public class ShapeFactory {
    public  static Shape getShape(String shapetype){
        if(shapetype == null || shapetype.equalsIgnoreCase("")){
            System.out.println("Shape Type is not correct");
            return null;
        }
        if(shapetype.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        if(shapetype.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        if(shapetype.equalsIgnoreCase("SQUARE"))
            return new Square();

        return null;
    }
}
