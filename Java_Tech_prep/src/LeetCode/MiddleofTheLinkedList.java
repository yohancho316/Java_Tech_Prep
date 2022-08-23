package LeetCode;

public class MiddleofTheLinkedList {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        if(fast.next == null || fast.next.next == null) return null;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next == null) return slow;
        return slow.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(20);
        ListNode a3 = new ListNode(30);
        ListNode a4 = new ListNode(40);
        ListNode a5 = new ListNode(50);
        ListNode a6 = new ListNode(60);


        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = null;

        ListNode target = middleNode(a1);
        System.out.println(target.val);

    }
}
