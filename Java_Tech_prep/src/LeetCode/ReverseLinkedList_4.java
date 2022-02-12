package LeetCode;

public class ReverseLinkedList_4 {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {};

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static ListNode reverseList(ListNode head) {

        // Local Declarations
        ListNode original = head;
        ListNode previous = null;
        ListNode current = head;

        // Check for Empty LinkedList Argument
        if(head == null) return head;

        // Iterate through LinkedList
        while(current != null) {
            ListNode temp_next = current.next;
            current.next = previous;
            previous = current;
            current = temp_next;
        }

        return previous;
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

        System.out.println(reverseList(n1).val);
    }
}
