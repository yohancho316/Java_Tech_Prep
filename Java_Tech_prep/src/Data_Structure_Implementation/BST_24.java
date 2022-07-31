package Data_Structure_Implementation;

public class BST_24 {

    // Member Attributes
    private Node root;

    // Default Constructor
    public BST_24() {
        this.root = null;
    }

    // Iterative Insertion [O(N) Time Complexity && O(1) Space Complexity]
    public void insertIterative(int val) {

        // Check if Root is NULL
        if(this.root == null) {
            this.root = new Node(val);
            return;
        }

        // Loop to Find Appropriate Tail Node
        Node root = this.root;
        while(root != null) {
            if((val < root.getVal()) && (root.getLeft() != null)) {
                root = root.getLeft();
            } else if((val > root.getVal()) && (root.getRight() != null)) {
                root = root.getRight();
            } else if((val < root.getVal()) && (root.getLeft() == null)) {
                root.setLeft(new Node(val));
            } else {
                root.setRight(new Node(val));
            }
        }
        return;
    }

    // Recursive Insertion [(O(LOG(N)) Time Complexity && O(N) Space Complexity]
    public void insertRecursive(int val) {
        this.root = recursiveInsertion(this.root, val);
    }

    public Node recursiveInsertion(Node root, int val) {

        // Evaluate Base Case
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(val < root.getVal()) {
            root.setLeft(recursiveInsertion(root.getLeft(), val));
        } else {
            root.setRight(recursiveInsertion(root.getRight(), val));
        }
        return root;
    }
}
