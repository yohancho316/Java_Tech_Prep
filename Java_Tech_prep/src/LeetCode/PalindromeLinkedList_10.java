package LeetCode;

public class PalindromeLinkedList_10 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean isPalindrome(ListNode head) {

        if(head == null) return false;
        if(head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;
        ListNode reverse = null;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast.next != null) slow = slow.next;

        while(slow != null) {
            ListNode next = slow.next;
            slow.next = reverse;
            reverse = slow;
            slow = next;
        }

        while(reverse != null) {
            if((head != null && reverse != null) && (reverse.val == head.val)) {
                head = head.next;
                reverse = reverse.next;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(10);
        ListNode n3 = new ListNode(20);
        ListNode n4 = new ListNode(20);
        ListNode n5 = new ListNode(10);
        ListNode n6 = new ListNode(20);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        System.out.println(isPalindrome(n1));

    }
}
