package LeetCode;

public class LC_206_1 {

    public static class ListNode {

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

        if((head == null) || (head.next == null)) return head;
        ListNode reverse = null;

        while(head != null) {
            ListNode next = head.next;
            head.next = reverse;
            reverse = head;
            head = next;
        }

        return reverse;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ListNode head = node1;

        System.out.println("original");

        while(head != null) {
            System.out.print(head.val + "\t");
            head = head.next;
        }

        System.out.println();

        ListNode reverse = reverseList(node1);

        System.out.println("reversed");

        while(reverse != null) {
            System.out.print(reverse.val + "\t");
            reverse = reverse.next;
        }

    }


}
