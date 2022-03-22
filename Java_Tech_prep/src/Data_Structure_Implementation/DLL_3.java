package Data_Structure_Implementation;

public class DLL_3 {

    private Node head;
    private Node tail;
    private int size;

    public DLL_3() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    public void insertAtPosition(int _data, int position) {
        if((position < 0) || (position > this.size)) {
            throw new IndexOutOfBoundsException();
        } else if(position == 0) {
            insertAtHead(_data);
        } else if(position == this.size) {
            insertAtTail(_data);
        } else {
            Node current = this.head;
            Node temp = new Node(_data);
            for(int i = 0; i < (position - 1); i++) {
                current = current.next;
            }
            Node target = current.next;
            target.previous = temp;
            temp.next = target;
            current.next = temp;
            temp.previous = current;
            this.size += 1;
        }
    }

    public void insertAtHead(int _data) {
        Node temp = new Node(_data);
        temp.next = this.head;
        temp.previous = null;
        this.head = temp;
        if(this.tail == null) {
            this.tail = temp;
        }
        this.size += 1;
    }

    public void insertAtTail(int _data) {
        if(this.isEmpty()) {
            this.insertAtHead(_data);
        } else {
            Node temp = new Node(_data);
            this.tail.next = temp;
            temp.previous = this.tail;
            this.tail = temp;
            this.size += 1;
        }
    }

    public void deleteAtPosition(int position) {
        if((position < 0) || (position >= this.size)) {
            throw new IndexOutOfBoundsException();
        } else if(position == 0) {
            this.deleteHead();
        } else if(position == (this.size - 1)) {
            this.deleteTail();
        } else {
            Node previous = this.head;
            for(int i = 0; i < (position - 1); i++) {
                previous = previous.next;
            }
            Node target = previous.next;
            previous.next = target.next;
            target.next.previous = previous;
            this.size -= 1;
        }
    }

    public void deleteHead() {
        if(this.isEmpty()) {
            return;
        } else if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size -= 1;
        } else {
            this.head = this.head.next;
            this.head.previous = null;
            this.size -= 1;
        }
    }

    public void deleteTail() {
        if(this.isEmpty()) {
            return;
        } else if(this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size -= 1;
        } else if(this.size == 2) {
            this.head.next = null;
            this.tail = this.head;
            this.tail.previous = null;
            this.size -= 1;
        } else {
            this.tail = this.tail.previous;
            this.tail.next = null;
            this.size -= 1;
        }
    }

    public void print() {
        Node current = this.head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("NULL\n");
        System.out.println("Size: " + this.size + "\n");
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node getByData(int target) {
        if(this.head.data == target) {
            return this.head;
        } else if(this.tail.data == target) {
            return this.tail;
        } else {
            Node current = this.head;
            while(current.data != target) {
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
            this.data = _data;
            this.next = _next;
            this.previous = _previous;
        }
    }

    public static void main(String[] args) {

        // Create Doubly Linked List
        DLL_3 list = new DLL_3();

        // Insert Nodes at Head
        list.insertAtHead(50);
        list.insertAtHead(40);
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);

        // Print the List
        list.print();

        // Insert Nodes at Tail
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.insertAtTail(80);
        list.insertAtTail(90);
        list.insertAtTail(100);

        // Print the List
        list.print();

        // Insert Nodes at Given Position
        list.insertAtPosition(0, 0);
        list.insertAtPosition(110,11);
        list.insertAtPosition(55,6);

        // Print the List
        list.print();

        // Delete Nodes from the List
        list.deleteHead();
        list.deleteTail();
        list.deleteAtPosition(0);
        list.deleteAtPosition(9);
        list.deleteAtPosition(4);

        // Print the List
        list.print();

        // Find Node w/ Given Target Data
        Node target = list.getByData(100);
        if(target == null) {
            System.out.println("Node does not Exist!");
        } else {
            System.out.println("Target Node: " + target.data);
        }
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
- Clear List *
- Search List & Return Node w/ Specified Data
 */