package Data_Structure_Implementation;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BST_20 {

    // Member Attributes
    private TreeNode root;

    // Constructor
    public BST_20() {
        this.root = null;
    }

    // Recursive Insert
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

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

    // Recursive Search
    public TreeNode search_Recursive(TreeNode root, int target) {

        // Base Condition
        if(root == null) {
            System.out.println("Not Found");
            return null;
        } else if(target < root.data) {
            return search_Recursive(root.left, target);
        } else if(target > root.data) {
            return search_Recursive(root.right, target);
        } else {
            return root;
        }
    }

    // Iterative Search
    public TreeNode search_Iterative(TreeNode root, int target) {
        if(root == null) {
            System.out.println("Not Found");
            return null;
        }

        while(root.data != target) {
            if(root == null) {
                System.out.println("Not Found");
                return null;
            } else if(target < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }

    // Recursive Pre-Order Traversal (Depth-First)
    public void preOrder_Recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder_Recursive(root.left);
        preOrder_Recursive(root.right);
    }

    // Iterative Pre-Order Traversal (Depth-First)
    public void preOrder_Iterative(TreeNode root) {

        if(root == null) {
            System.out.println("Empty Tree");
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

    // Recursive In-Order Traversal (Depth-First)
    public void inOrder_Recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        inOrder_Recursive(root.left);
        System.out.println(root.data);
        inOrder_Recursive(root.right);
    }

    // Iterative In-Order Traversal (Depth-First)
    public void inOrder_Iterative(TreeNode root) {

        if(root == null) {
            System.out.println("Empty Tree");
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

    // Recursive Post-Order Traversal (Depth-First)
    public void postOrder_Recursive(TreeNode root) {

        // Base Condition
        if(root == null) {
            return;
        }

        postOrder_Recursive(root.left);
        postOrder_Recursive(root.right);
        System.out.println(root.data);
    }

    // Iterative Post-Order Traversal (Depth-First)
    public void postOrder_Iterative(TreeNode root) {

        if(root == null) {
            System.out.println("Empty Tree");
            return;
        }

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

    // Iterative Level-Order Traversal (Breadth-First)
    public void levelOrder_Iterative(TreeNode root) {

        if(root == null) {
            System.out.println("Empty Tree");
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

    // Recursive TreeNode Delete Method
//    public TreeNode deleteNode_Recursive(TreeNode root, int target) {
//
//        // Base Condition
//        if(root == null) {
//            return null;
//        }
//    }


    public class TreeNode {

        // Member Attributes
        private int data;
        private TreeNode left;
        private TreeNode right;

        // Constructor
        public TreeNode(int _data) {
            this.data = _data;
            this.left = null;
            this.right = null;
        }

        // Setter Methods
        public void setData(int _data) {
            this.data = _data;
        }

        public void setLeft(TreeNode _left) {
            this.left = _left;
        }

        public void setRight(TreeNode _right) {
            this.right = _right;
        }

        // Getter Methods
        public int getData() {
            return this.data;
        }

        public TreeNode getLeft() {
            return this.left;
        }

        public TreeNode getRight() {
            return this.right;
        }
    }

    public static void main(String[] args) {

        BST_20 tree = new BST_20();

        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(45);
        tree.insert(60);
        tree.insert(55);
        tree.insert(70);

        System.out.println("Pre-Order Recursive:");
        tree.preOrder_Recursive(tree.root);

        System.out.println("\nPre-Order Iterative:");
        tree.preOrder_Iterative(tree.root);

        System.out.println("\nIn-Order Recursive:");
        tree.inOrder_Recursive(tree.root);

        System.out.println("\nIn-Order Iterative:");
        tree.inOrder_Iterative(tree.root);

        System.out.println("\nPost-Order Recursive:");
        tree.postOrder_Recursive(tree.root);

        System.out.println("\nPost-Order Iterative:");
        tree.postOrder_Iterative(tree.root);

        System.out.println("\nLevel-Order Iterative:");
        tree.levelOrder_Iterative(tree.root);
    }
}
