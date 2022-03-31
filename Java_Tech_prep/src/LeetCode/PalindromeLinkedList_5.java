package LeetCode;

import java.awt.peer.ListPeer;

public class PalindromeLinkedList_5 {

    public static boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next != null) {
            slow = slow.next;
        }

        ListNode reverse = null;
        while(slow != null) {
            ListNode next = slow.next;
            slow.next = reverse;
            reverse = slow;
            slow = next;
        }

        while(reverse != null) {
            if(reverse.val != head.val) {
                return false;
            } else {
                reverse = reverse.next;
                head = head.next;
            }
        }

        return true;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int _val) {
            this.val = _val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n5 = new ListNode(1);
        ListNode n6 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n5;
        n5.next = n6;
        n6.next = null;

        System.out.println("Is Palindrome: " + isPalindrome(n1));

    }
}
