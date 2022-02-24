package Data_Structure_Implementation;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BST_11 {

    // Tree Node Class
    public static class TreeNode {

        // Tree Node Member Attributes
        public int data;
        public TreeNode left;
        public TreeNode right;

        // Overloaded Constructor
        public TreeNode(int _data) {
            this.data = _data;
        }
    }

    // BST_11 Member Attributes
    public TreeNode root;

    // Default Constructor
    public BST_11() {
        this.root = null;
    }

    // Insert Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    // Overloaded Recursive Insert Method
    public TreeNode insert(TreeNode root, int _data) {
        if(root == null) {
            root = new TreeNode(_data);
            return root;
        } else if(_data < root.data) {
            root.left = insert(root.left, _data);
        } else {
            root.right = insert(root.right, _data);
        }
        return root;
    }

    // Pre-Order Recursive Traversal (Depth-First)
    // Root Node -> Left SubTree -> Right SubTree
    public static void preOrder_recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder_recursive(root.left);
        preOrder_recursive(root.right);
    }

    // Pre-Order Iterative Traversal (Depth-First)
    // Root Node -> Left SubTree -> Right SubTree
    public static void preOrder_iterative(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.println(current.data);

            if(current.right != null) {
                stack.push(current.right);
            }

            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }

    // In-Order Recursive Traversal (Depth-First)
    // Left Subtree -> Root Node -> Right Subtree
    public static void inOrder_recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        inOrder_recursive(root.left);
        System.out.println(root.data);
        inOrder_recursive(root.right);
    }

    // In-Order Iterative Traversal (Depth-First)
    // Left Subtree -> Root Node -> Right Subtree
    public static void inOrder_iterative(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {

            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                System.out.println(current.data);
                current = current.right;
            }
        }
    }

    // Post-Order Recursive Traversal (Depth-First)
    // Left Subtree -> Right Subtree -> Root Node
    public static void postOrder_recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        postOrder_recursive(root.left);
        postOrder_recursive(root.right);
        System.out.println(root.data);
    }

    // Post-Order Iterative Traversal (Depth-First)
    // Left Subtree -> Right Subtree -> Root Node
    public static void postOrder_iterative(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.data);

                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.println(temp.data);
                    }

                } else {
                    current = temp;
                }
            }
        }
    }

    // Level-Order Iterative Traversal (Breadth-First)
    // Level by Level
    public static void levelOrder_iterative(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode current = queue.remove();
            System.out.println(current.data);

            if(current.left != null) {
                queue.add(current.left);
            }

            if(current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {

        BST_11 tree = new BST_11();
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(1);


        System.out.println("Recursive Pre-Order Traversal of BST");
        preOrder_recursive(tree.root);

        System.out.println("\nIterative Pre-Order Traversal of BST");
        preOrder_iterative(tree.root);

        System.out.println("\nRecursive In-Order Traversal of BST");
        inOrder_recursive(tree.root);

        System.out.println("\nIterative In-Order Traversal of BST");
        inOrder_iterative(tree.root);

        System.out.println("\nRecursive Post-Order Traversal of BST");
        postOrder_recursive(tree.root);

        System.out.println("\nIterative Post-Order Traversal of BST");
        postOrder_iterative(tree.root);

        System.out.println("\nIterative Level-Order Traversal of BST");
        levelOrder_iterative(tree.root);
    }
}
