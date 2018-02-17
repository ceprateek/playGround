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

        Stack<Integer> jstack = new Stack<Integer>();
        jstack.push(1);
        jstack.push(2);
        jstack.push(3);

        System.out.println(jstack);

        jstack.pop();
        System.out.println(jstack);
        jstack.pop();
        jstack.pop();
        jstack.pop();




    }
}
