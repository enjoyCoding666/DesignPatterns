package producerAndConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by lenovo on  七月
 */
public class Producer implements  Runnable {
   private  final BlockingQueue sharedQueue;

    public Producer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Produced:"+i);
            try {
                sharedQueue.put(i);
            } catch (InterruptedException e) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE,null,e);
            }
        }
    }
}
