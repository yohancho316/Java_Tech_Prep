package LeetCode;

public class IntersectionOfTwoLinkedLists_4 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        int aLen = 0;
        int bLen = 0;

        while(a != null) {
            ++aLen;
            a = a.next;
        }

        while(b != null) {
            ++bLen;
            b = b.next;
        }

        if(aLen > bLen) {
            for(int i = 0; i < (aLen - bLen); i++) {
                headA = headA.next;
            }
        } else if(aLen < bLen) {
            for(int i = 0; i < (bLen - aLen); i++) {
                headB = headB.next;
            }
        }

        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
