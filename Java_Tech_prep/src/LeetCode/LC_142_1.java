package LeetCode;

public class LC_142_1 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        if((head == null) || (head.next == null) || (head.next.next == null)) return null;
        ListNode slow = head; ListNode fast = head;
        while((fast.next != null) && (fast.next.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(((fast == null) || (fast.next == null) || (fast.next.next == null))) return null;

        slow = head;
        while((slow != null) && (fast != null)) {
            slow = slow.next;
            fast = fast.next;
            if(slow == fast) return slow;
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
