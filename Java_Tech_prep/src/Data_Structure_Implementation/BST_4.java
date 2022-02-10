package Data_Structure_Implementation;

public class BST_4 {

    // Nested TreeNode Class
    public class TreeNode {
        // TreeNode State
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

    // BST State
    public TreeNode root;

    // Default Constructor
    public BST_4() {
        this.root = null;
    }

    // Insert Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    // Overloaded Recursive Insert Method
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

    // PreOrder Recursive Traversal of Binary Search Tree (Depth-First Search)
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

    // PostOrder Recursive Traversal of Binary Search Tree (Depth-First Search)
    public void postOrder(TreeNode root) {
        // Base Case
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        BST_4 tree = new BST_4();
        tree.insert(13);
        tree.insert(20);
        tree.insert(17);
        tree.insert(5);

        tree.preOrder(tree.root);
    }
}
