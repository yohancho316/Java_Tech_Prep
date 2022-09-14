package Data_Structure_Implementation;

import java.util.LinkedList;
import java.util.Queue;
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

    // LevelOrder Iterative Traversal
    public void LevelOrder_Iterative(Node root) {
        if(root == null) return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()) {

            Node current = queue.remove();
            System.out.println(current.getVal());

            if(current.getLeft() != null) {
                queue.add(current.getLeft());
            }

            if(current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
    }

    // Recursive Delete
    public Node delete_Recursive(Node root, int target) {

        // Choose Which Delete Operation to Perform
        boolean delete_MIN = true;
        boolean delete_MAX = false;

        // Base Case & Traverse to Target Node
        if(root == null) return null;
        else if(target < root.getVal()) root.setLeft(delete_Recursive(root.getLeft(), target));
        else if(target > root.getVal()) root.setRight(delete_Recursive(root.getRight(), target));
        else {

            // Case # 1: Target Node has NO Child Nodes
            if((root.getLeft() == null) && (root.getRight() == null)) {
                return null;
            }

            // Case # 2: Target Node has ONE Child Node
            else if(root.getRight() == null) {
                return root.getLeft();
            } else if(root.getLeft() == null) {
                return root.getRight();
            }

            // Case # 3: Target Node has TWO Child Nodes
            else {

                if(delete_MIN) {
                    Node temp = findMIN(root.getRight());
                    root.setVal(temp.getVal());
                    root.setRight(delete_Recursive(root.getRight(), temp.getVal()));
                }

                if(delete_MAX) {
                    Node temp = findMAX(root.getLeft());
                    root.setVal(temp.getVal());
                    root.setLeft(delete_Recursive(root.getLeft(), temp.getVal()));
                }
            }
        }
        return root;
    }

    // Find Min Node
    public Node findMIN(Node root) {
        while(root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }

    // Find Max Node
    public Node findMAX(Node root) {
        while(root.getRight() != null) {
            root = root.getRight();
        }
        return root;
    }

    public static void main(String[] args) {
        BST_26 i_bst = new BST_26();
        BST_26 r_bst = new BST_26();
        BST_26 d_bst = new BST_26();

        i_bst.iterative_insert(50);
        i_bst.iterative_insert(30);
        i_bst.iterative_insert(70);

        System.out.println("Printing i_bst w/ Iterative PreOrder Traversal:");
        i_bst.PreOrder_Iterative(i_bst.root);
        System.out.println();

        r_bst.recursive_insert(100);
        r_bst.recursive_insert(50);
        r_bst.recursive_insert(200);

        d_bst.iterative_insert(100);
        d_bst.iterative_insert(50);
        d_bst.iterative_insert(25);
        d_bst.iterative_insert(75);
        d_bst.iterative_insert(150);
        d_bst.iterative_insert(125);
        d_bst.iterative_insert(175);
        d_bst.iterative_insert(160);

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

        System.out.println("Printing i_bst w/ Iterative LevelOrder Traversal:");
        i_bst.LevelOrder_Iterative(i_bst.root);
        System.out.println();

        System.out.println("Printing d_bst w/ Iterative LevelOrder Traversal:");
        d_bst.PreOrder_Recursive(d_bst.root);
        System.out.println();

        System.out.println("Delete d_bst Recursive Deletion:");
        d_bst.root = d_bst.delete_Recursive(d_bst.root, 150);
        d_bst.LevelOrder_Iterative(d_bst.root);

    }

}
