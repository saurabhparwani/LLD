package practice.desginpaterns.bridge;

public class Blue implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying Blue Color");
    }
}
