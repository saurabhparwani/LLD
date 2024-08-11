package practice.desginpaterns.bridge;

public abstract class Shape {
    Color color;

    public Shape(Color color){
        this.color = color;
    }
    public void fillShape(){
        this.color.applyColor();
    }
}
