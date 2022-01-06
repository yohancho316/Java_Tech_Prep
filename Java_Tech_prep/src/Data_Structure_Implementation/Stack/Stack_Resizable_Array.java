package Data_Structure_Implementation.Stack;
import sun.invoke.empty.Empty;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack_Resizable_Array {

    // Member Attributes
    private int[] resizable_stack;
    private int size;
    private int current_index;

    // Overloaded Constructor
    public Stack_Resizable_Array(int _size) {
        this.size = _size;
        this.current_index = -1;
        this.resizable_stack = new int[_size];
    }

    // Push Method Definition
    public void push(int val) {
        if (this.current_index == this.resizable_stack.length) resize_stack(this.resizable_stack.length * 2);
        this.resizable_stack[this.current_index + 1] = val;
        this.current_index += 1;
    }

    // Peek Method Definition
    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty!");
            throw new EmptyStackException();
        } else {
            return this.resizable_stack[this.current_index];
        }
    }

    // Pop Method Definition
    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty!");
            throw new EmptyStackException();
        }

        int item = this.resizable_stack[this.current_index];
        this.current_index -= 1;
        if (this.current_index > 0 && this.current_index == this.resizable_stack.length / 4) {
            this.resize_stack(this.resizable_stack.length / 2);
        }
        return item;
    }

    // Resize Stack Method Definition
    public void resize_stack(int new_size) {
        int[] temp_stack = new int[new_size];
        for (int i = 0; i <= this.current_index; i++) {
            temp_stack[i] = resizable_stack[i];
        }
        this.resizable_stack = temp_stack;
        this.size = new_size;
    }

    // isEmpty Method Definition
    public boolean isEmpty() {
        if(this.current_index == -1) {
            return true;
        }
        return false;
    }

    // getSize Method Definition
    public int getSize() {
        return this.size;
    }

    // search Method Definition
    public int search(int val) {
        if(this.isEmpty()) {
            System.out.println("Stack is Empty!");
            throw new EmptyStackException();
        }
        for(int i = 0; i < this.resizable_stack.length; i++) {
            if(this.resizable_stack[i] == val) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    // toString Method Definition
    public String toString() {
        String stack_list = "";
        if(this.isEmpty()) {
            return stack_list;
        } else {
            for(int i = 0; i <= this.current_index; i++) {
                if(i < this.resizable_stack.length - 1) {
                    stack_list += this.resizable_stack[i] + " ";
                } else {
                    stack_list += this.resizable_stack[i];
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

        for(int i = 0; i < this.resizable_stack.length; i++) {
            for(int j = 1; j < (this.resizable_stack.length - i); j++) {
                if(this.resizable_stack[j - 1] > this.resizable_stack[j]) {
                    int temp = this.resizable_stack[j - 1];
                    this.resizable_stack[j - 1] = this.resizable_stack[j];
                    this.resizable_stack[j] = temp;
                }
            }
        }
    }

}
