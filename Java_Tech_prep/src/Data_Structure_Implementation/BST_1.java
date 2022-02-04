package Data_Structure_Implementation;

public class BST_1 {

    public class Node {
        // Member Attributes
        public int data;
        public Node left;
        public Node right;

        // Overloaded Constructor
        public Node(int _data) {
            this.data = _data;
            this.left = null;
            this.right = null;
        }
    }

    // BST Member Attributes
    public Node root;

    // Default Constructor
    public BST_1() {
        this.root = null;
    }

    // Insert Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    public Node insert(Node root, int _data) {

        if(root == null) {
            root = new Node(_data);
            return root;
        }
        else if(root.data > _data) {
            root.left = insert(root.left, _data);
        } else {
            root.right = insert(root.right, _data);
        }

        return root;
    }


    public static void main(String[] args) {

    }
}
