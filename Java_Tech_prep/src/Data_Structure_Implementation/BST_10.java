package Data_Structure_Implementation;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class BST_10 {

    // TreeNode Class
    public class TreeNode {
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

    // BST_10 Member Attributes
    public TreeNode root;

    // Default Constructor
    public BST_10() {
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

    // Pre-Order Recursive Traversal (Depth-First)
    // Visit Root Node -> Entire Left-Subtree -> Entire Right-Subtree
    public void preOrder_recursive(TreeNode root) {
        // Base Condition
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder_recursive(root.left);
        preOrder_recursive(root.right);
    }

    // Pre-Order Iterative Traversal (Depth-First)
    // Visit Root Node -> Entire Left-Subtree -> Entire Right-Subtree
    public void preOrder_iterative(TreeNode root) {
        if(root == null) {
            return;
        }

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

    // Post-Order Recursive Traversal (Depth-First)
    // Visit Entire Left-Subtree -> Entire Right-Subtree -> Root Node
    public void postOrder_recursive(TreeNode root) {
        // Base Condition
        if(root == null) {
            return;
        }
        postOrder_recursive(root.left);
        postOrder_recursive(root.right);
        System.out.println(root.data);
    }

    // Post-Order Iterative Traversal (Depth-First)
    // Visit Entire Left-Subtree -> Entire Right-Subtree -> Root Node
    public void postOrder_iterative(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(current != null || !stack.isEmpty()) {
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

    // In-Order Recursive Traversal (Depth-First)
    // Visit Entire Left-Subtree -> Root Node -> Entire Right-Subtree
    public void inOrder_recursive(TreeNode root) {
        // Base Condition
        if(root == null) {
            return;
        }
        inOrder_recursive(root.left);
        System.out.println(root.data);
        inOrder_recursive(root.right);
    }

    // In-Order Iterative Traversal (Depth-First)
    // Visit Entire Left-Subtree -> Root Node -> Entire Right-Subtree
    public void inOrder_iterative(TreeNode root) {
        if(root == null) {
            return;
        }

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

    // Level-Order Iterative Traversal (Breadth-First)
    // Visit Each Node Level by Level by Using Queue Data Structure
    public void levelOrder_iterative(TreeNode root) {
        if(root == null) {
            return;
        }

        int level = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode current = queue.remove();
            System.out.println("Level # " + level + " " + current.data);

            if(current.left != null) {
                queue.add(current.left);
            }

            if(current.right != null) {
                queue.add(current.right);
            }
        }
    }

    // Main Method (Insertion Point)
    public static void main(String[] args) {

    }
}
