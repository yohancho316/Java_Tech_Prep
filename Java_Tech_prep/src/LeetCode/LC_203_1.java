package LeetCode;

public class LC_203_1 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode tail = null;
        ListNode prev = null;

        while(head.val == val) {
            head = head.next;
        }

        if(head == null || head.next == null) return head;
        tail = head.next;
        prev = head;

        while(tail != null) {
            if(tail.val != val) {
                prev.next = tail;
                tail = tail.next;
                prev = prev.next;
            } else {
                tail = tail.next;
            }
        }

        prev.next = tail;
        return head;
    }

    public static void main(String[] args) {

    }
}
