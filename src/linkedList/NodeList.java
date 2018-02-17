package linkedList;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

public class NodeList {
    Node head;
    Node tail;

    public void add(int data){
        Node node = new Node(data);
        if (isEmpty()){
            head = node;
            tail=node;
            return;
        }
        tail.next = node;
        tail = node;
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

    public void delete(int data){
        if (head.data == data){
            head = head.next;
            return;
        }
        Node n = head;
        while (n.next!=null){
            if (n.next.data == data){
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }

    }

    public void deleteDups(){
        List buffer = new ArrayList();
        Node n = head;
        while (n!=null){
            if (buffer.contains(n.data)){
                delete(n.data);
            }else {
                buffer.add(n.data);
            }
            n=n.next;
        }

    }
}


