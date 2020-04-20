package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by prategar on 5/18/17.
 */
public class Runner {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(producer);
        executorService.execute(producer);
        executorService.execute(consumer);
        //executorService.execute(consumer);

        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}


class Producer implements Runnable{
    BlockingQueue<Integer> queue;
    Integer item = new Integer(0);
    Lock lock = new ReentrantLock();
    int itemsProduced = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void produce() {
        if (queue.remainingCapacity() > 0) {
            lock.lock();
            System.out.println("Producing: " + item);
            queue.add(item++);
            itemsProduced++;
            lock.unlock();
        }
    }

    @Override
    public void run() {
        while (itemsProduced<100)
            produce();
        //System.out.println("Producer Finished");
    }
}

class Consumer implements Runnable{
    BlockingQueue<Integer> queue;
    int itemsConsumed = 0;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public Integer consume(){
        Integer item = null;
        try {
            item = queue.take();
            itemsConsumed++;
        } catch (InterruptedException e) {
            e.printStackTrace();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        //System.out.println("Consuming : " + item);
        return item;
    }

    @Override
    public void run() {
        while (itemsConsumed<100)
            consume();
        System.out.println("Consumer Finished");
    }
}