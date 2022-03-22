package LeetCode;

public class MiddleOfTheLinkedList_1 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        if(head.next == null) {
            return head;
        } else if(head.next.next == null) {
            return head.next;
        } else if(head.next.next == null) {
            return head.next;
        } else {
            ListNode slow = head;
            ListNode fast = head.next;

            while((fast.next != null) && (fast.next.next != null)) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(10, new ListNode(20, new ListNode(30, new ListNode(40, new ListNode(50, new ListNode(60, new ListNode(70)))))));
        ListNode temp = middleNode(n1);
        System.out.println(temp.val);
    }
}
