package LeetCode;
import java.util.Stack;

class ListNode {
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


public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while(current != null) {
            ListNode next_temp = current.next;
            current.next = previous;
            previous = current;
            current = next_temp;
        }

        return previous;
    }

    public static void main(String[] args) {

    }
}
