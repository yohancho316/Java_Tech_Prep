package LeetCode;

public class LinkedListCycle_5 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(20);
        ListNode a3 = new ListNode(30);
        ListNode a4 = new ListNode(40);
        ListNode a5 = new ListNode(50);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a1;

        ListNode b1 = new ListNode(10);
        ListNode b2 = new ListNode(20);
        ListNode b3 = new ListNode(30);

        b1.next = b2;
        b2.next = b3;
        b3.next = b1;

        ListNode c1 = new ListNode(10);
        ListNode c2 = new ListNode(20);
        ListNode c3 = new ListNode(30);

        c1.next = c2;
        c2.next = c3;
        c3.next = null;

        System.out.println(hasCycle(c1));

    }
}
