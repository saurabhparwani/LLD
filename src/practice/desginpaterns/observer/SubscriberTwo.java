package practice.desginpaterns.observer;

public class SubscriberTwo implements Observer{
    @Override
    public void update(Message message) {
        System.out.println(String.format("Subscriber two process message %s",message.getMessage()));
    }
}
