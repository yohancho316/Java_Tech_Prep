package LeetCode;

public class SwappingNodesInALinkedList_2 {

    public static ListNode swapNodes(ListNode head, int k) {

        int size = 0;
        ListNode left = null;
        ListNode right = null;
        ListNode current = head;

        while(current != null) {
            size += 1;
            if(size == k) left = current;
            current = current.next;
        }

        right = head;

        for(int i = 0; i < (size - k); i++) {
            right = right.next;
        }

        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
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
        ListNode n6 = new ListNode(60);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        System.out.println("Before Swap:");
        ListNode current = n1;
        while(current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.print("NULL\n\n");

        System.out.println("After Swap:");
        current = swapNodes(n1, 2);
        while(current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.print("NULL\n\n");

    }
}
