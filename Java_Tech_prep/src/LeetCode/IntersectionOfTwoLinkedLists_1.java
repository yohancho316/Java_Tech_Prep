package LeetCode;
import java.util.HashMap;

public class IntersectionOfTwoLinkedLists_1 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Boolean> map = new HashMap<ListNode,Boolean>();

        ListNode currentA = headA;
        while(currentA != null) {
            map.put(currentA,true);
            currentA = currentA.next;
        }

        ListNode currentB = headB;
        while(currentB != null) {

            if(map.containsKey(currentB)) {
                return currentB;
            }

            currentB = currentB.next;

        }

        return null;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int _val) {
            this.val = _val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(20);
        ListNode a3 = new ListNode(30);
        ListNode a4 = new ListNode(40);
        ListNode a5 = new ListNode(50);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;

        ListNode b1 = new ListNode(100);
        ListNode b2 = new ListNode(200);
        ListNode b3 = new ListNode(300);

        b1.next = b2;
        b2.next = b3;
        b3.next = a4;

        ListNode suspect = getIntersectionNode(a1,b1);
        System.out.println("Suspect: " + suspect.val);



    }
}
