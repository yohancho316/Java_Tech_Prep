package Data_Structure_Implementation;


public class BST_23 {

    public Node root;

    public BST_23() {
        this.root = null;
    }

    public void insertIterative(int val) {

        // Instantiate a New Node Object
        Node node = new Node(val);

        // Check if the Root Object is NULL
        if(this.root == null) {
            this.root = node;
            System.out.println("Inserted " + val + " at Root");
            return;
        }

        // If the Root Object is NOT NULL
        // Use a while loop to find where to assign reference of node object in the BST
        Node current = this.root;
        while(current != null) {
            if((node.getVal() < current.getVal()) && (current.getLeft() != null)) {
                current = current.getLeft();
            } else if((node.getVal() > current.getVal()) && (current.getRight() != null)) {
                current = current.getRight();
            } else if((node.getVal() < current.getVal()) && (current.getLeft() == null)) {
                current.setLeft(node);
            } else {
                current.setRight(node);
            }
        }
        System.out.println("Inserted " + val);
        return;
    }

    public void insertRecursive(int val) {
        this.root = insertRecursiveLogic(this.root, val);
    }

    public Node insertRecursiveLogic(Node root, int val) {

        // Base Condition
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(val < root.getVal()) {
            root.setLeft(insertRecursiveLogic(root.getLeft(), val));
        } else {
            root.setRight(insertRecursiveLogic(root.getRight(), val));
        }

        return root;
    }



    public static void main(String[] args) {
        BST_23 bst = new BST_23();
        bst.insertIterative(10);
    }
}


