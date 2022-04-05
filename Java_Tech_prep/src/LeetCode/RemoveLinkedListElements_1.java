package LeetCode;

public class RemoveLinkedListElements_1 {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode current = head;

        while(current != null && current.val == val) {
            current = current.next;
        }

        if(current == null || current.next == null) {
            return current;
        }

        ListNode previous = current;
        ListNode previous_head = current;
        current = current.next;

        while(current != null) {
            if(current.val != val) {
                previous.next = current;
                previous = previous.next;
                current = current.next;
            } else {
                current = current.next;
            }
        }

        if(previous.next != null && previous.next.val == val) {
            previous.next = null;
        }

        return previous_head;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int _val) {
            this.val = _val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        System.out.println("Before Parse:");

        ListNode current = n1;

        while(current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.print("NULL\n\n");


        System.out.println("After Parse:");
        current = removeElements(n1, 2);

        while(current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.print("NULL\n\n");
    }
}
