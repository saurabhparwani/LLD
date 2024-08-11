package practice.desginpaterns.proxy;

import lombok.SneakyThrows;

import java.util.ArrayList;

public class ProxyInternet implements Internet{

    private Internet realinternet;
    private ArrayList<String> bannesSites = new ArrayList<>();

    public ProxyInternet(){
        realinternet = new RealInternet();
        bannesSites.add("facebook.com");
        bannesSites.add("instagram.com");
        bannesSites.add("twitter");
    }
    public void connect(String url) {
        if(!bannesSites.contains(url))
            realinternet.connect(url);
        else
            System.out.println("Access denied");
    }
}
