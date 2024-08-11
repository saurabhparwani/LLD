package practice.desginpaterns.proxy;

public class RealInternet implements Internet{
    @Override
    public void connect(String url) {
        System.out.println(String.format("Accessing URL : %s",url));
    }
}
