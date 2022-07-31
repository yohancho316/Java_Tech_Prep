package Data_Structure_Implementation;

import java.util.Stack;

public class BST_25 {

    // Member Attribute
    public Node root;

    // Default Constructor
    public BST_25() {
        this.root = null;
    }

    // Iterative Insert Method
    public void iterativeInsert(int val) {
        if(this.root == null) {
            this.root = new Node(val);
            return;
        }

        Node root = this.root;
        while(root != null) {
            if((val < root.getVal()) && (root.getLeft() != null)) {
                root = root.getLeft();
            } else if((val > root.getVal()) && (root.getRight() != null)) {
                root = root.getRight();
            } else if(val < root.getVal()) {
                root.setLeft(new Node(val));
                return;
            } else {
                root.setRight(new Node(val));
                return;
            }
        }
        return;
    }

    // Recursive Insert Method
    public void recursiveInsert(int val) {
        this.root = insert(this.root, val);
    }

    public Node insert(Node root, int val) {

        // Base Condition
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(val < root.getVal()) {
            root.setLeft(insert(root.getLeft(), val));
        } else {
            root.setRight(insert(root.getRight(), val));
        }

        return root;
    }

    // Recursive Pre-Order Traversal
    public void preOrderRecursive(Node root) {

        // Base Condition
        if(root == null) {
            return;
        }

        System.out.println(root.getVal());
        preOrderRecursive(root.getLeft());
        preOrderRecursive(root.getRight());
    }

    // Iterative Pre-Order Traversal
    public void preOrderIterative(Node root) {
        if(root == null) {
            System.out.println("Empty BST");
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        stack.add(root);

        while(!stack.isEmpty()) {
            root = stack.pop();
            System.out.println(root.getVal());
            if(root.getRight() != null) {
                stack.push(root.getRight());
            }
            if(root.getLeft() != null) {
                stack.push(root.getLeft());
            }
        }
    }

    public static void main(String[] args) {

        BST_25 bst = new BST_25();
        bst.iterativeInsert(100);
        bst.iterativeInsert(50);
        bst.iterativeInsert(150);
        bst.preOrderRecursive(bst.root);

        System.out.println();

        BST_25 bst_2 = new BST_25();
        bst_2.recursiveInsert(100);
        bst_2.recursiveInsert(50);
        bst_2.recursiveInsert(150);
        bst_2.preOrderRecursive(bst_2.root);

        System.out.println();

        bst.preOrderIterative(bst.root);

    }

}
