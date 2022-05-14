package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists_5 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<ListNode>();

        ListNode a = headA;
        ListNode b = headB;

        while(a != null) {
            set.add(a);
            a = a.next;
        }

        while(b != null) {
            if(set.contains(b)) {
                return b;
            } else {
                b = b.next;
            }
        }

        return null;
    }
}
