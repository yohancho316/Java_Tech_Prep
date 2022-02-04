package Data_Structure_Implementation;

public class BST_3 {

    // Nested TreeNode Class
    public class TreeNode {
        // TreeNode Member Attributes
        public int data;
        public TreeNode left;
        public TreeNode right;

        // TreeNode Overloaded Constructor
        public TreeNode(int _data) {
            this.data = _data;
            this.left = null;
            this.right = null;
        }
    }

    // BST Member Attributes
    public TreeNode root;

    // BST Default Constructor
    public BST_3() {
        this.root = null;
    }

    // BST Insert Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    // BST Overloaded Recursive Insert Method
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

    // Depth-First Traversal: Pre Order Traversal
    public void preOrder(TreeNode root) {
        // Base Condition (Exit Clause)
        if(root == null) {
            System.out.println("null");
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args) {
        BST_3 bst = new BST_3();
        bst.insert(10);
        bst.insert(5);
        bst.insert(7);
        bst.insert(20);
        bst.preOrder(bst.root);
    }
}
