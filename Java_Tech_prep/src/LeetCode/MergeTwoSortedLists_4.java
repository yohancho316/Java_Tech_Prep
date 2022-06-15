package LeetCode;

public class MergeTwoSortedLists_4 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        }
        if(list1 == null) return list2;
        else if(list2 == null) return list1;

        ListNode head = null;
        ListNode current = null;

        if(list1.val <= list2.val) {
            ListNode next = list1.next;
            list1.next = head;
            head = list1;
            current = head;
            list1 = next;
        } else {
            ListNode next = list2.next;
            list2.next = head;
            head = list2;
            current = head;
            list2 = next;
        }

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                ListNode next = list1.next;
                current.next = list1;
                current = current.next;
                current.next = null;
                list1 = next;
            } else {
                ListNode next = list2.next;
                current.next = list2;
                current = current.next;
                current.next = null;
                list2 = next;
            }
        }

        if(list1 != null) {
            current.next = list1;
        } else if(list2 != null) {
            current.next = list2;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(20);
        ListNode b1 = new ListNode (5);
        ListNode b2 = new ListNode(30);

        a1.next = a2;
        a2.next = null;

        b1.next = b2;
        b2.next = null;

        ListNode head = mergeTwoLists(a1, b1);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
