/*
URL: https://leetcode.com/problems/merge-two-sorted-lists/
Difficulty: Easy
Time Complexity: O(M + N) where M = total elements in list1 && N = total elements in list2
Space Complexity: O(1)
 */

package LeetCode;
import java.util.*;



public class MergeSortedArray {

    static class ListNode {

        // Member Attributes
        public int val;
        public ListNode next;

        // Default Constructor
        public ListNode() {
            this.val = 0;
            this.next = null;
        }

        // Overloaded Constructor
        public ListNode(int val) {}

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode merge(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = new ListNode();
        ListNode tail = head;

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

        if(list1 == null) {
            tail.next = list2;
        } else {
            tail.next = list1;
        }

        return head.next;
    }

    public static void main(String[] args) {

    }
}
