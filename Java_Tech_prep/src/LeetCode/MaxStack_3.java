package LeetCode;

public class MaxStack_3 {

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

    public MaxStack_3() {
        stack = null;
        maxStack = null;
    }

    public void push(int x) {

        ListNode temp = new ListNode(x);
        ListNode temp2 = new ListNode(x);
        temp.next = stack;
        stack = temp;

        temp2.next = maxStack;
        maxStack = temp2;
        if(maxStack.next == null || maxStack.val >= maxStack.next.val) {
            return;
        } else {
            maxStack.val = maxStack.next.val;
        }
    }

    public int pop() {
        int top = stack.val;
        stack = stack.next;
        maxStack = maxStack.next;
        return top;
    }

    public int top() {
        return stack.val;
    }

    public int peekMax() {
        return maxStack.val;
    }

    public int popMax() {

        int maxVal = maxStack.val;

        if(stack.val == maxVal) {
            return this.pop();
        }

        ListNode tempStack = null;

        while(stack.val != maxVal) {
            ListNode temp = new ListNode(pop());
            temp.next = tempStack;
            tempStack = temp;
        }

        pop();

        while(tempStack != null) {
            push(tempStack.val);
            tempStack = tempStack.next;
        }

        return maxVal;
    }



    public static void main(String[] args) {
        MaxStack_3 max = new MaxStack_3();
        max.push(50);
        max.push(30);
        max.push(5);
        max.push(1);
        max.push(40);
        max.push(100);

        System.out.println(max.popMax()); // 100
        System.out.println(max.top()); // 40
        System.out.println(max.peekMax()); // 50

        System.out.println();

        System.out.println(max.popMax()); // 50
        System.out.println(max.top()); // 40
        System.out.println(max.peekMax()); // 40



//        System.out.println(max.stack.val); // 100
//        System.out.println(max.maxStack.val);  // 100
//        System.out.println(max.top()); // 100
//        System.out.println(max.peekMax()); // 100
//
//        System.out.println();
//
//        System.out.println(max.pop()); // 100
//
//        System.out.println();
//
//        System.out.println(max.stack.val); // 40
//        System.out.println(max.maxStack.val); // 50
//        System.out.println(max.top()); // 40
//        System.out.println(max.peekMax()); // 50
    }
}
