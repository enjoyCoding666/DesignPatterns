package producerAndConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by lenovo on  七月
 */
public class Consumer implements Runnable {
    private final BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
      while (true) {
          try {
              System.out.println("Consumerd:"+blockingQueue.take());
          } catch (InterruptedException e) {
              Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, e);          }
      }
    }
}
