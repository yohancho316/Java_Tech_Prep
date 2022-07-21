package LeetCode;

public class PalindromeLinkedList_9 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean isPalindrome(ListNode head) {

        if(head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast.next != null) slow = slow.next;

        ListNode reverse = null;
        ListNode next = null;

        while(slow != null) {
            next = slow.next;
            slow.next = reverse;
            reverse = slow;
            slow = next;
        }

        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }

//        while(reverse != null) {
//            if(reverse.val != head.val) return false;
//            reverse = reverse.next;
//            head = head.next;
//        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(1);


        a1.next = a2;
        a2.next = a3;
        a3.next = a4;


        System.out.println(isPalindrome(a1));

    }

}
