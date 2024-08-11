package practice.desginpaterns.builder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Runnner {
    public static void main(String[] args){
      Car car = Car.getBuilder()
              .withEngine("Engine")
              .withDoors(new String[]{"1","2","3","4"})
              .withFuelTank(new String[]{"F1","F2"})
              .withTyres(new String[]{"T1","T2","T3","T4"})
              .withspeakers(new String[]{"Speaker 1","Speaker 2"})
              .build();
    }
}
