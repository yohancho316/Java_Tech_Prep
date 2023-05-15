package LeetCode;

public class LC_21_1 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() { }
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if((list1 == null && list2 == null) || (list2 == null)) return list1;
        if(list1 == null) return list2;

        ListNode head = null;
        ListNode tail = head;

        while((list1 != null) && (list2 != null)) {

            if(list1.val <= list2.val) {
                ListNode next = list1.next;
                if(head == null) {
                    head = list1;
                    head.next = null;
                    tail = head;
                } else {
                    tail.next = list1;
                    tail = tail.next;
                    tail.next = null;
                }
                list1 = next;
            } else {
                ListNode next = list2.next;
                if(head == null) {
                    head = list2;
                    head.next = null;
                    tail = head;
                } else {
                    tail.next = list2;
                    tail = tail.next;
                    tail.next = null;
                }
                list2 = next;
            }
        }

        if(list1 != null) tail.next = list1;
        else if(list2 != null) tail.next = list2;

        return head;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);


        ListNode b1 = new ListNode(2);
        ListNode b2 = new ListNode(3);

        a1.next = a2;
        a2.next = a3;
        a3.next = null;

        b1.next = b2;
        b2.next = null;

        ListNode head = mergeTwoLists(a1, b1);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
