package LeetCode;

public class ReverseLinkedList_6 {

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode reverse = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = reverse;
            reverse = current;
            current = next;
        }

        return reverse;
    }


    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int _val) {
            this.val = _val;
            this.next = null;
        }
        public ListNode(int _val, ListNode _next) {
            this.val = _val;
            this.next = _next;
        }
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
        n5.next = null;

        System.out.println("Before Reverse:");
        ListNode current = n1;
        while(current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.print("NULL\n\n");

        System.out.println("Before Reverse:");
        ListNode reverse = reverseList(n1);
        while(reverse != null) {
            System.out.print(reverse.val + " --> ");
            reverse = reverse.next;
        }
        System.out.print("NULL\n\n");

    }
}
