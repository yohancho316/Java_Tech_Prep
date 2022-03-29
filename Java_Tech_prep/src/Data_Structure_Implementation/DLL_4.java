package Data_Structure_Implementation;

public class DLL_4 {

    private ListNode head;
    private ListNode tail;
    private int size;

    public DLL_4() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void setHead(ListNode node) {
        this.head = node;
    }

    public void setTail(ListNode node) {
        this.tail = node;
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

    public void incrementSize() {
        this.size += 1;
    }

    public void decrementSize() {
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
        if(this.isEmpty()) {
            this.setHead(temp);
            this.setTail(temp);
            this.incrementSize();
        } else {
            temp.setNext(this.getHead());
            temp.setPrevious(null);
            this.getHead().setPrevious(temp);
            this.setHead(temp);
            this.incrementSize();
        }
    }

    public void insertAtTail(int _data) {
        ListNode temp = new ListNode(_data);
        if(this.isEmpty()) {
            this.setHead(temp);
            this.setTail(temp);
            this.incrementSize();
        } else {
            this.getTail().setNext(temp);
            temp.setPrevious(this.getTail());
            temp.setNext(null);
            this.setTail(temp);
            this.incrementSize();
        }
    }

    public void insertAtPosition(int _data, int position) {
        if(position < 0 || position > this.getSize()) {
            throw new IndexOutOfBoundsException();
        } else if(position == 0) {
            this.insertAtHead(_data);
        } else if(position == this.getSize()) {
            this.insertAtTail(_data);
        } else {
            ListNode temp = new ListNode(_data);
            ListNode current = this.getHead();
            for(int i = 0; i < (position - 1); i++) {
                current = current.getNext();
            }
            ListNode target = current.getNext();
            temp.setNext(target);
            target.setPrevious(temp);
            current.setNext(temp);
            this.incrementSize();
        }
    }

    public void deleteHead() {
        if(this.isEmpty()) {
            System.out.println("List is Empty! Nothing to delete!");
            return;
        } else if(this.getSize() == 1) {
            this.setHead(null);
            this.setTail(null);
            this.decrementSize();
        } else {
            this.setHead(this.getHead().getNext());
            this.getHead().setPrevious(null);
            this.decrementSize();
        }
    }

    public void deleteTail() {
        if(this.isEmpty()) {
            System.out.println("List is Empty! Nothing to Delete!");
            return;
        } else if(this.getSize() == 1) {
            this.setHead(null);
            this.setTail(null);
            this.decrementSize();
        } else {
            ListNode current = this.getHead();
            while(current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
            this.decrementSize();
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
            target.getNext().setPrevious(current);
            this.decrementSize();
        }
    }

    public void print() {
        ListNode current = this.getHead();
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.getNext();
        }
        System.out.print("NULL\n");
        System.out.println("List Size: " + this.getSize());
    }

    public ListNode search(int target) {
        if(this.isEmpty()) {
            System.out.println("List is Empty! Nothing to search!");
            return null;
        } else {
            ListNode current = this.getHead();
            while(current.data != target) {
                current = current.getNext();
            }
            return current;
        }
    }

    public class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int _data) {
            this.data = _data;
            this.previous = null;
            this.next = null;
        }

        public int getData() {
            return this.data;
        }

        public ListNode getPrevious() {
            return this.previous;
        }

        public ListNode getNext() {
            return this.next;
        }

        public void setData(int _data) {
            this.data = _data;
        }

        public void setPrevious(ListNode _previous) {
            this.previous = _previous;
        }

        public void setNext(ListNode _next) {
            this.next = _next;
        }
    }

    public static void main(String[] args) {

        // Instantiate Doubly LinkedList Object
        DLL_4 list = new DLL_4();

        // Insert Nodes
        list.insertAtHead(50);
        list.insertAtHead(40);
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);

        // Print the List & Head & Tail Nodes
        list.print();
        ListNode head = list.getHead();
        ListNode tail = list.getTail();
        System.out.println("Head: " + head.data + "\t Tail: " + tail.data + "\n");

        // Insert Nodes
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.insertAtTail(80);
        list.insertAtTail(90);
        list.insertAtTail(100);

        // Print the List & Head & Tail Nodes
        list.print();
        head = list.getHead();
        tail = list.getTail();
        System.out.println("Head: " + head.data + "\t Tail: " + tail.data + "\n");

        // Insert Nodes by Position
        list.insertAtPosition(0, 0);
        list.insertAtPosition(110, list.getSize());
        list.insertAtPosition(55,6);

        // Print the List & Head & Tail Nodes
        list.print();
        head = list.getHead();
        tail = list.getTail();
        System.out.println("Head: " + head.data + "\t Tail: " + tail.data + "\n");

        // Delete the Head Node
        list.deleteHead();

        // Print the List & Head & Tail Nodes
        list.print();
        head = list.getHead();
        tail = list.getTail();
        System.out.println("Head: " + head.data + "\t Tail: " + tail.data + "\n");

        // Create New Doubly Linked List
        DLL_4 list2 = new DLL_4();
        list2.insertAtHead(100);

        // Delete the Head Node of List2
        list2.deleteHead();

        // Print the List & Head & Tail Nodes
        list2.print();
        System.out.println();

        // Insert Nodes into List2
        list2.insertAtHead(200);
        list2.insertAtHead(100);

        // Print the List & Head & Tail Nodes
        list2.print();
        head = list2.getHead();
        tail = list2.getTail();
        System.out.println("Head: " + head.data + "\t Tail: " + tail.data + "\n");

        // Delete the Tail Node in List2
        list2.deleteTail();

        // Print the List & Head & Tail Nodes
        list2.print();
        head = list2.getHead();
        tail = list2.getTail();
        System.out.println("Head: " + head.data + "\t Tail: " + tail.data + "\n");

        // Delete the Tail node
        list.deleteTail();

        // Print the List & Head & Tail Nodes
        list.print();
        head = list.getHead();
        tail = list.getTail();
        System.out.println("Head: " + head.data + "\t Tail: " + tail.data + "\n");


        // Delete Node at Given Position
        list.deleteAtPosition(5);

        // Print the List & Head & Tail Nodes
        list.print();
        head = list.getHead();
        tail = list.getTail();
        System.out.println("Head: " + head.data + "\t Tail: " + tail.data + "\n");

        // Search for Node w/ Target Data
        ListNode target = list.search(50);
        System.out.println("Found Node w/ Value: " + target.data);

        // Clear List & List2
        list.clear();
        list2.clear();

        // Check if Clear
        System.out.println();
        list.print();
        list2.print();
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
- Search List & Return Node w/ Specified Data *
 */
