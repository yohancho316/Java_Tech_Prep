package Data_Structure_Implementation;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class BST_9 {

    public class TreeNode {
        // Member Attributes
        public int data;
        public TreeNode left;
        public TreeNode right;

        // Default Constructor
        public TreeNode(){}

        // Overloaded Constructor
        public TreeNode(int _data) {
            this.data = _data;
        }

        public TreeNode(int _data, TreeNode _left, TreeNode _right) {
            this.data = _data;
            this.left = _left;
            this.right = _right;
        }
    }

    // BST_9 Member Attributes
    public TreeNode root;

    // Default Constructor
    public BST_9() {
        this.root = null;
    }

    // Insert Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    // Recursive Insert Method
    public TreeNode insert(TreeNode root, int _data) {
        // Base Condition
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

    // Recursive Pre-Order Traversal (Depth-First)
    public void preOrder_recursive(TreeNode root) {
        // Base Condition
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder_recursive(root.left);
        preOrder_recursive(root.right);
    }

    // Recursive Post-Order Traversal (Depth-First)
    public void postOrder_recursive(TreeNode root) {
        // Base Condition
        if(root == null) {
            return;
        }

        postOrder_recursive(root.left);
        postOrder_recursive(root.right);
        System.out.println(root.data);
    }

    // Recursive In-Order Traversal (Depth-First)
    public void inOrder_recursive(TreeNode root) {
        // Base Condition
        if(root == null) {
            return;
        }

        inOrder_recursive(root.left);
        System.out.println(root.data);
        inOrder_recursive(root.right);
    }

    // Iterative Level-Order Traversal (Breadth-First)
    public void levelOrder_iterative(TreeNode root) {
        // Local Declarations
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()) {

            TreeNode temp = queue.remove();
            System.out.println(temp.data);

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    // Iterative In-Order Traversal (Depth-First)
    public void inOrder_Iterative(TreeNode root) {
        // Local Declarations
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

    public static void main(String[] args) {
        BST_9 tree = new BST_9();
        tree.insert(5);
        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(7);
        tree.insert(10);
        tree.insert(6);

        System.out.println("Printing BST w/ Recursive Pre Order Traversal");
        tree.preOrder_recursive(tree.root);

        System.out.println("\n\nPrinting BST w/ Recursive Post Order Traversal");
        tree.postOrder_recursive(tree.root);

        System.out.println("\n\nPrinting BST w/ Recursive In Order Traversal");
        tree.inOrder_recursive(tree.root);

        System.out.println("\n\nPrinting BST w/ Iterative Level Order Traversal");
        tree.levelOrder_iterative(tree.root);

        System.out.println("\n\nPrinting BST w/ Iterative Level Order Traversal");
        tree.inOrder_Iterative(tree.root);
    }
}
