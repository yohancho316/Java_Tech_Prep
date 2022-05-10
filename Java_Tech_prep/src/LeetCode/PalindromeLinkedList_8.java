package LeetCode;

public class PalindromeLinkedList_8 {

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

        // Check if only one node exists in the LL
        if(head.next == null) return true;

        // Declare two ListNode objects
        ListNode slow = head;
        ListNode fast = head;

        // Find the Middle Node in the LL
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next != null) {
            slow = slow.next;
        }

        // Reverse the LL from the Middle Node
        ListNode reverse = reverseList(slow);

        // Compare Node Values of Original & Reversed LL
        while(reverse != null) {
            if(head.val != reverse.val) {
                return false;
            }

            head = head.next;
            reverse = reverse.next;
        }

        return true;
    }


    public static void main(String[] args) {

        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);
        ListNode n4 = new ListNode(20);
        ListNode n5 = new ListNode(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println(isPalindrome(n1));

    }
}
