package practice.desginpaterns.facade;

public class Runner {
    public static void main(String[] args){
        ShapeMarker shapeMarker = new ShapeMarker();
        shapeMarker.drawCircle();
        shapeMarker.drawSquare();
        shapeMarker.drawRectangle();
    }
}
