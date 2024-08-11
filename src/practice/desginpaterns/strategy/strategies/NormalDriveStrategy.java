package practice.desginpaterns.strategy.strategies;

public class NormalDriveStrategy implements Drivestrategy{
    @Override
    public void drive() {
        System.out.println("Normal Driving strategy");
    }
}
