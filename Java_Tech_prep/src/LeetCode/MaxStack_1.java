package LeetCode;

import java.util.Stack;

public class MaxStack_1 {

    public Stack<Integer> stack;
    public Stack<Integer> maxStack;

    public MaxStack_1() {
        stack = new Stack<Integer>();
        maxStack = new Stack<Integer>();
    }

    public void push(int x) {
        int max = maxStack.isEmpty() ? x : maxStack.peek();
        maxStack.push(max > x ? max : x);
        stack.push(x);
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int max = this.peekMax();
        Stack<Integer> buffer = new Stack<Integer>();
        while(this.top() != max) {
            buffer.push(pop());
        }
        pop();
        while(!buffer.isEmpty()) {
            push(buffer.pop());
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
