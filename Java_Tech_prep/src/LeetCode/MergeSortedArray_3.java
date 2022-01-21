package LeetCode;

public class MergeSortedArray_3 {

    static class ListNode {

        // Member Attributes
        public int val;
        public ListNode next;

        // Default Constructor
        public ListNode() {}

        // Overloaded Constructor
        public ListNode(int _val) {
            this.val = _val;
            this.next = null;
        }

        public ListNode(int _val, ListNode _next) {
            this.val = _val;
            this.next = _next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Local Declarations
        ListNode head = new ListNode();
        ListNode tail = head;

        // Check for Empty LinkedList Arguments
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        // Iterate through Nodes in List1 & List2
        while((list1 != null) && (list2 != null)) {

            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Check for Remaining Nodes in List1 or List2
        if(list1 == null && list2 != null) {
            tail.next = list2;
        } else if(list1 != null && list2 == null) {
            tail.next = list1;
        }

        return head.next;
    }

    public static void main(String[] args) {

    }
}
