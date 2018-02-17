package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {

    public static void main(String[] args) {
        StackInternal<Integer> stack = new StackInternal<>(3);
        stack.push(3);
        stack.push(98);
        stack.push(31);
        stack.push(92);
        stack.push(5);
        stack.push(100);
        stack.push(3);
        stack.push(98);
        stack.push(31);
        stack.push(92);
        stack.push(5);
        stack.push(100);
        stack.push(22);
        for (Stack<Integer> stack1 : stack.stacks) {
            System.out.println(stack1);
        }

    }
}


class StackInternal<T> {
    ArrayList<Stack<T>> stacks;
    private int capacity;

    public StackInternal(int capacity){
        this.capacity = capacity;
        stacks = new ArrayList<>();
        Stack<T> stack = new Stack<T>();
        stacks.add(stack);
    }

    public void push(T item){
        Stack<T> lastStack = stacks.get(stacks.size()-1);
        if (lastStack.size() == capacity){
            Stack<T> stack = new Stack<T>();
            stacks.add(stack);
            lastStack = stack;
        }
        lastStack.push(item);
    }

    public T pop(){
        Stack<T> lastStack = stacks.get(stacks.size()-1);
        T item = lastStack.pop();
        if(lastStack.isEmpty()){
            stacks.remove(lastStack);
        }
        return item;
    }

    public T peek(){
        Stack<T> lastStack = stacks.get(stacks.size()-1);
        return lastStack.peek();
    }
}