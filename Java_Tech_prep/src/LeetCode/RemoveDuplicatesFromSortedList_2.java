package LeetCode;

import java.util.List;

public class RemoveDuplicatesFromSortedList_2 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode distinctHead = null;
        ListNode current = null;

        while(head != null) {
            ListNode next = head.next;

            if(distinctHead == null) {
                head.next = distinctHead;
                distinctHead = head;
                current = distinctHead;
                current.next = null;
                head = next;
            } else if(current.val < head.val) {
                current.next = head;
                current = current.next;
                current.next = null;
                head = next;
            } else {
                head = head.next;
            }
        }

        return distinctHead;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(10);
        ListNode a3 = new ListNode(30);
        ListNode a4 = new ListNode(40);
        ListNode a5 = new ListNode(40);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;

        ListNode head = deleteDuplicates(a1);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
