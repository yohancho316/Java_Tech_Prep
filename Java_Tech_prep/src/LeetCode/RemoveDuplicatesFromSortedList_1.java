package LeetCode;

public class RemoveDuplicatesFromSortedList_1 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode list = head;

        while(list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1)))));

        System.out.println("Before Parse:");
        ListNode current = n1;
        while(current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.println("NULL");

        ListNode temp = deleteDuplicates(n1);

        while(temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
}
