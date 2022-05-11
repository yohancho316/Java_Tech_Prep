package LeetCode;

import sun.jvm.hotspot.opto.PhaseCFG;

public class LinkedListCycle_4 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {

        // check for empty list
        if(head == null) return false;

        // check for single node list
        if(head.next == null) return false;


        // Declare & instantiate two ListNode objects that reference head
        ListNode slow = head;
        ListNode fast = head.next;

        // iterate through each node in the list
        while(fast.next != null && fast.next.next != null) {

            if(slow == fast) {
                return true;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);
        ListNode n4 = new ListNode(40);
        ListNode n5 = new ListNode(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;

        System.out.println(hasCycle(n1));



    }
}
