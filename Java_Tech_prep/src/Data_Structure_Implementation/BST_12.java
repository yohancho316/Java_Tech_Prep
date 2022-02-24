package Data_Structure_Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BST_12 {

    // Tree Node Class
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

    // BST_12 Member Attributes
    public TreeNode root;
    public List<Integer> list;

    // Default Constructor
    public BST_12() {
        this.root = null;
        this.list = new ArrayList<Integer>();
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

    // Pre-Order BST Recursive Traversal (Depth-First)
    // Root Node -> Left SubTree -> Right SubTree
    public void preOrder_recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        list.add(root.data);
        preOrder_recursive(root.left);
        preOrder_recursive(root.right);
    }

    // Pre-Order BST Iterative Traversal (Depth-First)
    // Root Node -> Left SubTree -> Right SubTree
    public void preOrder_iterative(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            list.add(current.data);

            if(current.right != null) {
                stack.push(current.right);
            }

            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }

    // In-Order BST Recursive Traversal (Depth-First)
    // Left Subtree -> Root Node -> Right Subtree
    public void inOrder_recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        inOrder_recursive(root.left);
        list.add(root.data);
        inOrder_recursive(root.right);
    }

    // In-Order BST Iterative Traversal (Depth-First)
    // Left Subtree -> Root Node -> Right Subtree
    public void inOrder_iterative(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {

            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.data);
                current = current.right;
            }
        }
    }

    // Post-Order BST Recursive Traversal (Depth-First)
    // Left Subtree -> Right Subtree -> Root Node
    public void postOrder_recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        postOrder_recursive(root.left);
        postOrder_recursive(root.right);
        list.add(root.data);
    }

    // Post-Order BST Iterative Traversal (Depth-First)
    // Left Subtree -> Right Subtree -> Root Node
    public void postOrder_iterative(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {

            if(current != null ) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    list.add(temp.data);

                    // Check if we fully traversed the left-subtree
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        list.add(temp.data);
                    }

                } else {
                    current = temp;
                }
            }
        }
    }

    // Level-Order BST Iterative Traversal (Breadth-First)
    // Level by Level
    public void levelOrder_iterative(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            list.add(temp.data);

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    // Print List Method
    public void printList() {
        for(Integer x : list) {
            System.out.println(x);
        }
        list.clear();
    }

    public static void main(String[] args) {
        BST_12 list = new BST_12();
        list.insert(15);
        list.insert(10);
        list.insert(30);
        list.insert(5);
        list.insert(13);
        list.insert(25);
        list.insert(40);


        list.levelOrder_iterative(list.root);
        list.printList();
    }

}
