package LeetCode;

public class IntersectionOfTwoLinkedLists_2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Declare two ListNode object's and assign reference of LL A/B
        ListNode a = headA;
        ListNode b = headB;

        // Declare two integer variables to track length of LL's
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

        // Declare two ListNode object pointers slow
        ListNode slow = null;
        ListNode fast = null;

        if(aLen > bLen) {
            slow = headB;
            fast = headA;
        } else {
            slow = headA;
            fast = headB;
        }


        // Loop & Check to Find Intersection
        while(fast.next != null && fast.next.next != null) {

            if((slow.next == fast.next) || (slow.next == fast.next.next)) {
                return slow.next;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }

        return null;
    }


    public static void main(String[] args) {

        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(20);
        ListNode a3 = new ListNode(30);

        ListNode b1 = new ListNode(40);
        ListNode b2 = new ListNode(50);
        ListNode b3 = new ListNode(60);
        ListNode b4 = new ListNode(70);
        ListNode b5 = new ListNode(80);
        ListNode b6 = new ListNode(90);

        a1.next = a2;
        a2.next = a3;
        a3.next = b4;

        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next = b6;
        b6.next = null;

        ListNode found = getIntersectionNode(a1, b1);
        if(found == null) {
            System.out.println("NULL");
        } else {
            System.out.println(found);
        }

    }
}
