package practice.desginpaterns.observer;

public class SubscriberThree implements Observer{
    @Override
    public void update(Message message) {
        System.out.println(String.format("Subscriber three process message %s",message.getMessage()));
    }
}
