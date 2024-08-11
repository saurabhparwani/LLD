package designpatterns.behavioral.state;

public class Silent implements MobileAlertState {
    @Override public void alert(AlertStateContext ctx)
    {
        System.out.println("Silent...");
    }
}
