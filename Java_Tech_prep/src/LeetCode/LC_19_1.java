package LeetCode;

public class LC_19_1 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(100, head);
        ListNode tail = sentinel;
        ListNode temp = head;
        int size = 0;

        while(temp != null) {
            ++size;
            temp = temp.next;
        }

        for(int i = 0; i < size; i++) {
            if(n == (size - i)) {
                tail.next = head.next;
                break;
            } else {
                tail = tail.next;
            }
            head = head.next;
        }
        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = null;

//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = null;

        ListNode head = removeNthFromEnd(n1, 1);

        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
