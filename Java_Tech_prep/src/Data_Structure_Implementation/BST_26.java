package Data_Structure_Implementation;

import java.util.Stack;

public class BST_26 {

    // Member Attribute
    public Node root;

    // Default Constructor
    public BST_26()
    {
        this.root = null;
    }

    // Iterative Insertion
    public void iterative_insert(int val) {

        if(this.root == null)
        {
            this.root = new Node(val);
            return;
        }

        Node root = this.root;

        while(root != null)
        {
            if((val < root.getVal()) && (root.getLeft() != null)) {
                root = root.getLeft();
            } else if(val > root.getVal() && (root.getRight() != null)) {
                root = root.getRight();
            } else if(val < root.getVal()) {
                root.setLeft(new Node(val));
                return;
            } else {
                root.setRight(new Node(val));
                return;
            }
        }
        return;
    }

    // Recursive Insertion
    public void recursive_insert(int val) {
        this.root = insert(this.root, val);
    }

    // Recursive Crawl
    public Node insert(Node root, int val) {

        // Base Case
        if(root == null) {
            return new Node(val);
        }

        if(val < root.getVal()) {
            root.setLeft(insert(root.getLeft(), val));
        } else {
            root.setRight(insert(root.getRight(), val));
        }

        return root;
    }

    // PreOrder Recursive Traversal
    public void PreOrder_Recursive(Node root) {

        // Base Case
        if(root == null) return;

        System.out.println(root.getVal());
        PreOrder_Recursive(root.getLeft());
        PreOrder_Recursive(root.getRight());
    }

    // PreOrder Iterative Traversal
    public void PreOrder_Iterative(Node root) {

        if(root == null) return;

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while(!stack.isEmpty()) {
            root = stack.pop();
            System.out.println(root.getVal());

            if(root.getRight() != null) {
                stack.push(root.getRight());
            }

            if(root.getLeft() != null) {
                stack.push(root.getLeft());
            }
        }
    }

    // InOrder Recursive Traversal
    public void InOrder_Recursive(Node root) {

        // Base Condition
        if(root == null) return;

        InOrder_Recursive(root.getLeft());
        System.out.println(root.getVal());
        InOrder_Recursive(root.getRight());
    }

    // InOrder Iterative Traversal
    public void InOrder_Iterative(Node root) {

        if(root == null) return;

        Stack<Node> stack = new Stack<Node>();
        Node current = root;

        while(current != null || !stack.isEmpty()) {
            if(current != null) {
                stack.push(current);
                current = current.getLeft();
            } else {
                current = stack.pop();
                System.out.println(current.getVal());
                current = current.getRight();
            }
        }
    }

    // PostOrder Recursive Traversal
    public void PostOrder_Recursive(Node root) {

        // Base Case
        if(root == null) return;

        PostOrder_Recursive(root.getLeft());
        PostOrder_Recursive(root.getRight());
        System.out.println(root.getVal());
    }

    // PostOrder Iterative Traversal
    public void PostOrder_Iterative(Node root) {

        if(root == null) return;

        Node current = root;
        Stack<Node> stack = new Stack<Node>();

        while(current != null || !stack.isEmpty()) {
            if(current != null) {
                stack.push(current);
                current = current.getLeft();
            } else {
                Node temp = stack.peek().getRight();

                if(temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.getVal());
                    while(!stack.isEmpty() && temp == stack.peek().getRight()) {
                        temp = stack.pop();
                        System.out.println(temp.getVal());
                    }

                } else {
                    current = temp;
                }
            }
        }

    }


    public static void main(String[] args) {
        BST_26 i_bst = new BST_26();
        BST_26 r_bst = new BST_26();

        i_bst.iterative_insert(50);
        i_bst.iterative_insert(30);
        i_bst.iterative_insert(70);

        System.out.println("Printing i_bst w/ Iterative PreOrder Traversal:");
        i_bst.PreOrder_Iterative(i_bst.root);
        System.out.println();

        r_bst.recursive_insert(100);
        r_bst.recursive_insert(50);
        r_bst.recursive_insert(200);

        System.out.println("Printing r_bst w/ Recursive PreOrder Traversal");
        r_bst.PreOrder_Recursive(r_bst.root);
        System.out.println();

        System.out.println("Printing i_bst w/ Iterative InOrder Traversal:");
        i_bst.InOrder_Iterative(i_bst.root);
        System.out.println();

        System.out.println("Printing r_bst w/ Recursive InOrder Traversal:");
        r_bst.InOrder_Recursive(r_bst.root);
        System.out.println();

        System.out.println("Printing i_bst w/ Recursive PostOrder Traversal:");
        i_bst.PostOrder_Recursive(i_bst.root);
        System.out.println();

        System.out.println("Printing r_bst w/ Iterative PostOrder Traversal:");
        r_bst.PostOrder_Iterative(r_bst.root);
        System.out.println();


    }

}
