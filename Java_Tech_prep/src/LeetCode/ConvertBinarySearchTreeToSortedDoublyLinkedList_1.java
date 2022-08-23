package LeetCode;

import java.util.Stack;

public class ConvertBinarySearchTreeToSortedDoublyLinkedList_1 {

    // Node Class
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }


    public static Node treeToDoublyList(Node root) {

        if(root == null) return root;

        Node head = null;
        Node current = null;
        Stack<Node> stack = new Stack<Node>();
        while(!stack.isEmpty() || root != null) {
            if(root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                Node temp = new Node(root.val);

                if(head == null) {
                    head = temp;
                    current = temp;
                } else {
                    current.right = temp;
                    temp.left = current;
                    current = current.right;
                    current.right = null;
                }

                root = root.right;
            }
        }

        current.right = head;
        head.left = current;

        return head;
    }


    public static void main(String[] args) {
        // Create the BST
        Node a1 = new Node(5);
        Node a2 = new Node(2);
        Node a3 = new Node(1);
        Node a4 = new Node(3);
        Node a5 = new Node(8);
        Node a6 = new Node(7);
        Node a7 = new Node(10);

        a1.left = a2;
        a2.left = a3;
        a2.right = a4;
        a1.right = a5;
        a5.left = a6;
        a5.right = a7;

        Node head = treeToDoublyList(a1);
        System.out.println("Head Val: " + head.val);
        System.out.println("Head Left: " + head.left.val);
        System.out.println("Head Right: " + head.right.val);


    }
}
