package LeetCode;

public class RemoveDuplicatesFromSortedList_3 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = head;
        ListNode next = head;

        while(next != null) {
            if(current.val == next.val) {
                next = next.next;
            } else {
                current.next = next;
                current = current.next;
                next = next.next;
            }
        }
        current.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(10);
        ListNode a3 = new ListNode(10);
        ListNode a4 = new ListNode(20);
        ListNode a5 = new ListNode(20);
        ListNode a6 = new ListNode(20);
        ListNode a7 = new ListNode(30);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;

        ListNode head = deleteDuplicates(a1);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
