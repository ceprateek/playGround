package stacks;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        NodeStack stack = new NodeStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
    }
}
