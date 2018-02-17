package stacks;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

public class NodeStack {
    Node head;

    public void push(int data){
        Node n = new Node(data);
        if (head==null) {
            head = n;
            return;
        }
        n.next=head;
        head = n;
    }

    public int pop(){
        if (head==null){
            throw new RuntimeException("Empty");
        }
        int out = head.data;
        head = head.next;
        return out;
    }

    public boolean isEmpty(){
        if (head==null)
            return true;
        return false;
    }

    public void print(){
        if (isEmpty())
            return;
        Node runner = head;
        while (runner!=null) {
            System.out.print("  " + runner.data);
            runner = runner.next;
        }
        System.out.println();
    }
}
