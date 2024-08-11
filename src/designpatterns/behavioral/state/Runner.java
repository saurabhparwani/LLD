package designpatterns.behavioral.state;

/**
 * State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.
 * It appears as if the object changed its class.
 * */
public class Runner {
    public static void main(String[] args)
    {
        AlertStateContext stateContext
                = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}
