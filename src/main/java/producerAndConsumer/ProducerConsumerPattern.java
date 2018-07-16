package producerAndConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by lenovo on  七月
 */
public class ProducerConsumerPattern {
    public static void main(String[] args) {
        BlockingQueue blockingQueue=new LinkedBlockingQueue();
        Thread prodThread=new Thread(new Producer(blockingQueue));
        Thread consThread=new Thread(new Consumer(blockingQueue));
        prodThread.start();
        consThread.start();
    }
}
