package Data_Structure_Implementation;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BST_17 {

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

    // BST_17 Member Attributes
    public TreeNode root;

    // Default Constructor
    public BST_17() {
        this.root = null;
    }

    // Insert Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    // Recursive & Overloaded Insert Method
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

    // Recursive Search Method
    public TreeNode search(TreeNode root, int target) {

        if(root == null) {
            return null;
        } else if(target < root.data) {
            return search(root.left, target);
        } else if(target > root.data) {
            return search(root.right, target);
        } else {
            return root;
        }
    }

    // Pre-Order Recursive Traversal (Depth-First)
    public void preOrder_Recursive(TreeNode root) {
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

    // Delete Target Node Recursively Method
    public TreeNode deleteNode(TreeNode root, int target) {

        if(root == null) {
            return null;
        } else if(target < root.data) {
            root.left = deleteNode(root.left, target);
        } else if(target > root.data) {
            root.right = deleteNode(root.right, target);
        } else {

            // Case # 0: Target Node has NO Child Nodes
            if(root.left == null && root.right == null) {
                return null;
            }

            // Case # 1: Target Node has ONE Child Node
            else if(root.right == null) {
                return root.left;
            } else if(root.left == null) {
                return root.right;
            }

            // Case # 2: Target Node has TWO Child Nodes

            // Scenario # 1: Delete & Replace Target Node w/ Maximum Node in Right Subtree
//            else {
//
//                TreeNode temp = findMinNode(root.right);
//                root.data = temp.data;
//                root.right = deleteNode(root.right, temp.data);
//
//            }

            // Scenario # 2: Delete & Replace Target Node w/ Maximum Node in Left Subtree
            else {

                TreeNode temp = findMaxNode(root.left);
                root.data = temp.data;
                root.left = deleteNode(root.left, temp.data);

            }
        }

        return root;
    }

    // Returns the TreeNode Object Reference of the Maximum Node in the Subtree
    public TreeNode findMaxNode(TreeNode root) {

        while(root.right != null) {
            root = root.right;
        }

        return root;
    }

    // Returns the TreeNode Object Reference of the Minimum Node in the Subtree
    public TreeNode findMinNode(TreeNode root) {

        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {

        // Create Binary Search Tree & Insert Nodes
        BST_17 tree = new BST_17();
        tree.insert(10);
        tree.insert(5);
        tree.insert(1);
        tree.insert(7);
        tree.insert(20);
        tree.insert(15);
        tree.insert(13);
        tree.insert(17);
        tree.insert(12);
        tree.insert(14);
        tree.insert(16);
        tree.insert(19);
        tree.insert(30);
        tree.insert(35);

        // Find Node w/ Target Key & Return Reference of Said Node
        TreeNode temp = tree.search(tree.root, 15);
        System.out.println(temp.data);

        // Traverse BST w/ Recursive Pre-Order Traversal
        System.out.println("\nTraverse BST in Recursive Pre-Order Traversal:");
        tree.preOrder_Recursive(tree.root);

        // Traverse BST w/ Iterative Pre-Order Traversal
        System.out.println("\nTraverse BST in Iterative Pre-Order Traversal:");
        tree.preOrder_Iterative(tree.root);

        // Traverse BST w/ Recursive In-Order Traversal
        System.out.println("\nTraverse BST in Recursive In-Order Traversal:");
        tree.inOrder_Recursive(tree.root);

        // Traverse BST w/ Iterative In-Order Traversal
        System.out.println("\nTraverse BST In Iterative In-Order Traversal:");
        tree.inOrder_Iterative(tree.root);

        // Traverse BST w/ Recursive Post-Order Traversal
        System.out.println("\nTraverse BST in Recursive Post-Order Traversal:");
        tree.postOrder_Recursive(tree.root);

        // Traverse BST w/ Iterative Post-Order Traversal
        System.out.println("\nTraverse BST in Iterative Post-Order Traversal:");
        tree.postOrder_Iterative(tree.root);

        // Traverse BST w/ Iterative Level-Order Traversal
        System.out.println("\nTraverse BST in Iterative Level-Order Traversal:");
        tree.levelOrder_Iterative(tree.root);

        // Delete BST Node w/ NO Child Nodes
        System.out.println("\nDeleting Parent Node w/ NO Child Nodes:");
        tree.deleteNode(tree.root, 1);
        tree.inOrder_Iterative(tree.root);

        // Delete BST Node w/ ONE Child Node
        System.out.println("\nDeleting Parent Node w/ ONE Child Node:");
        tree.deleteNode(tree.root, 30);
        tree.levelOrder_Iterative(tree.root);

        // Delete BST Node w/ TWO Child Nodes
        System.out.println("\nDeleting Parent Node w/ TWO Child Nodes:");
        tree.deleteNode(tree.root, 15);
        tree.inOrder_Iterative(tree.root);
    }

}
