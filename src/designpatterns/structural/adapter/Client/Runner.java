package designpatterns.structural.adapter.Client;
import designpatterns.structural.adapter.Adaptee.WeightMachineForBabies;
import designpatterns.structural.adapter.Adapter.WeightMachineAdapter;
import designpatterns.structural.adapter.Adapter.WeightMachineAdapterImpl;

/* Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate. */
public class Runner {
    public static void main(String args[]){
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }

}
