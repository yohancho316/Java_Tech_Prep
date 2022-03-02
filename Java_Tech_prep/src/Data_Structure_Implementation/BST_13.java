package Data_Structure_Implementation;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

// Binary Search Tree Class
public class BST_13 {

    // TreeNode Class
    public class TreeNode {

        // TreeNode Member Attributes
        public int data;
        public TreeNode left;
        public TreeNode right;

        // Overloaded Constructor
        public TreeNode(int _data) {
            this.data = _data;
        }
    }

    // BST_13 Member Attributes
    public TreeNode root;

    // BST_13 Default Constructor
    public BST_13() {
        this.root = null;
    }

    // Insert Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    // Overloaded Insert Method
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

    // Recursive Pre-Order BST Traversal (Depth-First)
    // Visit Root Node -> Traverse Entire Left-Subtree -> Traverse Entire Right-Subtree
    public void preOrder_Recursive(TreeNode root, List<Integer> list) {
        // Base Condition
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        list.add(root.data);
        preOrder_Recursive(root.left, list);
        preOrder_Recursive(root.right, list);
    }

    // Iterative Pre-Order BST Traversal (Depth-First)
    // Visit Root Node -> Traverse Entire Left-Subtree -> Traverse Entire Right-Subtree
    public void preOrder_Iterative(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.data);
            list.add(temp.data);

            if(temp.right != null) {
                stack.push(temp.right);
            }

            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    // Recursive In-Order BST Traversal (Depth-First)
    // Traverse Entire Left-Subtree -> Visit Root Node -> Traverse Entire Right-Subtree
    public void inOrder_Recursive(TreeNode root, List<Integer> list) {
        // Base Condition
        if(root == null) {
            return;
        }

        inOrder_Recursive(root.left, list);
        System.out.println(root.data);
        list.add(root.data);
        inOrder_Recursive(root.right, list);
    }

    // Iterative In-Order BST Traversal (Depth-First)
    // Traverse Entire Left-Subtree -> Visit Root Node -> Traverse Entire Right-Subtree
    public void inOrder_Iterative(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;

        while(!stack.isEmpty() || temp != null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data);
                list.add(temp.data);
                temp = temp.right;
            }
        }
    }

    // Recursive Post-Order BST Traversal (Depth-First)
    // Traverse Entire Left-Subtree -> Traverse Entire Right-Subtree -> Visit Root Node
    public void postOrder_Recursive(TreeNode root, List<Integer> list) {
        // Base Condition
        if(root == null) {
            return;
        }

        postOrder_Recursive(root.left, list);
        postOrder_Recursive(root.right, list);
        System.out.println(root.data);
        list.add(root.data);
    }

    // Iterative Post-Order BST Traversal (Depth-First)
    // Traverse Entire Left-Subtree -> Traverse Entire Right Subtree -> Visit Root Node
    public void postOrder_Iterative(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.data);
                    list.add(temp.data);

                    while((!stack.isEmpty()) && (temp == stack.peek().right)) {
                        temp = stack.pop();
                        System.out.println(temp.data);
                        list.add(temp.data);
                    }

                } else {
                    current = temp;
                }
            }

        }
    }

    // Iterative Level-Order BST Traversal (Breadth-First)
    // All Nodes Level by Level
    public void levelOrder_Iterative(TreeNode root, List<Integer> list) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            System.out.println(temp.data);
            list.add(temp.data);

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        BST_13 tree = new BST_13();
        tree.insert(15);
        tree.insert(10);
        tree.insert(5);
        tree.insert(13);
        tree.insert(17);
        tree.insert(16);
        tree.insert(20);

        System.out.println("Pre-Order Recursive Traversal:");
        tree.preOrder_Recursive(tree.root, list);

        System.out.println("\nPre-Order Iterative Traversal:");
        tree.preOrder_Iterative(tree.root, list);

        System.out.println("\nIn-Order Recursive Traversal:");
        tree.inOrder_Recursive(tree.root, list);

        System.out.println("\nIn-Order Iterative Traversal:");
        tree.inOrder_Iterative(tree.root, list);

        System.out.println("\nPost-Order Recursive Traversal:");
        tree.postOrder_Recursive(tree.root, list);

        System.out.println("\nPost-Order Iterative Traversal:");
        tree.postOrder_Iterative(tree.root, list);

        System.out.println("\nLevel-Order Iterative Traversal:");
        tree.levelOrder_Iterative(tree.root, list);
    }
}
