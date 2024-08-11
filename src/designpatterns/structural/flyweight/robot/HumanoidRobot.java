package designpatterns.structural.flyweight.robot;

import lombok.Getter;

@Getter
public class HumanoidRobot implements IRobot {
    private String type;
    private Sprites body; //small 2d bitmap (graphic element)
    HumanoidRobot(String type, Sprites body){
        this.type = type;
        this.body = body;
    }
    @Override
    public void display(int x, int y) {
        //use the humanoid sprites object
        // and X and Y coordinate to render the image.
    }
}


