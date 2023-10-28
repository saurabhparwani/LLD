package NullObjectPattern;

public class NoClient implements Emp{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available";
    }
}
