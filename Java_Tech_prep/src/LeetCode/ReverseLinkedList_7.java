package LeetCode;

public class ReverseLinkedList_7 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode new_head = null;
        while(head != null) {
            ListNode next = head.next;
            if(new_head == null) {
                new_head = head;
                new_head.next = null;
                head = next;
            } else {
                head.next = new_head;
                new_head = head;
                head = next;
            }
        }
        return new_head;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(20);
        ListNode a3 = new ListNode(30);
        ListNode a4 = new ListNode(40);
        ListNode a5 = new ListNode(50);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;

        ListNode head = reverseList(a1);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
