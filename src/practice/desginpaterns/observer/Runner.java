package practice.desginpaterns.observer;

public class Runner {
    public static void main(String []args){
        Observer sub1 = new SubscriberOne();
        Observer sub2 = new SubscriberTwo();
        Observer sub3 = new SubscriberThree();

        MessagePublisher publisher = new MessagePublisher();

        publisher.attach(sub2);
        publisher.attach(sub1);

        publisher.notifyUpdate(new Message(" Test message 1"));

        publisher.detach(sub1);
        publisher.attach(sub3);
        publisher.notifyUpdate(new Message(" Test message 2"));


    }
}
