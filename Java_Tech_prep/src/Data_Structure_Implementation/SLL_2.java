package Data_Structure_Implementation;

public class SLL_2 {

    private Node head;
    private Node tail;
    private int size;

    public SLL_2() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Getter Methods
    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if(this.head == null) return true;
        return false;
    }

    public void insertHead(int _data) {
        Node temp = new Node(_data);
        temp.next = this.head;
        this.head = temp;

        if(this.tail == null) {
            this.tail = temp;
        }

        this.size += 1;
    }

    public void insertTail(int _data) {

        if(this.head == null && this.tail == null) {
            this.insertHead(_data);
            return;
        }

        Node node = new Node(_data);
        this.tail.next = node;
        this.tail = node;
        this.size += 1;
    }

    public void insertAtPosition(int _data, int position) {
        if(position == 1) {
           this.insertHead(_data);
        } else if(position == this.size) {
            this.insertTail(_data);
        } else {

            Node temp = new Node(_data);
            Node current = this.head;

            for(int i = 1; i <= position - 1; i++) {
                current = current.next;
            }

            temp.next = current.next;
            current.next = temp;
            this.size += 1;
        }
    }

    public void deleteHead() {
        if(this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }

        if(this.size > 0) {
            this.size -= 1;
        }
    }

    public void deleteTail() {
        // Case 1: List has No Nodes
        if(this.head == null && this.tail == null) {
            return;
        }
        // Case 2: list has one Node
        else if(this.head == this.tail) {
            this.head = null;
            this.tail = null;
            this.size -= 1;
        } else {
            Node current = this.head;
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            this.size -= 1;
        }
    }

    public void printList() {
        Node current = this.head;

        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("NULL");
    }

    public void clearList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    // Node Class
    public class Node {

        private int data;
        private Node next;

        public Node(int _data) {
            this.data = _data;
            this.next = null;
        }

        public Node(int _data, Node _next) {
            this.data = _data;
            this.next = _next;
        }

        // Getter Methods
        public int getData() {
            return this.data;
        }

        public Node getNext() {
            return this.next;
        }

        // Setter Methods
        public void setData(int _data) {
            this.data = _data;
        }

        public void setNext(Node _next) {
            this.next = _next;
        }
    }

    public static void main(String[] args) {

        // Create Linked List
        SLL_2 list = new SLL_2();

        // Insert Nodes into List from Head
        list.insertHead(50);
        list.insertHead(40);
        list.insertHead(30);
        list.insertHead(20);
        list.insertHead(10);

        // Print the List
        list.printList();
        System.out.println("\nSize of List: " + list.getSize());

        // Insert Nodes into List from Tail
        list.insertTail(60);
        list.insertTail(70);
        list.insertTail(80);
        list.insertTail(90);
        list.insertTail(100);

        // Print the List
        System.out.println("\n\n");
        list.printList();
        System.out.println("\nSize of List: " + list.getSize());

        // Delete the Head Node Twice from List
        list.deleteHead();
        list.deleteHead();

        // Print the List
        System.out.println("\n\n");
        list.printList();
        System.out.println("\nSize of List: " + list.getSize());

        // Delete the Tail Node Twice from list
        list.deleteTail();
        list.deleteTail();

        // Print the List
        System.out.println("\n\n");
        list.printList();
        System.out.println("\nSize of List: " + list.getSize());

        // Clear the List
        list.clearList();

        // Print the List
        System.out.println("\n\n");
        list.printList();
        System.out.println("\nSize of List: " + list.getSize());


        // Insert Nodes into List from Head
        list.insertHead(100);
        list.insertHead(90);
        list.insertHead(80);
        list.insertHead(70);
        list.insertHead(60);
        list.insertHead(50);
        list.insertHead(40);
        list.insertHead(30);
        list.insertHead(20);
        list.insertHead(10);

        // Print the List
        System.out.println("\n\n");
        list.printList();
        System.out.println("\nSize of List: " + list.getSize());

        // Insert by Position
        list.insertAtPosition(0,1);

        // Print the List
        System.out.println("\n\n");
        list.printList();
        System.out.println("\nSize of List: " + list.getSize());

        // Insert by Position
        list.insertAtPosition(110,11);

        // Print the List
        System.out.println("\n\n");
        list.printList();
        System.out.println("\nSize of List: " + list.getSize());

        // Insert by Position
        list.insertAtPosition(55,6);

        // Print the List
        System.out.println("\n\n");
        list.printList();
        System.out.println("\nSize of List: " + list.getSize());



    }
}

/*
Linked List Methods:
1.) * Insert at Head
2.) * Insert at Tail
3.) * Insert at Index Position
4.) * Is Empty
5.) * Get Head Node
6.) * Get Tail Node
7.) * Delete Head Node
8.) * Delete Tail Node
9.) * Get Length of List
10.) Delete by Node Position
11.) Delete by Data Found
12.) toString
13.) * Clear
14.) Reverse List
15.) * Find Node by Data & return Position


 */
