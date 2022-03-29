package Data_Structure_Implementation;

// Singly Linked List DS Implementation
public class SLL_4 {

    private ListNode head;
    private ListNode tail;
    private int size;

    public SLL_4() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void setHead(ListNode _head) {
        this.head = _head;
    }

    public void setTail(ListNode _tail) {
        this.tail = _tail;
    }

    public void setSize(int _size) {
        this.size = _size;
    }

    public ListNode getHead() {
        return this.head;
    }

    public ListNode getTail() {
        return this.tail;
    }

    public int getSize() {
        return this.size;
    }

    public void increaseSize() {
        this.size += 1;
    }

    public void decreaseSize() {
        this.size -= 1;
    }

    public boolean isEmpty() {
        return ((this.head == null) && (this.tail == null));
    }

    public void clear() {
        this.setHead(null);
        this.setTail(null);
        this.setSize(0);
    }

    public void insertAtHead(int _data) {
        ListNode temp = new ListNode(_data);
        // Case # 1: List is Empty
        if(this.isEmpty()) {
            this.setHead(temp);
            this.setTail(temp);
            this.increaseSize();
        }
        // Case # 2: List is not Empty
        else {
            temp.setNext(this.head);
            this.setHead(temp);
            this.increaseSize();
        }
    }

    public void insertAtTail(int _data) {
        ListNode temp = new ListNode(_data);
        // Case # 1: List is Empty
        if(this.isEmpty()) {
            this.setHead(temp);
            this.setTail(temp);
            this.increaseSize();
        }
        // Case # 2: List has One or More Nodes
        else {
            this.tail.setNext(temp);
            this.setTail(temp);
            this.increaseSize();
        }
    }

    public void print() {
        ListNode temp = this.getHead();
        while(temp != null) {
            System.out.print(temp.getData() + " --> ");
            temp = temp.getNext();
        }
        System.out.print("NULL\n");
        System.out.println("List Size: " + this.getSize() + "\n");
    }

    public void insertAtPosition(int _data, int position) {
        ListNode temp = new ListNode(_data);
        if(position < 0 || position > this.getSize()) {
            throw new IndexOutOfBoundsException();
        } else if(position == 0) {
            this.insertAtHead(_data);
        } else if(position == this.getSize()) {
            this.insertAtTail(_data);
        } else {
            ListNode current = this.getHead();
            for(int i = 0; i < (position - 1); i++) {
                current = current.getNext();
            }
            temp.setNext(current.getNext());
            current.setNext(temp);
            this.increaseSize();
        }
    }

    public void deleteHead() {
        // Case # 1: List is Empty
        if(this.isEmpty()) {
            System.out.println("List is Empty! Nothing to Delete!");
            return;
        }
        // Case # 2: List has More than One Node
        else {
            this.setHead(this.head.getNext());
            this.decreaseSize();
        }

        if(this.getHead() == null) {
            this.setTail(null);
        }
    }

    public void deleteTail() {
        if(this.isEmpty()) {
            System.out.println("List is Empty! Nothing to Delete!");
            return;
        } else if(this.getSize() == 1){
            this.setHead(null);
            this.setTail(null);
            this.decreaseSize();
        } else {
            ListNode current = this.getHead();
            while(current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
            this.setTail(current);
            this.decreaseSize();
        }
    }

    public void deleteAtPosition(int position) {
        if(position < 0 || position > this.getSize()) {
            throw new IndexOutOfBoundsException();
        } else if(position == 0) {
            this.deleteHead();
        } else if(position == this.getSize()) {
            this.deleteTail();
        } else {
            ListNode current = this.getHead();
            for(int i = 0; i < (position - 1); i++) {
                current = current.getNext();
            }
            ListNode target = current.getNext();
            current.setNext(target.getNext());
            this.decreaseSize();
        }
    }

    public ListNode search(int _data) {
        if(this.isEmpty()) {
            System.out.println("List is Empty! Nothing to Search!");
            return null;
        } else {
            ListNode current = this.getHead();
            while(current.getData() != _data) {
                current = current.getNext();
            }
            return current;
        }
    }


    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int _data) {
            this.data = _data;
            this.next = null;
        }

