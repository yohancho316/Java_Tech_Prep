package Data_Structure_Implementation;

public class BST_2 {

    // Nested TreeNode Class
    public class TreeNode {

        // TreeNode Member Attributes
        public int data;
        public TreeNode left;
        public TreeNode right;

        // Overloaded Constructor
        public TreeNode(int _data) {
            this.data = _data;
            this.left = null;
            this.right = null;
            this.right = null;
        }
    }

    // BST_2 Member Attributes
    public TreeNode root;

    // Overloaded Constructor
    public BST_2() {
        this.root = null;
    }

    // Insert Recursive Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    public TreeNode insert(TreeNode root, int _data) {
        // Check if Root is Null
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


    public static void main(String[] args) {

        BST_2 new_tree = new BST_2();
        new_tree.insert(10);
        new_tree.insert(5);
        new_tree.insert(7);

    }
}
