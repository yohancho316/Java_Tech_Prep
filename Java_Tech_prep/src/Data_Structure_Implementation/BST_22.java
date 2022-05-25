package Data_Structure_Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST_22 {

    private Node root;

    public BST_22() {
        this.root = null;
    }

    public void insert_iterative(int val) {

        Node node = new Node(val);

        if(this.root == null) {
            this.root = node;
            return;
        }

        Node current = this.root;

        while(current != null) {

            if((val < current.val) && (current.left != null)) {
                current = current.left;
            } else if((val > current.val) && (current.right != null)){
                current = current.right;
            } else if(val < current.val) {
                current.left = node;
                return;
            } else {
                current.right = node;
                return;
            }
        }
    }

    public Node insert(Node current, int val) {

        if(current == null) {
            return new Node(val);
        }

        if(val < current.val) {
            current.left =  insert(current.left, val);
        } else {
            current.right =  insert(current.right, val);
        }

        return current;
    }

    public void insert_recursive(int val) {
        this.root = insert(this.root, val);
    }

    public void preOrder_recurisive(Node current) {

        if(current == null) {
            return;
        }

        System.out.println(current.val);
        preOrder_recurisive(current.left);
        preOrder_recurisive(current.right);
    }

    public void preOrder_iterative(Node current) {
        Stack<Node> stack = new Stack<Node>();
        stack.push(current);
        while(!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.println(temp.val);
            if(temp.right != null) {
                stack.push(temp.right);
            }
            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void inOrder_recursive(Node current) {
        if(current == null) {
            return;
        }

        inOrder_recursive(current.left);
        System.out.println(current.val);
        inOrder_recursive(current.right);
    }

    public void inOrder_iterative(Node current) {
        Stack<Node> stack = new Stack<Node>();
        Node curr = current;

        while(!stack.isEmpty() || curr != null) {
            if(curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                System.out.println(curr.val);
                curr = curr.right;
            }
        }
    }

    public void postOrder_recursive(Node current) {
        if(current == null) {
            return;
        }

        postOrder_recursive(current.left);
        postOrder_recursive(current.right);
        System.out.println(current.val);
    }

    public void postOrder_iterative(Node current) {

        if(current == null) {
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        Node curr = current;

        while(!stack.isEmpty() || curr != null) {
            if(curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                Node temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.val);
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.println(temp.val);
                    }

                } else {
                    curr = temp;
                }
            }
        }
    }

    public void levelOrder_iterative(Node current) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(current);

        while(!queue.isEmpty()) {
            Node curr = queue.remove();
            System.out.println(curr.val);

            if(curr.left != null) {
                queue.add(curr.left);
            }

            if(curr.right != null) {
                queue.add(curr.right);
            }
        }
    }



    public static class Node {
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int getVal() {
            return this.val;
        }

        public Node getLeft() {
            return this.left;
        }

        public Node getRight() {
            return this.right;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setLeft(Node left) {
            this.left = left;
        }
    }

    public static void main(String[] args) {
        BST_22 iterative_tree = new BST_22();
        iterative_tree.insert_iterative(20);
        iterative_tree.insert_iterative(10);
        iterative_tree.insert_iterative(5);
        iterative_tree.insert_iterative(50);

        System.out.println("Iterative Pre-Order Traversal:");
        iterative_tree.preOrder_iterative(iterative_tree.root);
        System.out.println("\n");

        System.out.println("Iterative In-Order Traversal:");
        iterative_tree.inOrder_iterative(iterative_tree.root);
        System.out.println("\n");

        System.out.println("Iterative Post-Order Traversal:");
        iterative_tree.postOrder_iterative(iterative_tree.root);
        System.out.println("\n");

        System.out.println("Iterative Level-Order Traversal:");
        iterative_tree.levelOrder_iterative(iterative_tree.root);
        System.out.println("\n");



        BST_22 recursive_tree = new BST_22();
        recursive_tree.insert_recursive(20);
        recursive_tree.insert_recursive(10);
        recursive_tree.insert_recursive(5);
        recursive_tree.insert_recursive(50);

        System.out.println("Recursive Pre-Order Traversal:");
        recursive_tree.preOrder_recurisive(recursive_tree.root);
        System.out.println("\n");

        System.out.println("Recursive In-Order Traversal:");
        recursive_tree.inOrder_recursive(recursive_tree.root);
        System.out.println("\n");

        System.out.println("Recursive Post-Order Traversal:");
        recursive_tree.postOrder_recursive(recursive_tree.root);
        System.out.println("\n");
    }
}
