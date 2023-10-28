package designpatterns.structural.bridge;

import designpatterns.structural.facade.Shape;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("red.");
    }
}
