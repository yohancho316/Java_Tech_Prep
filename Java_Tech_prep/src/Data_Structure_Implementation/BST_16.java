package Data_Structure_Implementation;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BST_16 {

    // Tree Node Class
    public class TreeNode {
        // Member Attributes
        public int data;
        public TreeNode left;
        public TreeNode right;

        // Overloaded Constructor
        public TreeNode(int _data) {
            this.data = _data;
            this.left = null;
            this.right = null;
        }
    }

    // BST_16 Member Attributes
    public TreeNode root;

    // Default Constructor
    public BST_16() {
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

    // Exists Method
    public Boolean exists(TreeNode root, int _target) {
        if(root == null) {
            return false;
        } else if(_target == root.data) {
            return true;
        } else if(_target < root.data) {
            return exists(root.left, _target);
        } else {
            return exists(root.right, _target);
        }
    }

    // Pre-Order Recursive Traversal (Depth-First)
    public void preOrder_Recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder_Recursive(root.left);
        preOrder_Recursive(root.right);
    }

    // Pre-Order Iterative Traversal (Depth-First)
    public void preOrder_Iterative(TreeNode root) {

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

    // In-Order Recursive Traversal (Depth-First)
    public void inOrder_Recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        inOrder_Recursive(root.left);
        System.out.println(root.data);
        inOrder_Recursive(root.right);
    }

    // In-Order Iterative Traversal (Depth-First)
    public void inOrder_Iterative(TreeNode root) {

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

    // Post-Order Recursive Traversal (Depth-First)
    public void postOrder_Recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        postOrder_Recursive(root.left);
        postOrder_Recursive(root.right);
        System.out.println(root.data);
    }

    // Post-Order Iterative Traversal (Depth-First)
    public void postOrder_Iterative(TreeNode root) {

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
    public void levelOrder_Iterative(TreeNode root) {

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

    // Recursive Delete Node Method
    public TreeNode delete(TreeNode root, int target) {

        // Base Condition
        if(root == null) {
            return null;
        } else if(target < root.data) {
            root.left = delete(root.left, target);
        } else if(target > root.data) {
            root.right = delete(root.right, target);
        } else {

            // Case # 0: Target Node Has NO Child Nodes
            if(root.left == null && root.right == null) {
                // Removes the Reference of the Target Node & Returns Null
                return null;
            }
            // Case # 1: Target Node Has Only ONE Child Node
            else if(root.left == null) {
                // Removes the Reference of the Target Node by Returning Reference of Right Node
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            // Case # 2: Target Node Has TWO Child Nodes
            else {
                TreeNode temp = findMin(root.right);
                root.data = temp.data;
                delete(root.right, temp.data);
            }
        }

        return root;
    }

    // Method to Find Largest Node in Given Subtree
    public TreeNode findMax(TreeNode root) {

        while(root.right != null) {
            root = root.right;
        }

        return root;
    }

    // Method to Find Smallest Node in Given Subtree
    public TreeNode findMin(TreeNode root) {

        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {

        BST_16 tree = new BST_16();
        tree.insert(15);
        tree.insert(7);
        tree.insert(1);
        tree.insert(9);
        tree.insert(10);
        tree.insert(20);
        tree.insert(17);
        tree.insert(30);

        // Check Exists Method
        System.out.println("Checking Exists Method");
        System.out.println(tree.exists(tree.root,9));
        System.out.println(tree.exists(tree.root, 50));

        // Traverse BST w/ Recursive Pre-Order Traversal
        System.out.println("\nRecursive Pre-Order Traversal:");
        tree.preOrder_Recursive(tree.root);

        // Traverse BST w/ Iterative Pre-Order Traversal
        System.out.println("\nIterative Pre-Order Traversal:");
        tree.preOrder_Iterative(tree.root);

        // Traverse BST w/ Recursive In-Order Traversal
        System.out.println("\nRecursive In-Order Traversal:");
        tree.inOrder_Recursive(tree.root);

        // Traverse BST w/ Iterative In-Order Traversal
        System.out.println("\nIterative In-Order Traversal:");
        tree.inOrder_Iterative(tree.root);

        // Traverse BST w/ Recursive Post-Order Traversal
        System.out.println("\nRecursive Post-Order Traversal:");
        tree.postOrder_Recursive(tree.root);

        // Traverse BST w/ Iterative Post-Order Traversal
        System.out.println("\nIterative Post-Order Traversal:");
        tree.postOrder_Iterative(tree.root);

        // Traverse BST w/ Iterative Level-Order Traversal
        System.out.println("\nIterative Level-Order Traversal:");
        tree.levelOrder_Iterative(tree.root);

        // Delete Node w/ NO Child Nodes
        System.out.println("\nDeleting Node w/ NO Child Nodes:");
        tree.delete(tree.root, 1);
        tree.levelOrder_Iterative(tree.root);

        // Delete Node w/ ONE Child Node
        System.out.println("\nDeleting Node w/ ONE Child Node:");
        tree.delete(tree.root, 9);
        tree.levelOrder_Iterative(tree.root);

        // Delete Node w/ TWO Child NOdes
        System.out.println("\nDeleting Node w/ TWO Child Nodes:");
        tree.delete(tree.root, 20);
        tree.levelOrder_Iterative(tree.root);
    }
}
