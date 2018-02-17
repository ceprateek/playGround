package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by prategar on 5/18/17.
 */
public class Runner {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished");
    }
}


class Producer implements Runnable{
    BlockingQueue<Integer> queue;
    Integer item = new Integer(0);
    int itemsProduced = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void produce() {
        if (queue.remainingCapacity() > 0) {
            System.out.println("Producing: " + item);
            queue.add(item++);
            itemsProduced++;
        }
    }

    @Override
    public void run() {
        while (itemsProduced<100)
            produce();
        System.out.println("Producer Finished");
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
        System.out.println("Consuming : " + item);
        return item;
    }

    @Override
    public void run() {
        while (itemsConsumed<100)
            consume();
        System.out.println("Consumer Finished");
    }
}