package LeetCode;

public class RemoveLinkedListElements_2 {

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
        ListNode distinct = null;
        ListNode next = null;
        ListNode current = null;

        while(head != null) {
            if(head.val == val) {
                head = head.next;
            } else {
                next = head.next;
                if(distinct == null) {
                    distinct = head;
                    current = head;
                    head = next;
                } else {
                    current.next = head;
                    current = current.next;
                    head = next;
                }
            }
        }
        if(distinct != null) current.next = null;
        return distinct;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(10);
        ListNode n3 = new ListNode(20);
        ListNode n4 = new ListNode(30);
        ListNode n5 = new ListNode(10);
        ListNode n6 = new ListNode(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        ListNode head = removeElements(n1, 10);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }


    }
}
