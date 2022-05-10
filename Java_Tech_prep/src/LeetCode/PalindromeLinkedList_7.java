package LeetCode;

public class PalindromeLinkedList_7 {

    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode slow) {

        ListNode reverse = null;
        ListNode next = null;

        while(slow != null) {

            next = slow.next;
            slow.next = reverse;
            reverse = slow;
            slow = next;
        }

        return reverse;
    }

    public static boolean isPalindrome(ListNode head) {

        if(head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(slow.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next != null) {
            slow = slow.next;
        }

        ListNode reverse = reverseList(slow);

        while(reverse != null) {
            System.out.println(reverse.val);
            reverse = reverse.next;
        }

        while(reverse != null) {
            if(reverse.val != head.val) return false;

            reverse = reverse.next;
            head = head.next;

        }

        return true;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(0);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        System.out.println(isPalindrome(n1));

    }
}