        public ListNode(int _data, ListNode _next) {
            this.data = _data;
            this.next = _next;
        }

        public void setData(int _data) {
            this.data = _data;
        }

        public void setNext(ListNode _next) {
            this.next = _next;
        }

        public int getData() {
            return this.data;
        }

        public ListNode getNext() {
            return this.next;
        }
    }

    public static void main(String[] args) {

        // Instantiate Empty SLL
        SLL_4 list = new SLL_4();

        // Insert Nodes into the List
        list.insertAtHead(50);
        list.insertAtHead(40);
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);

        // Print the List
        list.print();

        // Print the Head & Tail Nodes of List
        ListNode temp = list.getHead();
        System.out.println("Head Node: " + temp.getData());
        temp = list.getTail();
        System.out.println("Tail Node: " + temp.getData() + "\n\n");

        // Insert Nodes into the List
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.insertAtTail(80);
        list.insertAtTail(90);
        list.insertAtTail(100);

        // Print the List
        list.print();

        // Print the Head & Tail Nodes of List
        temp = list.getHead();
        System.out.println("Head Node: " + temp.getData());
        temp = list.getTail();
        System.out.println("Tail Node: " + temp.getData() + "\n\n");

        // Insert Nodes into the List by Position
        list.insertAtPosition(0, 0);
        list.insertAtPosition(110, list.getSize());

        // Print the List
        list.print();

        // Print the Head & Tail Nodes of List
        temp = list.getHead();
        System.out.println("Head Node: " + temp.getData());
        temp = list.getTail();
        System.out.println("Tail Node: " + temp.getData() + "\n\n");

        // Insert Nodes into the List by Position
        list.insertAtPosition(55, 6);

        // Print the List
        list.print();

        // Print the Head & Tail Nodes of List
        temp = list.getHead();
        System.out.println("Head Node: " + temp.getData());
        temp = list.getTail();
        System.out.println("Tail Node: " + temp.getData() + "\n\n");

        // Delete the Head Node
        list.deleteHead();

        // Print the List
        list.print();

        // Print the Head & Tail Nodes of List
        temp = list.getHead();
        System.out.println("Head Node: " + temp.getData());
        temp = list.getTail();
        System.out.println("Tail Node: " + temp.getData() + "\n\n");

        // Delete the Tail Node
        list.deleteTail();

        // Print the List
        list.print();

        // Print the Head & Tail Nodes of List
        temp = list.getHead();
        System.out.println("Head Node: " + temp.getData());
        temp = list.getTail();
        System.out.println("Tail Node: " + temp.getData() + "\n\n");

        // Delete the Head Node by Position
        list.deleteAtPosition(0);

        // Print the List
        list.print();

        // Print the Head & Tail Nodes of List
        temp = list.getHead();
        System.out.println("Head Node: " + temp.getData());
        temp = list.getTail();
        System.out.println("Tail Node: " + temp.getData() + "\n\n");

        // Delete the Tail Node by Position
        list.deleteAtPosition(list.getSize());

        // Print the List
        list.print();

        // Print the Head & Tail Nodes of List
        temp = list.getHead();
        System.out.println("Head Node: " + temp.getData());
        temp = list.getTail();
        System.out.println("Tail Node: " + temp.getData() + "\n\n");

        // Delete Node by Position
        list.deleteAtPosition(4);

        // Print the List
        list.print();

        // Print the Head & Tail Nodes of List
        temp = list.getHead();
        System.out.println("Head Node: " + temp.getData());
        temp = list.getTail();
        System.out.println("Tail Node: " + temp.getData() + "\n\n");

        // Search for Node w/ Specific Data & Return the Node
        ListNode found = list.search(30);
        System.out.println("Found Node Data: " + found.getData() + "\n");

        // Clear the SLL
        list.clear();

        // Print the List
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
