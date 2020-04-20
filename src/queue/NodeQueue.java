package queue;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}


public class NodeQueue {

    Node first;
    Node last;

    public void insert(int data){
        Node n = new Node(data);
        if (first==null){
            first=n;
            last=n;
            return;
        }
        last.next=n;
        last=n;
    }

    public int remove(){
        if (first==null){
            throw new RuntimeException("Empty");
        }
        int out = first.data;
        first = first.next;
        return out;
    }

    public void print(){
        Node runner = first;
        System.out.print("[");
        while (runner!=null){
            System.out.print("," + runner.data);
            runner = runner.next;
        }
        System.out.print("]");
        System.out.println();
    }
}
