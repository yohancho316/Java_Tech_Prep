//package LeetCode;
//
//public class AddTwoNumbers_1 {
//
//    public static class ListNode {
//        public int val;
//        public ListNode next;
//        public ListNode(int val) {
//            this.val = val;
//            this.next = null;
//        }
//    }
//
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int x = 0;
//        int x_count = 0;
//        int x_place = 10;
//        int y = 0;
//        int y_count = 0;
//        int y_place = 10;
//        int sum = 0;
//
//        while(l1 != null) {
//            if(x_count == 0) {
//                x += l1.val;
//                x_count++;
//            } else {
//                int temp = x_place * l1.val;
//                x_place *= 10;
//                x += temp;
//            }
//            l1 = l1.next;
//        }
//
//        while(l2 != null) {
//            if(y_count == 0) {
//                y += l2.val;
//                y_count++;
//            } else {
//                int temp = y_place * l2.val;
//                y_place *= 10;
//                y += temp;
//            }
//            l2 = l2.next;
//        }
//
//        sum = x + y;
//
//        System.out.println("SUM: " + sum);
//
//        ListNode head = null;
//
//        while(sum )
//
//
//
//        return null;
//    }
//
//    public static void main(String[] args) {
//        ListNode a1 = new ListNode(2);
//        ListNode a2 = new ListNode(2);
//        ListNode a3 = new ListNode(2);
//
//
//        ListNode b1 = new ListNode(5);
//        ListNode b2 = new ListNode(2);
//
//        a1.next = a2;
//        a2.next = a3;
//        a3.next = null;
//
//        b1.next = b2;
//        b2.next = null;
//
//        ListNode sum = addTwoNumbers(a1, b1);
//        while(sum != null) {
//            System.out.println(sum.val);
//            sum = sum.next;
//        }
//
//
//    }
//}
