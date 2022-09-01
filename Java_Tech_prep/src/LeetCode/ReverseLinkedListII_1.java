package LeetCode;

public class ReverseLinkedListII_1 {

    public static ListNode LeftNode;
    public static boolean swap;

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void swap(ListNode RightNode, int left, int right) {
        // Base Case
        if(right == 1) return;

        RightNode = RightNode.next;

        if(left > 1) this.LeftNode = this.LeftNode.next;

        swap(RightNode, left - 1, right - 1);

        if((this.LeftNode == RightNode) || (RightNode.next == this.LeftNode)) {
            this.swap = false;
        }

        if(swap) {
            int temp = this.LeftNode.val;
            this.LeftNode.val = RightNode.val;
            RightNode.val = temp;
        }

        this.LeftNode = this.LeftNode.next;
    }


    public ListNode reverseBetween(ListNode head, int left, int right) {
        this.LeftNode = head;
        this.swap = true;

        swap(head, left, right);

        return head;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(20);
        ListNode a3 = new ListNode(30);
        ListNode a4 = new ListNode(40);
        ListNode a5 = new ListNode(50);
        ListNode a6 = new ListNode(60);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;

        ReverseLinkedListII_1 obj = new ReverseLinkedListII_1();

        ListNode head = obj.reverseBetween(a1, 2,5);

        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
