package Data_Structure_Implementation;

// Linked List Data Structure Implementation
public class SLL_1 {

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int _data) {
            this.data = _data;
            this.next = null;
        }
    }

    private ListNode head;

    public SLL_1() {
        this.head = null;
    }

    public void print() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

    }


}
