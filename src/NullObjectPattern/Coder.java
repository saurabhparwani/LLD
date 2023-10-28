package NullObjectPattern;

public class Coder implements Emp{
    private String name;
    public Coder(String name)
    {
        this.name = name;
    }
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
