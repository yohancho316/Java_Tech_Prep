package Data_Structure_Implementation;

public class BST_5 {

    // Tree Node Class
    public class TreeNode {

        // Attributes
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

    // BST Attributes
    public TreeNode root;

    // Default Constructor
    public BST_5() {
        this.root = null;
    }

    // Recursive Insertion
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    // Overloaded Recursive Insertion
    public TreeNode insert(TreeNode root, int _data) {
        // Base Case
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

    // PreOrder Recursive Traversal (Depth-First)
    public void preOrder(TreeNode root) {
        // Base Case
        if(root == null) {
            System.out.println("NULL");
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // Post Order Recursive Traversal (Depth-First)
    public void postOrder(TreeNode root) {
        // Base Case
        if(root == null) {
            System.out.println("NULL");
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    // In Order Recursive Traversal (Depth-First)
    public void inOrder(TreeNode root) {
        // Base Case
        if(root == null) {
            System.out.println("NULL");
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }


    public static void main(String[] args) {
        BST_5 tree = new BST_5();
        tree.insert(9);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);

        // Print BST w/ Pre-Order Traversal
        System.out.println("Pre-Order Traversal (Depth-First)");
        tree.preOrder(tree.root);

        System.out.println("\n\n");

        // Print BST w/ Post-Order Traversal
        System.out.println("Post-Order Traversal (Depth-First)");
        tree.postOrder(tree.root);

        System.out.println("\n\n");

        // Print BST w/ In-Order Traversal
        System.out.println("In-Order Traversal (Depth-First)");
        tree.inOrder(tree.root);


    }
}
