package queue;

import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.toString());
        queue.remove();
        System.out.println(queue.toString());

        NodeQueue queue1 = new NodeQueue();
        queue1.insert(1);
        queue1.insert(2);
        queue1.print();
        queue1.remove();
        queue1.print();
    }
}
