package lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private Map<Integer, DLinkNode> cache;
    private int size;
    private int capacity;
    DLinkNode head,tail;

    public LRUCache(int capacity) {
        cache = new HashMap<>();
        this.capacity = capacity;
        this.size = 0;
        head = new DLinkNode();
        tail = new DLinkNode();

        head.next = tail;
        tail.prev = head;

    }

    private void addNode(DLinkNode node) {
        /**
         * Always add the new node right after head.
         */
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkNode node){
        /**
         * Remove an existing node from the linked list.
         */
        DLinkNode prev = node.prev;
        DLinkNode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void moveToHead(DLinkNode node){
        removeNode(node);
        addNode(node);
    }

    private DLinkNode poptail(){
        DLinkNode removedNode = tail.prev;
        removeNode(removedNode);
        return removedNode;
    }

    public int get(int key) {
        DLinkNode node = cache.get(key);
        if (node == null) return -1;
        moveToHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        DLinkNode dLinkNode = cache.get(key);
        if(dLinkNode==null){
            DLinkNode node = new DLinkNode();
            node.key= key;
            node.value = value;
            cache.put(key,node);
            addNode(node);
            size++;

            if (size>capacity){
                DLinkNode tail = poptail();
                cache.remove(tail.key);
                size--;
            }

        }else {
            dLinkNode.value = value;
            moveToHead(dLinkNode);
        }
    }
}

class DLinkNode {
    DLinkNode prev, next;
    int key;
    int value;
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */