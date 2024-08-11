package practice.desginpaterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{

    private List<Observer> subscriberList;

    public MessagePublisher() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.subscriberList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.subscriberList.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
        this.subscriberList.forEach(observer -> observer.update(message));
    }
}
