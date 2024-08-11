package practice.desginpaterns.proxy;

public class Runnner {
    public static void main(String[] args){
        Internet internet = new ProxyInternet();
        internet.connect("quora.com");
        internet.connect("facebook.com");


    }
}
