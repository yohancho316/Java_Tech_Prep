package LeetCode;

public class LinkedListCycle_2 {

    public static class ListNode {

        // Attributes
        public int val;
        public ListNode next;

        // Overloaded Constructor
        public ListNode(int _val) {
            this.val = _val;
            this.next = null;
        }

    }

    public static boolean hasCycle(ListNode head) {

        // Local Declarations
        ListNode slow = head;
        ListNode fast = head;

        // Check if Head or Head.next is Null
        if((head == null) || (head.next == null)) {
            return false;
        }

        // Iterate through LinkedList
        while((fast != null) && (fast.next != null)) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(20);
        ListNode l3 = new ListNode(30);
        ListNode l4 = new ListNode(40);
        ListNode l5 = new ListNode(50);
        ListNode l6 = new ListNode(60);
        ListNode l7 = new ListNode(70);
        ListNode l8 = new ListNode(80);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l4;

        System.out.println(hasCycle(l1));
    }
}
