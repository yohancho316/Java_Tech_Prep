package LeetCode;

import java.util.Stack;

public class LC_143_1 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode pointer = head;
        int size = 0;
        while(pointer != null) {
            stack.push(pointer);
            pointer = pointer.next;
            ++size;
        }

        ListNode next = null;
        ListNode top = null;

        for(int i = 0; i < (size / 2); i++) {
            top = stack.pop();
            next = head.next;

            head.next = top;
            top.next = next;
            head = next;
        }

        if(size % 2 != 0) {
            head.next = null;
        } else top.next = null;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        ListNode head = n1;
        reorderList(n1);

        System.out.println("After: ");
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
