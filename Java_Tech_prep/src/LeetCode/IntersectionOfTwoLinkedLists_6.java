package LeetCode;

public class IntersectionOfTwoLinkedLists_6 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA.next == null && headB.next == null) return null;
        if(headA.next == headB.next) return headA.next;

        ListNode a = headA;
        ListNode b = headB;


        int aLength = 0;
        int bLength = 0;

        while(a != null) {
            ++aLength;
            a = a.next;
        }

        while(b != null) {
            ++bLength;
            b = b.next;
        }

        if(aLength > bLength) {
            for(int i = 0; i < Math.abs(aLength - bLength); i++) {
                headA = headA.next;
            }
        } else if(bLength > aLength){
            for(int j = 0; j < Math.abs(bLength - aLength); j++) {
                headB = headB.next;
            }
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

    public static void main(String[] args) {
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(20);
        ListNode a3 = new ListNode(30);


        ListNode b1 = new ListNode(-10);
        ListNode b2 = new ListNode(-20);
        ListNode b3 = new ListNode(-30);

        a1.next = a2;
        a2.next = a3;


        b1.next = b2;
        b2.next = a3;

        ListNode intersection = getIntersectionNode(a1, b1);
        System.out.println(intersection.val);
    }
}
