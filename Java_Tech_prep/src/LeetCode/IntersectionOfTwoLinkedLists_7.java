package LeetCode;

public class IntersectionOfTwoLinkedLists_7 {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode findIntersection(ListNode headA, ListNode headB, int diff) {

        for(int i = 0; i < diff; i++) {
            headA = headA.next;
        }

        while(headA != null && headB != null) {
            if(headA == headB) return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;

        int aLen = 0; int bLen = 0;
        ListNode a = headA; ListNode b = headB; ListNode intersection = null;

        while(a != null) {
            aLen++;
            a = a.next;
        }

        while(b != null) {
            bLen++;
            b = b.next;
        }

        if(aLen >= bLen) {
            intersection = findIntersection(headA, headB, aLen - bLen);
        } else {
            intersection = findIntersection(headB, headA, bLen - aLen);
        }
        return intersection;
    }

    public static void main(String[] args) {

    }
}
