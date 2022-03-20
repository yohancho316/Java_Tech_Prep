package Data_Structure_Implementation;

// Doubly Linked List Class
public class DLL_1 {

    private Node head;
    private Node tail;
    private int size;

    public DLL_1() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    public void insertHead(int _data) {
        Node temp = new Node(_data);
        if(this.isEmpty()) {
            this.head = temp;
            this.tail = temp;
        } else {
            temp.next = this.head;
            temp.previous = this.head.previous;
            this.head = temp;
        }
        this.size += 1;
    }

    public void insertTail(int _data) {
        Node temp = new Node(_data);
        if(this.isEmpty()) {
            this.insertHead(_data);
        } else {
            temp.next = null;
            temp.previous = this.tail;
            this.tail.next = temp;
            this.tail = temp;
            this.size += 1;
        }
    }

    public void insertAtPosition(int _data, int position) {
        if(position == 1) {
            this.insertHead(_data);
        } else if(position == (this.size)) {
            this.insertTail(_data);
        } else {
            Node temp = new Node(_data);
            Node current = this.head;
            for(int i = 1; i < (position - 1); i++) {
                current = current.next;
            }
            temp.next = current.next;
            temp.previous = current;
            current.next.previous = temp;
            current.next = temp;
            this.size += 1;
        }
    }

    public void print() {
        Node current = this.head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("NULL\n");
        System.out.println("Size of List: " + this.size);
    }

    public class Node {
        private int data;
        private Node previous;
        private Node next;

        public Node(int _data) {
            this.data = _data;
            this.next = null;
            this.previous = null;
        }

        public Node(int _data, Node _next, Node _previous) {
            this.data = _data;
            this.next = _next;
            this.previous = _previous;
        }

        public int getData() {
            return this.data;
        }

        public Node getNext() {
            return this.next;
        }

        public Node getPrevious() {
            return this.previous;
        }

        public void setData(int _data) {
            this.data = _data;
        }

        public void setNext(Node _next) {
            this.next = _next;
        }

        public void setPrevious(Node _previous) {
            this.previous = _previous;
        }
    }

    public static void main(String[] args) {

        // Create the Doubly Linked List
        DLL_1 list = new DLL_1();

        // Insert Nodes at Head
        list.insertHead(50);
        list.insertHead(40);
        list.insertHead(30);
        list.insertHead(20);
        list.insertHead(10);

        // Print List
        list.print();

        // Insert Nodes at Tail
        list.insertTail(60);
        list.insertTail(70);
        list.insertTail(80);
        list.insertTail(90);
        list.insertTail(100);

        // Print List
        System.out.println();
        list.print();
    }
}

/*
Linked List Methods:
- Insert at Head
- Insert at Tail
- Insert Node at Given Position
- Delete Head
- Delete Tail
- Delete Node at Given Position
- Print the List
- Is Empty
- Clear List
- Search List & Return Node w/ Specified Data
 */
