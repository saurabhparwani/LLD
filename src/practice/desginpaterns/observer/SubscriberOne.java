package practice.desginpaterns.observer;

public class SubscriberOne implements Observer{
    @Override
    public void update(Message message) {
        System.out.println(String.format("Subscriber one process message %s",message.getMessage()));
    }
}
