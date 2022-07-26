package LeetCode;

public class ReverseLinkedList_8 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode reverse = null;
        ListNode next = null;

        while(head != null) {
            next = head.next;
            head.next = reverse;
            reverse = head;
            head = next;
        }
        return reverse;
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

        ListNode reverse = reverseList(a1);
        while(reverse != null) {
            System.out.println(reverse.val);
            reverse = reverse.next;
        }

    }
}
