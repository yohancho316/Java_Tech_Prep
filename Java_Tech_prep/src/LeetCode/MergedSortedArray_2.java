/*
URL: https://leetcode.com/problems/merge-two-sorted-lists/
Difficulty: Easy
Time Complexity: O(M + N)
Space Complexity: O(1)
 */

package LeetCode;

public class MergedSortedArray_2 {

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

        // Check for Empty Argument Lists
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        // Iterate While List1 and List2 isn't Null
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Append Remaining List Elements
        if(list1 == null) tail.next = list2;
        if(list2 == null) tail.next = list1;

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1_1 = new ListNode(1);
        ListNode l1_2 = new ListNode(2);
        ListNode l1_3 = new ListNode(4);
        ListNode l2_1 = new ListNode(1);
        ListNode l2_2 = new ListNode(3);
        ListNode l2_3 = new ListNode(4);

        l1_1.next = l1_2;
        l1_2.next = l1_3;
        l1_3.next = null;

        l2_1.next = l2_2;
        l2_2.next = l2_3;
        l2_3.next = null;

        ListNode head = mergeTwoLists(l1_1, l2_1);
        while(head != null) {
            System.out.print(head.val + "\t");
            head = head.next;
        }
    }
}
