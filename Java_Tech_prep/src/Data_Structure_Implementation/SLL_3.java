package Data_Structure_Implementation;

public class SLL_3 {

    private Node head;
    private Node tail;
    private int size;

    public SLL_3() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int _data) {
        Node temp = new Node(_data, null);
        temp.next = this.head;
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
            this.tail = temp;
            this.size += 1;
        }
    }

    public void insertAtPosition(int _data, int position) {
        if(position == 1) {
            this.insertAtHead(_data);
        } else if(position == this.size) {
            this.insertAtTail(_data);
        } else {
            Node current = this.head;
            Node temp = new Node(_data);
            for(int i = 1; i < (position - 1); i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            this.size += 1;
        }
    }

    public void deleteHead() {
        if(this.head == null && this.tail == null) {
            return;
        } else if(this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.size -= 1;
    }

    public void deleteTail() {
        if(this.isEmpty()) {
            return;
        } else if(this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            Node current = this.head;
            while(current.next != this.tail) {
                current = current.next;
            }
            current.next = null;
        }
        this.size -= 1;
    }

    public void deleteAtPosition(int position) {
        if(position == 1) {
            this.deleteHead();
        } else if(position == this.size) {
            this.deleteTail();
        } else {
            Node current = this.head;
            for(int i = 1; i < (position - 1); i++) {
                current = current.next;
            }
            current.next = current.next.next;
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

    public Node searchByData(int target) {
        if(this.isEmpty()) {
            return null;
        } else {
            Node current = this.head;
            while(current.data != target) {
                current = current.next;
            }

            if(current == null) {
                return null;
            }

            return current;
        }
    }


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

        public void setData(int _data) {
            this.data = _data;
        }

        public void setNext(Node _next) {
            this.next = _next;
        }

        public int getData() {
            return this.data;
        }

        public Node getNext() {
            return this.next;
        }
    }

    public static void main(String[] args) {
        // Create a New Singly Linked List
        SLL_3 list = new SLL_3();

        // Check if Linked List is Empty
        System.out.println(list.isEmpty() + "\n");

        // Insert Nodes at Head
        list.insertAtHead(50);
        list.insertAtHead(40);
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);

        // Print the List
        list.printList();
        System.out.println("\nSize of Current List: " + list.getSize() + "\n");

        // Insert Nodes at Tail
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.insertAtTail(80);
        list.insertAtTail(90);
        list.insertAtTail(100);

        // Print the List
        list.printList();
        System.out.println("\nSize of Current List: " + list.getSize() + "\n");

        // Insert Nodes at Position
        list.insertAtPosition(0, 1);
        list.insertAtPosition(110, 11);
        list.insertAtPosition(66, 8);

        // Print the List
        list.printList();
        System.out.println("\nSize of Current List: " + list.getSize() + "\n");

        // Delete the Head Node
        list.deleteHead();

        // Print the List
        list.printList();
        System.out.println("\nSize of Current List: " + list.getSize() + "\n");

        // Delete the Tail Node
        list.deleteTail();

        // Print the List
        list.printList();
        System.out.println("\nSize of Current List: " + list.getSize() + "\n");

        // Delete at Given Position
        list.deleteAtPosition(7);

        // Print the List
        list.printList();
        System.out.println("\nSize of Current List: " + list.getSize() + "\n");

        // Find Node w/ Specified Value
        Node temp = list.searchByData(50);
        System.out.println("Temp Data: " + temp.data + "\n");

        // Clear the Linked List
        list.clear();

        // Print the List & Check if Empty
        list.printList();
        System.out.println("\nSize of Current List: " + list.getSize());
        System.out.println(list.isEmpty());
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