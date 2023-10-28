package NullObjectPattern;

public class Runner {
    public static void main(String[] args){
        Emp emp1 = EmpData.getClient("Saurabh");
        Emp emp2 = EmpData.getClient("Sachin");
        Emp emp3 = EmpData.getClient("Rahul");
        Emp emp4 = EmpData.getClient("Rishabh");

        System.out.println(emp1.getName());
        System.out.println(emp2.getName());
        System.out.println(emp3.getName());
        System.out.println(emp4.getName());
    }
}
