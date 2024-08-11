package MultiThreading.messageQueue.pubSubQueue.public_interface;

import MultiThreading.messageQueue.pubSubQueue.model.Message;

public interface ISubscriber {
    String getId();
    void consume(Message message) throws InterruptedException;
}
