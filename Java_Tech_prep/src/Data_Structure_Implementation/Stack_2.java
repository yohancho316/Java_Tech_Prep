package Data_Structure_Implementation;

public class Stack_2 {

    private ListNode top;
    private int size;

    public Stack_2() {
        this.top = null;
        this.size = 0;
    }

    public ListNode getTop() {
        return this.top;
    }

    public int getSize() {
        return this.size;
    }

    public void setTop(ListNode node) {
        this.top = node;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return this.size == 0 && this.top == null;
    }

    public void push(int _val) {
        ListNode node = new ListNode(_val);
        node.next = this.top;
        this.top = node;
        this.size += this.getSize() + 1;
    }

    public int pop() {
        if(this.isEmpty()) {
            return -1;
        } else {
            int val = this.top.val;
            this.top = this.top.next;
            this.size -= 1;
            return val;
        }
    }

    public int peek() {
        if(this.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return this.top.val;
    }

    public ListNode search(int target) {
        ListNode current = this.top;
        while(current.val != target) {
            current = current.next;
        }
        return current;
    }

    public void clear() {
        this.top = null;
        this.size = 0;
    }

    public void print() {
        ListNode current = this.top;
        if(this.isEmpty()) {
            System.out.println("Linked List is Empty!");
        } else {
            while(current != null) {
                System.out.print(current.val + " --> ");
                current = current.next;
            }
            System.out.print("NULL");
        }
    }

    public class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int _val) {
            this.val = _val;
            this.next = null;
        }

        public void setVal(int _val) {
            this.val = _val;
        }

        public void setNext(ListNode _next) {
            this.next = _next;
        }

        public int getVal() {
            return this.val;
        }

        public ListNode getNext() {
            return this.next;
        }
    }

    public static void main(String[] args) {
        Stack_2 stack = new Stack_2();

        stack.push(30);
        stack.push(20);
        stack.push(10);

        stack.print();

        ListNode target = stack.search(20);
        System.out.println("\nTarget Found Val: " + target.val);

        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



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
