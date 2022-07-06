package LeetCode;

public class AddTwoNumbers_2 {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1.val == 0 && l2.val == 0) return new ListNode(0);

        int x = l1.val;
        int y = l2.val;

        int x_place_value = 10;
        int y_place_value = 10;

        l1 = l1.next;
        l2 = l2.next;

        while(l1 != null) {

            x += x_place_value * l1.val;
            l1 = l1.next;
            x_place_value *= 10;
            System.out.println("current x = " + x);
            System.out.println("current decimal place = " + x_place_value + "\n");
        }

        while(l2 != null) {
            y += y_place_value * l2.val;
            l2 = l2.next;
            y_place_value *= 10;
        }

        int sum = x + y;
        int count = 0;
        ListNode head = null;
        ListNode current = null;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Sum = " + sum);

        while(sum > 0) {
            int quotient = sum / 10;
            int remainder = sum % 10;

            if(count == 0) {
                head = new ListNode(remainder);
                current = head;
                ++count;
            } else {
                ListNode temp = new ListNode(remainder);
                current.next = temp;
                current = temp;
            }

            sum = quotient;
        }
        return head;
    }

    public static void main(String[] args) {

        // [9]
        //[1,9,9,9,9,9,9,9,9,9]
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(9);
        ListNode a4 = new ListNode(9);
        ListNode a5 = new ListNode(9);
        ListNode a6 = new ListNode(9);
        ListNode a7 = new ListNode(9);
        ListNode a8 = new ListNode(9);
        ListNode a9 = new ListNode(9);
        ListNode a10 = new ListNode(9);

        ListNode b1 = new ListNode(9);


        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        a7.next = a8;
        a8.next = a9;
        a9.next = a10;
        a10.next = null;

        b1.next = null;

        ListNode head = addTwoNumbers(a1, b1);
        String sum = "";
        while(head != null) {
            sum += head.val;
            head = head.next;
        }

        System.out.println("Sum: " + sum);

    }
}
