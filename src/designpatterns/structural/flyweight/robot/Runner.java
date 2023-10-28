package designpatterns.structural.flyweight.robot;
/* Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between
multiple objects instead of keeping all of the data in each object.
 */

public class Runner {
    public static void main(String args[]){

        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1,2);

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10,30);

        IRobot roboDog1 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog1.display(2,9);

        IRobot roboDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog2.display(11,19);

    }

}
