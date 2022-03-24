package LeetCode;

public class LinkedListCycle_3 {

    public static class ListNode {
     public int val;
     public ListNode next;
     public ListNode(int x) {
         this.val = x;
         this.next = null;
     }
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while((fast.next != null) && (fast.next.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);
        ListNode n4 = new ListNode(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;

        System.out.println(hasCycle(n1));

    }
}
