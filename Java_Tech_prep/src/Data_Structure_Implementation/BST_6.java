package Data_Structure_Implementation;

public class BST_6 {

    // Tree Node Class
    public static class TreeNode {

        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {

        }

        public TreeNode(int _data) {
            this.data = _data;
            this.left = null;
            this.right = null;
        }

    }

    // Attributes
    public TreeNode root;

    // Default Constructor
    public BST_6() {
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

    // Pre-Order Traversal (Depth First)
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

    // Post-Order Traversal (Depth First)
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

    // In-Order Traversal (Depth First)
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



    public static void main(String[] args) {

        // Create BST Object
        BST_6 tree = new BST_6();

        // Insert Integer Values into BST
        tree.insert(15);
        tree.insert(20);
        tree.insert(18);
        tree.insert(13);
        tree.insert(14);
        tree.insert(16);

        // Pre Order Traversal of BST (Depth-First)
        System.out.println("Pre-Order Traversal");
        tree.preOrder(tree.root);
        System.out.println("\n\n");


        // Post Order Traversal of BST (Depth-First)
        System.out.println("Post-Order Traversal");
        tree.postOrder(tree.root);
        System.out.println("\n\n");


        // In Order Traversal of BST (Depth-First)
        System.out.println("In-Order Traversal");
        tree.inOrder(tree.root);
        System.out.println("\n\n");


    }
}
