package LeetCode;

public class LC_160_1 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA.next == null || headB.next == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        int aSize = 0;
        int bSize = 0;

        while(a != null) {
            ++aSize;
            a = a.next;
        }

        while(b != null) {
            ++bSize;
            b = b.next;
        }

        if(bSize > aSize) {
            ListNode temp = headA;
            int tempLength = aSize;
            headA = headB;
            headB = temp;
            aSize = bSize;
            bSize = tempLength;
        }

        for(int i = 1; i <= (aSize - bSize); i++) {
            headA = headA.next;
        }

        while(headA != null && headB != null) {
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
