package LeetCode;

public class PalindromeLinkedList_4 {

    public static boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        else if(head.next.next == null && head.val == head.next.val) return true;
        else if(head.next.next == null && head.val != head.next.val) return false;

        ListNode slow = head;
        ListNode fast = head;
        ListNode reverse = null;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next != null) {
            slow = slow.next;
        }

        while(slow != null) {
            ListNode temp = slow.next;
            slow.next = reverse;
            reverse = slow;
            slow = temp;
        }

//        ListNode print = reverse;
//        System.out.println("Printing Reversed Half of LL:");
//        while(print != null) {
//            System.out.println(print.val + " --> ");
//            print = print.next;
//        }
//        System.out.println("NULL\n\n");


        while(reverse != null) {
            if(reverse.val == head.val) {
                reverse = reverse.next;
                head = head.next;
            } else {
                return false;
            }
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
        public ListNode(int _val, ListNode _next) {
            this.val = _val;
            this.next = _next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(10);
        ListNode n3 = new ListNode(30);
        ListNode n4 = new ListNode(30);
        ListNode n5 = new ListNode(10);
        ListNode n6 = new ListNode(10);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        System.out.println("Is Palindrome: " + isPalindrome(n1));

    }
}
