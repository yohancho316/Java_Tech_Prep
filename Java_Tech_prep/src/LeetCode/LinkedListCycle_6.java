package LeetCode;

public class LinkedListCycle_6 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while(slow.next != null && slow.next.next != null) {
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


        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        System.out.println(hasCycle(a1));
    }
}
