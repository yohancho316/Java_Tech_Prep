package Data_Structure_Implementation;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BST_14 {

    // TreeNode Class
    public class TreeNode {
        // Member Attributes
        public int data;
        public TreeNode left;
        public TreeNode right;

        // Overloaded Constructor
        public TreeNode(int _data) {
            this.data = _data;
        }
    }

    // BST_14 Member Attributes
    public TreeNode root;

    // Default Constructor
    public BST_14() {
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

    // Find Data in TreeNode Recursively
    public boolean exists(TreeNode root, int _data) {
        if(root == null) {
            return false;
        } else if(root.data == _data) {
            return true;
        } else if(_data < root.data) {
            return exists(root.left, _data);
        } else {
            return exists(root.right, _data);
        }
    }

    // Pre-Order Recursive Traversal of BST (Depth-First)
    public void preOrder_recursive(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder_recursive(root.left);
        preOrder_recursive(root.right);
    }

    // Pre-Order Iterative Traversal of BST (Depth-First)
    public void preOrder_iterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.data);

            if(temp.right != null) {
                stack.push(temp.right);
            }

            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    // In-Order Recursive Traversal of BST (Depth-First)
    public void inOrder_recursive(TreeNode root) {
        // Base Condition
        if(root == null) {
            return;
        }

        inOrder_recursive(root.left);
        System.out.println(root.data);
        inOrder_recursive(root.right);
    }

    // In-Order Iterative Traversal of BST (Depth-First)
    public void inOrder_iterative(TreeNode root) {
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

    // Post-Order Recursive Traversal of BST (Depth-First)
    public void postOrder_recursive(TreeNode root) {
        // Base Condition
        if(root == null) {
            return;
        }

        postOrder_recursive(root.left);
        postOrder_recursive(root.right);
        System.out.println(root.data);
    }

    // Post-Order Iterative Traversal of BST (Depth-First)
    public void postOrder_iterative(TreeNode root) {
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

                    while(!stack.isEmpty() && (temp == stack.peek().right)) {
                        temp = stack.pop();
                        System.out.println(temp.data);
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    // Level-Order Iterative Traversal of BST (Breadth-First)
    public void levelOrder(TreeNode root) {
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
        BST_14 tree = new BST_14();
        tree.insert(20);
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(19);
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(90);

        // Check if Key Exists in BST
        System.out.println(tree.exists(tree.root, 7));

        // Traverse BST w/ Pre-Order Recursive Traversal
        System.out.println("\nPre-Order Recursive Traversal:");
        tree.preOrder_recursive(tree.root);

        // Traverse BST w/ Pre-Order Iterative Traversal
        System.out.println("\nPre-Order Iterative Traversal:");
        tree.preOrder_iterative(tree.root);

        // Traverse BST w/ In-Order Recursive Traversal
        System.out.println("\nIn-Order Recursive Traversal:");
        tree.inOrder_recursive(tree.root);

        // Traverse BST w/ In-Order Iterative Traversal
        System.out.println("\nIn-Order Iterative Traversal:");
        tree.inOrder_iterative(tree.root);

        // Traverse BST w/ Post-Order Recursive Traversal
        System.out.println("\nPost-Order Recursive Traversal:");
        tree.postOrder_recursive(tree.root);

        // Traverse BST w/ Post-Order Iterative Traversal
        System.out.println("\nPost-Order Iterative Traversal:");
        tree.postOrder_iterative(tree.root);

        // Traverse BST w/ Level-Order Iterative Traversal
        System.out.println("\nLevel-Order Iterative Traversal:");
        tree.levelOrder(tree.root);
    }
}
