package Data_Structure_Implementation;
import java.util.Queue;
import java.util.LinkedList;

public class BST_7 {

    // Tree Node Class
    public static class TreeNode {

        // Tree Node Attributes
        public int data;
        public TreeNode left;
        public TreeNode right;

        // Default Constructor
        public TreeNode() {}

        // Overloaded Constructor
        public TreeNode(int _data) {
            this.data = _data;
            this.left = null;
            this.right = null;
        }
    }

    // BST Member Attributes
    public TreeNode root;

    // Default Constructor
    public BST_7() {
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

    // Pre-Order Recursive Traversal of BST (Depth-First)
    public void preOrder(TreeNode root) {
        // Base Condition
        if(root == null) {
            System.out.println("NULL");
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // Post-Order Recursive Traversal of BST (Depth-First)
    public void postOrder(TreeNode root) {
        // Base Condition
        if(root == null) {
            System.out.println("NULL");
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    // In-Order Recursive Traversal of BST (Depth-First)
    public void inOrder(TreeNode root) {
        // Base Condition
        if(root == null) {
            System.out.println("NULL");
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    // Level-Order Iterative Traversal of BST (Breadth-First)
    public void levelOrder(TreeNode root) {

        if(root == null) {
            return;
        }

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


    public static void main(String[] args) {
        BST_7 tree = new BST_7();
        tree.insert(5);
        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(10);
        tree.insert(8);

        tree.levelOrder(tree.root);
    }
}
