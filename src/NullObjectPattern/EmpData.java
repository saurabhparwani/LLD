package NullObjectPattern;

public class EmpData {
    public static final String[] names = {"Saurabh", "Sachin", "Rahul"};
    public static Emp getClient(String name)
    {
        for(String var : names){
            if(var.equalsIgnoreCase(name))
                return new Coder(name);
        }
        return new NoClient();
    }
}
