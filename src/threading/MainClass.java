package threading;

import java.util.concurrent.Semaphore;

public class MainClass {
    public static void main(String[] args) {
        Semaphore hello = new Semaphore(1);
        Semaphore world = new Semaphore(0);

        Thread h = new Thread(new HelloThread(hello,world));
        Thread w = new Thread(new WorldThread(hello,world));

        h.start();
        w.start();
    }

}

class HelloThread implements Runnable{
    Semaphore hello;
    Semaphore world;

    public HelloThread(Semaphore hello, Semaphore world) {
        this.hello = hello;
        this.world = world;
    }

    @Override
    public void run() {
        try {
            for (int i=0;i<5;i++) {
                hello.acquire();
                System.out.print("Hello ");
                world.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WorldThread implements Runnable{
    Semaphore hello;
    Semaphore world;

    public WorldThread(Semaphore hello, Semaphore world) {
        this.hello = hello;
        this.world = world;
    }

    @Override
    public void run() {
        try {
            for (int i=0;i<5;i++) {
                world.acquire();
                System.out.println("World");
                hello.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}