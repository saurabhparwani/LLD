package practice.desginpaterns.bridge;

public class Main {
    public static void main(String[] args){
        Shape redrectangle = new Rectangle(new Red());
        Shape bluerectangle = new Rectangle(new Blue());

        redrectangle.fillShape();
        bluerectangle.fillShape();
    }

}
