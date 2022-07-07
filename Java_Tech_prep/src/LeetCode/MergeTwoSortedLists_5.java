package LeetCode;

public class MergeTwoSortedLists_5 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        else if(list2 == null) return list1;

        ListNode head = null;
        ListNode current = null;

        if(list1.val <= list2.val) {
            head = list1;
            current = head;
            list1 = list1.next;
            current.next = null;
        } else {
            head = list2;
            current = head;
            list2 = list2.next;
            current.next = null;
        }

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
                current = current.next;
                current.next = null;
            } else {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
                current.next = null;
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
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(1);

        ListNode b1 = new ListNode(2);
        ListNode b2 = new ListNode(2);

        a1.next = a2;
        a2.next = a3;

        b1.next = b2;

        ListNode head = mergeTwoLists(a1, b1);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
