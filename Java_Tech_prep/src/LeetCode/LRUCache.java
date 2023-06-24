package LeetCode;
import java.util.*;

public class LRUCache {

    public ListNode head;
    public ListNode tail;
    public Map<Integer,ListNode> map;
    int size;
    public int maxSize;

    public LRUCache(int capacity) {
        this.head = null;
        this.tail = null;
        this.map = new HashMap<Integer,ListNode>();
        this.size = 0;
        this.maxSize = capacity;
    }

    public void put(int key, int value) {

        if(map.containsKey(key)) {
//           System.out.println("Executes 1");
            map.get(key).val = value;
            // If Head Key == Key
            if(head.key == key) {
                return;
            }
            // If Tail Key == Key
            else if(tail.key == key) {
                ListNode previous = tail.prev;
                previous.next = null;
                tail.prev = null;
                tail.next = head;
                head.prev = tail;
                head = tail;
                tail = previous;
            } else {
                ListNode previous = map.get(key).prev;
                ListNode next = map.get(key).next;
                previous.next = next;
                next.prev = previous;
                map.get(key).prev = null;
                map.get(key).next = head;
                head.prev = map.get(key);
                head = map.get(key);
            }
            return;
        }

        if(!map.containsKey(key) && size == maxSize) {
//            System.out.println("Executes 2");
            ListNode node = new ListNode(key,value);
            if(maxSize == 1) {
                map.clear();
                map.put(key, node);
                head = node;
                tail = node;
            } else {
                map.remove(tail.key);
                map.put(key,node);
                ListNode previous = tail.prev;
                previous.next = null;
                tail.prev = null;
                node.next = head;
                head.prev = node;
                head = node;
                tail = previous;
            }
            return;
        }

        if(!map.containsKey(key) && size < maxSize) {
//            System.out.println("Executes 3");
            ++size;
            ListNode node = new ListNode(key,value);
            if(map.isEmpty()) {
                map.put(key, node);
                head = node;
                tail = node;
            } else {
                map.put(key,node);
                node.next = head;
                head.prev = node;
                head = node;
            }
            return;
        }
    }

    public int get(int key) {

        if(!map.containsKey(key)) {
//            System.out.println("Get 1");
            return -1;
        }else if(head.key == key) {
//            System.out.println("Get 2");
            return head.val;
        } else if(tail.key == key) {
//            System.out.println("Get 3");
            ListNode previous = tail.prev;
            previous.next = null;
            tail.prev = null;
            tail.next = head;
            head.prev = tail;
            head = tail;
            tail = previous;
            return head.val;
        } else {
//            System.out.println("Get 4");
            ListNode previous = map.get(key).prev;
            ListNode next = map.get(key).next;
            previous.next = next;
            next.prev = previous;
            map.get(key).next = head;
            map.get(key).prev = null;
            head.prev = map.get(key);
            head = map.get(key);
            return head.val;
        }
    }

    public class ListNode {
        public int key;
        public int val;
        public ListNode next;
        public ListNode prev;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(3);
        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);
        System.out.println("Key (1) = " + lru.get(1));
        System.out.println("Key (2) = " + lru.get(2));
        System.out.println("Key (3) = " + lru.get(3));
        System.out.println();

        System.out.println("Head = " + lru.head.key);
        System.out.println("Middle = " + lru.head.next.key);
        System.out.println("Tail = " + lru.tail.key);
        System.out.println();

        lru.put(1,2);
        lru.put(2,3);
        lru.put(3,4);
        System.out.println("Key (1) = " + lru.get(1));
        System.out.println("Key (2) = " + lru.get(2));
        System.out.println("Key (3) = " + lru.get(3));
        System.out.println();

        System.out.println("Head = " + lru.head.key);
        System.out.println("Middle = " + lru.head.next.key);
        System.out.println("Tail = " + lru.tail.key);
        System.out.println();

        System.out.println("Key (2) = " + lru.get(2));
        System.out.println();

        System.out.println("Head = " + lru.head.key);
        System.out.println("Middle = " + lru.head.next.key);
        System.out.println("Tail = " + lru.tail.key);
        System.out.println();







    }
}
