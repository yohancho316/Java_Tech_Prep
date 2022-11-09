package LeetCode;

public class Practice {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }


    public static String recursiveTraversal(ListNode root) {

        // Base Case
        if(root == null) return "";

        return "" + root.val + " " + recursiveTraversal(root.next);
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

        System.out.println(recursiveTraversal(n1));

    }
}
