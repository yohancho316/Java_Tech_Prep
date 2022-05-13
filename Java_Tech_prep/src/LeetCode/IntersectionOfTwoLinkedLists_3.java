package LeetCode;

public class IntersectionOfTwoLinkedLists_3 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) {
            return null;
        } else if(headA.next == null || headB.next == null) {
            return null;
        } else if(headA == headB) {
            return headA;
        } else if(headA.next == headB) {
            return headB;
        } else if(headB.next == headA) {
            return headA;
        }


        ListNode a = headA;
        ListNode b = headB;

        int lenA = 0;
        int lenB = 0;

        while(a != null) {
            ++lenA;
            a = a.next;
        }

        while(b != null) {
            ++lenB;
            b = b.next;
        }

        int diff = Math.abs(lenA - lenB);
        ListNode slow = null;
        ListNode fast = null;

        if(lenA > lenB) {
            fast = headA;
            slow = headB;
        } else {
            fast = headB;
            slow = headA;
        }

        for(int i = 0; i < diff; i++) {
            fast = fast.next;
        }

        while(slow != null && fast != null) {
            if(slow.next == fast.next) return slow.next;
            slow = slow.next;
            fast = fast.next;
        }

        return null;
    }

    public static void main(String[] args) {

//        ListNode a1 = new ListNode(10);
//        ListNode a2 = new ListNode(20);
//        ListNode a3 = new ListNode(30);
//        ListNode a4 = new ListNode(40);
//        ListNode a5 = new ListNode(50);
//        ListNode a6 = new ListNode(60);
//
//        ListNode b1 = new ListNode(10);
//        ListNode b2 = new ListNode(20);
//        ListNode b3 = new ListNode(30);
//
//        a1.next = a2;
//        a2.next = a3;
//        a3.next = a4;
//        a4.next = a5;
//        a5.next = a6;
//        a6.next = null;
//
//        b1.next = b2;
//        b2.next = b3;
//        b3.next = a4;


        ListNode a1 = new ListNode(10);
        ListNode b1 = a1;

        System.out.println(a1 == b1);

        //System.out.println(getIntersectionNode(a1, b1));
    }
}
