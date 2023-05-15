/*
URL: https://leetcode.com/problems/reverse-linked-list/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
 */


package LeetCode;

public class ReverseLinkedList_2 {

    public static class ListNode {

        // Member Attributes
        public int val;
        public ListNode next;

        // Default Constructor
        public ListNode() {}

        // Overloaded Constructor
        public ListNode(int _val) {
            this.val = _val;
            this.next = null;
        }

        public ListNode(int _val, ListNode _next) {
            this.val = _val;
            this.next = _next;
        }
    }

    public static ListNode reverseList(ListNode head) {

        // Local Declarations
        ListNode previous = null;
        ListNode current = head;

        // Check for Empty List
        if(head == null) {
            return null;
        }

        while(current != null) {
            ListNode temp_next = current.next;
            current.next = previous;
            previous = current;
            current = temp_next;
        }

        return previous;
    }

    public static void main(String[] args) {
        ListNode empty_node = null;
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        ListNode head = reverseList(empty_node);
        while(head != null) {
            System.out.println(head.val + "\t");
            head = head.next;
        }
    }
}
