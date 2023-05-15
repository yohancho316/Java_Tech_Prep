package LeetCode;

public class LC_82_1 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode start = new ListNode(100);
        start.next = head;

        ListNode tail = start;

        while(head != null) {

            if((head.next != null) && (head.val == head.next.val)) {

                while((head.next != null) && (head.val == head.next.val)) {
                    head = head.next;
                }

                tail.next = head.next;
            } else {
                tail = tail.next;
            }
            head = head.next;
        }
        
        return start.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(1);
        ListNode a5 = new ListNode(1);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;

        ListNode head = deleteDuplicates(a1);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
