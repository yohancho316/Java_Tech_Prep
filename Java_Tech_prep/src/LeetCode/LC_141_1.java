package LeetCode;

public class LC_141_1 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        if(head.next != null && head.next.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while((fast.next != null) && (fast.next.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
