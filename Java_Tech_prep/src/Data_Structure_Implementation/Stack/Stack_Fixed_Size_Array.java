package Data_Structure_Implementation.Stack;
import sun.invoke.empty.Empty;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack_Fixed_Size_Array {

    // Member Attributes 
    private int[] stack;
    private int current_index;
    private int size;

    // Overloaded Constructor
    public Stack_Fixed_Size_Array(int _size) {
        this.stack = new int[_size];
        this.size = _size;
        this.current_index = -1;
    }

    // push() Definition
    public void push(int val) {
        if(this.current_index >= this.size) {
            System.out.println("Stack Overflow");
            throw new StackOverflowError();
        } else {
            this.stack[this.current_index + 1] = val;
            this.current_index += 1;
        }
    }

    // pop() Definition
    public int pop() {
        if(current_index == -1) {
            System.out.println("Stack is Empty");
            throw new EmptyStackException();
        } else {
            int top_val = this.stack[this.current_index];
            this.current_index -= 1;
            return top_val;
        }
    }

    // peek() Definition
    public int peek() {
        if(this.isEmpty()) {
            System.out.println("Stack is Empty");
            throw new EmptyStackException();
        } else {
            return this.stack[this.current_index];
        }
    }

    // isEmpty() Definition
    public boolean isEmpty() {
        if(this.current_index == -1) {
            return true;
        } else {
            return false;
        }
    }

    // getSize() Definition
    public int getSize() {
        return this.size;
    }

    // search() Definition
    public int search(int val) {

        if(this.isEmpty()) {
            System.out.println("Stack is Empty!");
            throw new EmptyStackException();
        }

        for(int i = 0; i < this.stack.length; i++) {
            if(this.stack[i] == val) {
                return i;
            }
        }

        throw new NoSuchElementException();
    }

    // toString() Definition
    public String toString() {
        String stack_list = "";
        if(this.isEmpty()) {
            return stack_list;
        } else {
            for(int i = 0; i <= this.current_index; i++) {
                if(i < this.stack.length - 1) {
                    stack_list += this.stack[i] + " ";
                } else {
                    stack_list += this.stack[i];
                }
            }
        }
        return stack_list;
    }

    // Sort Stack Method Definition - Bubble Sort | O(N^2)
    public void sortStack() {
        if(this.isEmpty()) {
            System.out.println("Stack is Empty!");
            throw new EmptyStackException();
        }

        for(int i = 0; i < this.stack.length; i++) {
            for(int j = 1; j < (this.stack.length - i); j++) {
                if(this.stack[j - 1] > this.stack[j]) {
                    int temp = this.stack[j - 1];
                    this.stack[j - 1] = this.stack[j];
                    this.stack[j] = temp;
                }
            }
        }
    }

}
