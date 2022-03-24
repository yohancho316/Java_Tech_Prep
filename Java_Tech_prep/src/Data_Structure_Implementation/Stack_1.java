package Data_Structure_Implementation;

public class Stack_1 {

    private int size;
    private Node top;

    public class Node {
        private int data;
        private Node next;

        public Node(int _data) {
            this.data = _data;
            this.next = null;
        }
    }

    public Stack_1() {
        this.size = 0;
        this.top = null;
    }

    public boolean isEmpty() {
        if(this.size == 0 && this.top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int _data) {
        Node temp = new Node(_data);

        if(this.isEmpty()) {
            this.top = temp;
        } else {
            temp.next = top;
            this.top = temp;
        }
        this.size += 1;
    }

    public int pop() {
        if(this.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            Node temp = this.top;
            this.top = this.top.next;
            this.size -= 1;
            return temp.data;
        }
    }

    public int peek() {
        if(this.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return this.top.data;
        }
    }

    public boolean search(int target) {
        if(this.isEmpty()) {
            return false;
        } else {
            Node temp = this.top;
            while(temp.data != target) {
                temp = temp.next;
            }
            if(temp == null) {
                return false;
            } else {
                return true;
            }
        }
    }

    public void clear() {
        this.top = null;
        this.size = 0;
    }

    public void print() {
        if(this.isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            Node current = this.top;
            while(current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.print("NULL\n");
            System.out.println("There are " + this.size + " objects on the stack.\n");
        }
    }

    public static void main(String[] args) {

        // Instantiate the Stack Collection
        Stack_1 stack = new Stack_1();

        // Push Node Objects on the Stack
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        // Print the Stack
        stack.print();

        // Search if a Node has the Value of 30 in the stack
        System.out.println("Is 30 in the stack: " + stack.search(30) + "\n");

        // Peek the value of the node on top of the stack
        System.out.println("Peek the value on top of the stack: " + stack.peek());

        // Pop the Top 3 Nodes of the top of the stack
        System.out.println("\nPop the Top 3 Nodes off the Stack:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();

        // Print the Stack
        stack.print();

        // Clear the Stack
        stack.clear();

        // Print the Stack
        stack.print();
    }

}


/*
- empty *
- push *
- pop *
- peek *
- search *
- clear *
- print *

 */
