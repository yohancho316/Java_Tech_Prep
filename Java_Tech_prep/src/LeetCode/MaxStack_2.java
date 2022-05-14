package LeetCode;

public class MaxStack_2 {

    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode stack;
    public ListNode maxStack;
    public int size;

    public MaxStack_2() {
        this.stack = null;
        this.maxStack = null;
        this.size = 0;
    }

    public void push(int val) {

        this.size += 1;
        ListNode temp = new ListNode(val);
        temp.next = this.stack;
        this.stack = temp;

        if(this.maxStack == null) {
            temp.next = this.maxStack;
            this.maxStack = temp;
        } else {
            if(val > this.maxStack.val) {
                temp.next = this.maxStack;
                this.maxStack = temp;
            } else {
                ListNode current = new ListNode(this.maxStack.val);
                current.next = this.maxStack;
                this.maxStack = current;
            }
        }
    }

    public int pop() {
        int returnVal = this.stack.val;
        this.stack = this.stack.next;
        this.maxStack = this.maxStack.next;
        this.size -= 1;
        return returnVal;
    }

    public int top() {
        return this.stack.val;
    }

    public int peekMax() {
        return this.maxStack.val;
    }

    public int popMax() {

        this.size -= 1;
        ListNode tempStack = null;
        int maxVal = this.maxStack.val;

        while(this.stack.val != maxVal) {
            ListNode temp = new ListNode(this.pop());
            temp.next = tempStack;
            tempStack = temp;
        }

        this.pop();

        while(tempStack != null) {
            this.push(tempStack.val);
            tempStack = tempStack.next;
        }

        return maxVal;
    }

    public static void main(String[] args) {

        MaxStack_2 obj = new MaxStack_2();
        obj.push(5);
        obj.push(1);
        obj.push(6);

        System.out.println(obj.popMax());
        System.out.println(obj.popMax());
        System.out.println(obj.size);

    }
}
