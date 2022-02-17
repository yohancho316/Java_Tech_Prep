package Data_Structure_Implementation;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST_8 {

    // Tree Node Class
    public static class TreeNode {

        // Member Attributes
        public int data;
        public TreeNode left;
        public TreeNode right;

        // Default Constructor
        public TreeNode() {}

        // Overloaded Constructor
        public TreeNode(int _data) {
            this.data = _data;
        }

        // Overloaded Constructor
        public TreeNode(int _data, TreeNode _left, TreeNode _right) {
            this.data = _data;
            this.left = _left;
            this.right = _right;
        }
    }

    // Member Attributes
    public TreeNode root;

    // Default Constructor
    public BST_8() {
        this.root = null;
    }

    // Insert Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    // Overloaded Recursive Insert Method
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

    // Recursive Pre Order Traversal (Depth-First)
    public void preOrder_recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            System.out.println("NULL");
            return;
        }

        System.out.println(root.data);
        preOrder_recursive(root.left);
        preOrder_recursive(root.right);
    }

    // Recursive Post Order Traversal (Depth-First)
    public void postOrder_recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            System.out.println("NULL");
            return;
        }

        postOrder_recursive(root.left);
        postOrder_recursive(root.right);
        System.out.println(root.data);
    }

    // Recursive In Order Traversal (Depth-First)
    public void inOrder_recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            System.out.println("NULL");
            return;
        }

        inOrder_recursive(root.left);
        System.out.println(root.data);
        inOrder_recursive(root.right);
    }

    // Iterative In Order Traversal (Depth-First)
    public void inOrder_iterative(TreeNode root) {

        if(root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;

        while(!stack.isEmpty() || temp != null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data);
                temp = temp.right;
            }
        }
    }

    // Iterative Level Order Traversal (Breadth-First)
    public void levelOrder_iterative(TreeNode root) {

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

}
