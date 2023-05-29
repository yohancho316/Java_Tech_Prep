package LeetCode;

public class LC_2_1 {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String str1 = "";
        String str2 = "";

        while(l1 != null) {
            if(str1.isEmpty()) str1 = "" + l1.val;
            else str1 = "" + l1.val + str1;
            l1 = l1.next;
        }

        while(l2 != null) {
            if(str2.isEmpty()) str2 = "" + l2.val;
            else str2 = "" + l2.val + str2;
            l2 = l2.next;
        }

        if(str1 == "0" && str2 == "0") return new ListNode(0);

        ListNode head = null;
        ListNode tail = null;


        int i = str1.length() - 1;
        int j = str2.length() - 1;
        boolean carry = false;
        int sum = 0;

        while((i >= 0) && (j >= 0)) {
            sum = Character.getNumericValue(str1.charAt(i)) + Character.getNumericValue(str2.charAt(j));
            if(carry) ++sum;

            if(head == null) {
                head = new ListNode(sum >= 10 ? (sum - 10) : sum);
                tail = head;
            } else {
                tail.next = new ListNode(sum >= 10 ? (sum - 10) : sum);
                tail = tail.next;
            }
            if(sum >= 10) carry = true;
            else carry = false;
            --i; --j;
        }

        sum = 0;

        while(i >= 0) {
            sum = Character.getNumericValue(str1.charAt(i));
            if(carry) ++sum;
            tail.next = new ListNode(sum >= 10 ? (sum - 10) : sum);
            tail = tail.next;
            if(sum >= 10) carry = true;
            else carry = false;
            --i;
        }

        sum = 0;

        while(j >= 0) {
            sum = Character.getNumericValue(str2.charAt(j));
            if(carry) ++sum;
            tail.next = new ListNode(sum >= 10 ? (sum - 10) : sum);
            tail = tail.next;
            if(sum >= 10) carry = true;
            else carry = false;
            --j;
        }

        if(carry) {
            tail.next = new ListNode(1);
            tail = tail.next;
        }

        return head;
    }

    public static void main(String[] args) {



//[9]
//[1,9,9,9,9,9,9,9,9,9]


        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n7 = new ListNode(9);
        ListNode n8 = new ListNode(9);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;

        ListNode a1 = new ListNode(9);






        ListNode node = addTwoNumbers(n1, a1);
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }
}
