package LeetCode;

public class PalindromeLinkedList_6 {

    public static boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next != null) {
            slow = slow.next;
        }

        ListNode reverse = null;

        while(slow != null) {
            ListNode next = slow.next;
            slow.next = reverse;
            reverse = slow;
            slow = next;
        }

        while(reverse != null) {
            if(reverse.val != head.val) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }

        return true;
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
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(10);
        ListNode l3 = new ListNode(20);
        ListNode l4 = new ListNode(10);
        ListNode l5 = new ListNode(10);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        System.out.println("is palindrome: " + isPalindrome(l1));
    }
}
