package Data_Structure_Implementation;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BST_15 {

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

    // BST_15 Member Attributes
    public TreeNode root;

    // Default Constructor
    public BST_15() {
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

    // Recursive Search Method
    public TreeNode exists(TreeNode root, int _data) {

        if(root == null) {
            return null;
        } else if(root.data == _data) {
            return root;
        } else if(_data < root.data) {
            return exists(root.left, _data);
        } else {
            return exists(root.right, _data);
        }
    }

    // Pre-Order Recursive BST Traversal Method (Depth-First)
    public void preOrder_Recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder_Recursive(root.left);
        preOrder_Recursive(root.right);
    }

    // Pre-Order Iterative BST Traversal Method (Depth-First)
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

    // In-Order Recursive BST Traversal Method (Depth-First)
    public void inOrder_Recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        inOrder_Recursive(root.left);
        System.out.println(root.data);
        inOrder_Recursive(root.right);
    }

    // In-Order Iterative BST Traversal Method (Depth-First)
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

    // Post-Order Recursive BST Traversal Method (Depth-First)
    public void postOrder_Recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        postOrder_Recursive(root.left);
        postOrder_Recursive(root.right);
        System.out.println(root.data);
    }

    // Post-Order Iterative BST Traversal Method (Depth-First)
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

    // Delete Node Method
    public TreeNode delete(TreeNode root, int target) {

        if(root == null) {
            return null;
        } else if(target < root.data) {
            root.left = delete(root.left, target);
        } else if(target > root.data) {
            root.right = delete(root.right, target);
        } else {

            // Case # 1: Target Node Has No Child Nodes
            if(root.left == null && root.right == null) {
                return null;
            }

            // Case # 2: Target Node Has One Child Node
            else if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // Case # 3: Target Node has Two Child Nodes
            else {

                // Choose to Replace Target Node w/ Maximum Node of Left Subtree
                return findMin_RightSubtree(root);

                // Choose to Replace Target Node w/ Minimum NOde of Right Subtree
            }
        }

        return root;
    }

    // Find Min Node of Left Subtree Method
    public TreeNode findMin_RightSubtree(TreeNode root) {
        return root.right;
    }

    // Find Max Node of Right Subtree Method
    public TreeNode findMax_LeftSubtree(TreeNode root) {
        // Base Condition
        TreeNode temp = root;

        while(temp.right != null) {
            temp = temp.right;
        }

        return temp;

    }

    public static void main(String[] args) {

        // Create BST
        BST_15 tree = new BST_15();
        tree.insert(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(20);
        tree.insert(15);
        tree.insert(30);

        System.out.println("Pre-Order Recursive Traversal of BST (Depth First):");
        tree.preOrder_Recursive(tree.root);

        System.out.println("\nPre-Order Iterative Traversal of BST (Depth First):");
        tree.preOrder_Iterative(tree.root);

        System.out.println("\nIn-Order Recursive Traversal of BST (Depth First):");
        tree.inOrder_Recursive(tree.root);

        System.out.println("\nIn-Order Iterative Traversal of BST (Depth First):");
        tree.inOrder_Iterative(tree.root);

        System.out.println("\nPost-Order Recursive Traversal of BST (Depth First):");
        tree.postOrder_Recursive(tree.root);

        System.out.println("\nPost-Order Iterative Traversal of BST (Depth First):");
        tree.postOrder_Iterative(tree.root);

        System.out.println("\nLevel-Order Iterative Traversal of BST (Breadth-First):");
        tree.levelOrder_Iterative(tree.root);

        System.out.println("\nDelete Leaf Node w/ No Child Nodes:");
        tree.delete(tree.root, 3);
        tree.levelOrder_Iterative(tree.root);

        System.out.println("\nDelete Parent Node w/ One Child Node:");
        tree.delete(tree.root, 5);
        tree.levelOrder_Iterative(tree.root);

        System.out.println("\nDelete Parent Node w/ Two Child Nodes:");
        tree.delete(tree.root, 20);
        tree.levelOrder_Iterative(tree.root);
        // ** Missing Node 15



    }
}
