package Data_Structure_Implementation;

public class DLL_2 {

    private Node head;
    private Node tail;
    private int size;

    public DLL_2() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public int getSize() {
        return this.size;
    }

    public void setHead(Node _node) {
        this.head = _node;
    }

    public void setTail(Node _node) {
        this.tail = _node;
    }

    public void setSize(int _size) {
        this.size = _size;
    }

    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    public void insertAtHead(int _data) {
        Node temp = new Node(_data);
        if(this.isEmpty()) {
            this.head = temp;
            this.tail = temp;
        } else {
            temp.next = this.head;
            temp.previous = null;
            this.head.previous = temp;
            this.head = temp;
        }
        this.size += 1;
    }

    public void insertAtTail(int _data) {
        if(this.isEmpty()) {
            this.insertAtHead(_data);
        } else {
            Node temp = new Node(_data);
            temp.next = null;
            temp.previous = this.getTail();
            this.getTail().next = temp;
            this.setTail(temp);
            this.size += 1;
        }
    }

    public void insertAtPosition(int _data, int position) {
        if(position == 0) {
            this.insertAtHead(_data);
        } else if(position == (this.getSize() - 1)) {
            this.insertAtTail(_data);
        } else {
            Node temp = new Node(_data);
            Node current = this.getHead();
            for(int i = 0; i < (position - 1); i++) {
                current = current.next;
            }
            temp.next = current.next;
            temp.previous = current;
            current.next.previous = temp;
            current.next = temp;
            this.size += 1;
        }
    }

    public void deleteHead() {
        if(this.isEmpty()) {
            return;
        } else {
            this.head = this.head.next;
            this.head.previous = null;
            if(this.head == null) {
                this.tail = null;
            }

            this.size -= 1;
        }
    }

    public void deleteTail() {
        if(this.isEmpty()) {
            return;
        } else if(this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            Node previous = this.tail.previous;
            this.tail.previous = null;
            previous.next = null;
            this.tail = previous;
        }
        this.size -= 1;
    }

    public void deleteAtPosition(int position) {
        if(this.isEmpty()) {
            return;
        } else if(position == 0) {
            this.deleteHead();
        } else if (position == (this.size - 1)){
            this.deleteTail();
        } else {
            Node current = this.head;
            for(int i = 0; i < (position - 1); i++) {
                current = current.next;
            }
            Node target = current.next;
            current.next = target.next;
            target.next.previous = current;
            target.next = null;
            target.previous = null;
            this.size -= 1;
        }
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void printList() {
        Node current = this.getHead();
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("NULL\n");
        System.out.println("Size of List: " + this.getSize());
    }

    public Node searchByData(int target) {
        if(this.isEmpty()) {
            return null;
        } else {
            Node current = this.head;
            while (current.data != target) {
                current = current.next;
            }

            if (current == null) {
                return null;
            }

            return current;
        }
    }

    public class Node {
        private int data;
        private Node next;
        private Node previous;

        public Node(int _data) {
            this.data = _data;
            this.next = null;
            this.previous = null;
        }

        public Node(int _data, Node _next, Node _previous) {
            this. data = _data;
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

        // Create Doubly Linked List
        DLL_2 list = new DLL_2();

        // Insert Nodes at Head
        list.insertAtHead(50);
        list.insertAtHead(40);
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);

        // Print List
        list.printList();

        // Insert Nodes at Tail
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.insertAtTail(80);
        list.insertAtTail(90);
        list.insertAtTail(100);

        // Print List
        System.out.println();
        list.printList();

        // Insert Node at Given Position
        list.insertAtPosition(0, 0);

        // Print List
        System.out.println();
        list.printList();

        // Insert Node at Given Position
        list.insertAtPosition(110, 10);

        // Print List
        System.out.println();
        list.printList();

        // Insert Node at Given Position
        list.insertAtPosition(5, 1);

        // Print List
        System.out.println();
        list.printList();

        // Delete the Head Node
        list.deleteHead();
        list.deleteHead();

        // Print List
        System.out.println();
        list.printList();

        // Delete the Tail Node
        list.deleteTail();

        // Print List
        System.out.println();
        list.printList();

        // Delete at Given Position
        list.deleteAtPosition(0);

        // Print List
        System.out.println();
        list.printList();

        // Delete at Given Position
        list.deleteAtPosition(8);

        // Print List
        System.out.println();
        list.printList();

        // Delete at Given Position
        list.deleteAtPosition(3);

        // Print List
        System.out.println();
        list.printList();

        // Search for Node given Target Data
        Node found = list.searchByData(70);
        System.out.println();
        System.out.println("Found Node given Target Data: " + found.data);

        // Clear the List
        list.clear();

        // Print List
        System.out.println();
        list.printList();
    }
}

/*
Linked List Methods:
- Insert at Head *
- Insert at Tail *
- Insert Node at Given Position *
- Delete Head *
- Delete Tail *
- Delete Node at Given Position *
- Print the List *
- Is Empty *
- Clear List
- Search List & Return Node w/ Specified Data
 */
