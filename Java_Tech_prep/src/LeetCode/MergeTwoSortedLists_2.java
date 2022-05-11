package LeetCode;

public class MergeTwoSortedLists_2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Check for empty ListNode objects
        if(list1 == null && list2 != null) {
            return list2;
        } else if(list1 != null && list2 == null) {
            return list1;
        } else if(list1 == null && list2 == null) {
            return null;
        }

        // Declare two list node objects
        ListNode head = null;
        ListNode current = null;

        // Determine head node
        if(list1.val <= list2.val) {
            head = list1;
            current = list1;
            list1 = list1.next;
        } else {
            head = list2;
            current = list2;
            list2 = list2.next;
        }

        // Loop through all nodes in both LL
        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
                current = current.next;
            } else {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }
        }

        // Check for Remaining Nodes in List1
        if(list1 != null) {
            current.next = list1;
        }

        // Check for Remaining Nodes in List2
        if(list2 != null) {
            current.next = list2;
        }

        return head;
    }


    public static void main(String[] args) {

        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(20);
        ListNode a3 = new ListNode(30);
        ListNode a4 = new ListNode(40);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = null;

        ListNode b1 = new ListNode(10);
        ListNode b2 = new ListNode(20);
        ListNode b3 = new ListNode(30);

        b1.next = b2;
        b2.next = b3;
        b3.next = null;

        ListNode merged = mergeTwoLists(a1, b1);

        while(merged != null) {
            System.out.println(merged.val);
            merged = merged.next;
        }

    }
}
