package Data_Structure_Implementation;

// Linked List Data Structure Implementation
public class SLL_1 {

    // Singly Linked List Member Attributes
    private ListNode head;
    private ListNode tail;
    private int size;

    // Default Constructor
    public SLL_1() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insert Node at Head
    public void insertFirst(int _data) {

        ListNode node = new ListNode(_data);
        node.next = this.head;
        this.head = node;

        if(this.tail == null) {
            this.tail = node;
        }

        this.size += 1;
    }

    // Insert Node at Tail
    public void insertLast(int _data) {

        if(this.head == null && this.tail == null) {
            this.insertFirst(_data);
        }

        ListNode node = new ListNode(_data);
        ListNode temp = this.head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        this.tail = node;
        this.size += 1;
    }

    // Get the Head Node
    public ListNode getHead() {
        return this.head;
    }

    // Get the Tail Node
    public ListNode getTail() {
        return this.tail;
    }

    // Print the Linked List
    public void print() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Get Size Method
    public int getSize() {
        return this.size;
    }

    // Remove Head Method
    public void removeFirst() {
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

    // Remove Tail Method
    public void removeLast() {
        if(this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            ListNode temp = this.head;
            while(temp.next != this.tail) {
                temp = temp.next;
            }

            temp.next = null;
            this.tail = temp;
        }

        if(this.size > 0) {
            this.size -= 1;
        }
    }

    // List Node Class
    private static class ListNode {
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

        // Getter Methods
        public int getData() {
            return this.data;
        }

        public ListNode getNext() {
            return this.next;
        }

        // Setter Methods
        public void setData(int _data) {
            this.data = _data;
        }

        public void setNext(ListNode _next) {
            this.next = _next;
        }
    }

    public static void main(String[] args) {

        // Create Singly Linked List
        SLL_1 list = new SLL_1();

        // Insert Nodes into List at Front
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        // Print the List
        System.out.println("\nThere are " + list.getSize() + " number of Nodes in the List currently.");
        list.print();

        // Insert Nodes into List at End
        list.insertLast(60);
        list.insertLast(70);
        list.insertLast(80);
        list.insertLast(90);
        list.insertLast(100);

        // Print the List
        System.out.println("\nThere are " + list.getSize() + " number of Nodes in the List currently.");
        list.print();

        // Remove the Head Node
        System.out.println("\nRemove the Head Node:");
        list.removeFirst();
        System.out.println("There are " + list.getSize() + " number of Nodes in the List currently.");
        list.print();


        // Remove the Tail Node
        System.out.println("\nRemove the Tail Node:");
        list.removeLast();
        System.out.println("There are " + list.getSize() + " number of Nodes in the List currently.");
        list.print();
    }
}

/*

Following are the LinkedList methods implemented

isEmpty() : method returns true if the list is empty

getHead() : returns head node

addToEnd() : method to add a node at the end

display() : method to display all the elements of the Linked List

length() : method that returns the length of the Linked List

insert() : method to insert element at a given position in the Linked List

deleteByPosition() : method to delete a element at a given position

deleteByData() : method to delete a data element

findMin() : method that returns the max element

findMax() : method that returns the min element

countOccurences() : method that returns the occurences of an element

pop() : pop method removes last element of the Linked List

tostring() : method that returns a string of all elements of the String

copy() : method that returns the copy of the list

clear() : method that clears the Linked List

reverse() : method that returns reversed linked list

convertToArray() : returns a array of elements of Linked List

findElement() : method that returns index of a particular element

getElement() : method that returns element at a particular position

makeDummyList() : creates a dummy list comtaining numbers from 2 to 10
 */