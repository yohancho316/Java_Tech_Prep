package LeetCode;

public class MinStack_1 {

    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode stack;
    public ListNode minStack;

    public MinStack_1() {
        this.stack = null;
        this.minStack = null;
    }

    public void push(int val) {
        ListNode node1 = new ListNode(val);
        ListNode node2 = new ListNode(val);

        node1.next = stack;
        node2.next = minStack;
        stack = node1;
        minStack = node2;

        if(minStack.next != null && minStack.val >= minStack.next.val) {
            minStack.val = minStack.next.val;
        }
    }

    public void print() {
        ListNode stackPtr = stack;
        ListNode minPtr = minStack;

        System.out.println("Printing Stack:");
        while(stackPtr != null) {
            System.out.println(stackPtr.val);
            stackPtr = stackPtr.next;
        }
        System.out.println("\nPrinting MaxStack:");
        while(minPtr != null) {
            System.out.println(minPtr.val);
            minPtr = minPtr.next;
        }
    }

    public int top() {
        return this.stack.val;
    }

    public void pop() {
        this.stack = this.stack.next;
        this.minStack = this.minStack.next;
    }

    public int getMin() {

        return minStack.val;
    }

    public static void main(String[] args) {

        MinStack_1 MinStack = new MinStack_1();
        MinStack.push(-100);
        MinStack.push(20);
        MinStack.push(-30);

        System.out.println(MinStack.getMin());


        MinStack.pop();
        System.out.println(MinStack.top());



    }
}
