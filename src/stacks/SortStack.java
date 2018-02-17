package stacks;

import java.util.Stack;

/**
 * Created by prategar on 5/8/17.
 */
public class SortStack {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(98);
        stack.push(31);
        stack.push(92);
        stack.push(5);
        stack.push(100);
        stack = sortStack(stack);
        System.out.println(stack);
    }

    public static Stack sortStack(Stack<Integer> stack){
        Stack<Integer> bufferStack = new Stack<>();
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            System.out.println("Element taken out: "+tmp);
            while(!bufferStack.isEmpty() && bufferStack.peek() > tmp) {
                stack.push(bufferStack.pop());
            }
            bufferStack.push(tmp);
            System.out.println("input: "+stack);
            System.out.println("tmpStack: "+bufferStack);
        }
        return bufferStack;
    }

}
