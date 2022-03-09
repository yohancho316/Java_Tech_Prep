package LeetCode;

public class MergeTwoSortedLists {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode merged_head = null;
        ListNode merged_tail = null;

        if(list1 == null && list2 == null) return null;
        else if(list1 != null && list2 == null) return list1;
        else if(list1 == null && list2 != null) return list2;

        // Make the Smallest Node the Head of the Merged List
        if(list1.val <= list2.val) {
            merged_head = list1;
            merged_tail = merged_head;
            list1 = list1.next;
            merged_head.next = null;
        } else {
            merged_head = list2;
            merged_tail = merged_head;
            list2 = list2.next;
            merged_head.next = null;
        }

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {

                merged_tail.next = list1;
                list1 = list1.next;
                merged_tail = merged_tail.next;
                merged_tail.next = null;

            } else {

                merged_tail.next = list2;
                list2 = list2.next;
                merged_tail = merged_tail.next;
                merged_tail.next = null;

            }
        }

        if(list1 != null && list2 == null) merged_tail.next = list1;
        else if(list1 == null && list2 != null) merged_tail.next = list2;
        return merged_head;
    }

    public static void main(String[] args) {

        ListNode a1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode b1 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(10))));
        ListNode empty1 = null;
        ListNode empty2 = null;


        // Testing Two Empty Head Nodes Condition
        System.out.println("testing 2 empty head nodes:");
        ListNode merged_head = mergeTwoLists(empty1, empty2);
        while(merged_head != null) {
            System.out.println(merged_head.val);
            merged_head = merged_head.next;
        }

        // Testing One Empty Head Node && One Non-Empty Head Node Condition
        System.out.println("\ntesting 2 non-empty head nodes:");
        merged_head = mergeTwoLists(empty1, b1);
        while(merged_head != null) {
            System.out.println(merged_head.val);
            merged_head = merged_head.next;
        }

        // Testing Two Non-Empty Head Nodes Condition
        System.out.println("\ntesting 2 non-empty head nodes:");
        merged_head = mergeTwoLists(a1, b1);
        while(merged_head != null) {
            System.out.println(merged_head.val);
            merged_head = merged_head.next;
        }


    }
}
