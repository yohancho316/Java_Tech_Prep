package LeetCode;
import java.util.HashMap;

public class LinkedListCycle {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            this.val = x;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {

        // Local Declarations
        HashMap<ListNode, Boolean> map = new HashMap<>();

        // Check for Empty LinkedList
        if(head ==  null) return false;

        // Iterate through the LinkedList
        while(head != null) {
            if(!(map.containsKey(head))) {
                map.put(head, true);
                head = head.next;
            } else {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(20);
        ListNode l3 = new ListNode(30);
        ListNode l4 = new ListNode(40);
        ListNode l5 = new ListNode(50);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l1;

        System.out.println(hasCycle(l1));

    }
}
