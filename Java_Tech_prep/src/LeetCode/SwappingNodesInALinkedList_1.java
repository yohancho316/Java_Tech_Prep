package LeetCode;
import java.util.List;
import java.util.ArrayList;

public class SwappingNodesInALinkedList_1 {

    public static ListNode swapNodes(ListNode head, int k) {

        List<Integer> list = new ArrayList<Integer>();
        ListNode current = head;
        int size = 0;

        while(current != null) {
            list.add(size, current.val);
            current = current.next;
            ++size;
        }

        int temp = list.get(k - 1);
        list.set(k - 1, list.get(size - k));
        list.set(size - k, temp);

        current = head;
        int pos = 0;

        while(current != null) {
            if(current.val != list.get(pos)) {
                current.val = list.get(pos);
            }

            ++pos;
            current = current.next;
        }


        return head;
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
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);
        ListNode n4 = new ListNode(40);
        ListNode n5 = new ListNode(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        n1 = swapNodes(n1, 2);

        ListNode current = n1;

        while(current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.print("NULL\n");

    }
}
