package LeetCode;
import java.util.Stack;

public class PalindromeLinkedList_3 {

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

    public static boolean isPalindrome_Naive(ListNode head) {
        if(head.next == null) {
            return true;
        }

        String original = "";
        String reverse = "";
        int size = 0;
        ListNode current = head;
        Stack<ListNode> stack = new Stack<ListNode>();

        while(current != null) {
            original += current.val;
            stack.push(current);
            current = current.next;
            size += 1;
        }

        while(!stack.isEmpty()) {
            reverse += stack.pop().val;
        }

        System.out.println("original: " + original);
        System.out.println("reverse: " + reverse);

        if(original.equals(reverse)) return true;

        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println(isPalindrome_Naive(n1));

    }
}
