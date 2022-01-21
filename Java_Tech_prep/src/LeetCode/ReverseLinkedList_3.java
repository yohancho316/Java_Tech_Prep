package LeetCode;

public class ReverseLinkedList_3 {

    static class ListNode {

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

        if(head == null) return null;

        while(current != null) {
            ListNode temp_next = current.next;
            current.next = previous;
            previous = current;
            current = temp_next;
        }

        return previous;
    }

    public static void main(String[] args) {

    }
}
