package Data_Structure_Implementation;

import java.util.Stack;

public class BST_27 {

    // Member Attribute
    public Node root;

    // Default Constructor
    public BST_27() {
        this.root = null;
    }

    // Recursive Insertion
    public void Recursive_Insertion(int val) {
        this.root = recursive_Insertion_Logic(this.root, val);
    }

    // Recursive Insertion Logic
    public Node recursive_Insertion_Logic(Node root, int val) {

        // Base Case
        if(root == null) {
            return new Node(val);
        }

        if(val < root.getVal()) {
            root.setLeft(recursive_Insertion_Logic(root.getLeft(), val));
        } else {
            root.setRight(recursive_Insertion_Logic(root.getRight(), val));
        }

        return root;
    }

    // Iterative Insertion
    public void Iterative_Insertion(int val) {

        if(this.root == null) {
            this.root = new Node(val);
            return;
        }

        Node current = this.root;

        while(current != null) {
            if((val < current.getVal()) && (current.getLeft() != null)) {
                current = current.getLeft();
            } else if((val > current.getVal()) && (current.getRight() != null)) {
                current = current.getRight();
            } else if(val < current.getVal()) {
                current.setLeft(new Node(val));
                return;
            } else {
                current.setRight(new Node(val));
                return;
            }
        }
    }

    // DFS PreOrder Binary Tree Recursive Traversal
    public void PreOrder_Recursive(Node root) {

        // Base Case
        if(root == null) return;

        System.out.println(root.getVal());
        PreOrder_Recursive(root.getLeft());
        PreOrder_Recursive(root.getRight());
    }

    // DFS PreOrder Binary Tree Iterative Traversal
    public void PreOrder_Iterative(Node root) {

        // Base Case
        if(root == null) return;

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while(!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.println(temp.getVal());

            if(temp.getRight() != null) {
                stack.push(temp.getRight());
            }

            if(temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }
        }
    }

    // DFS InOrder Binary Tree Recursive Traversal
    public void InOrder_Recursive(Node root) {

        // Base Case
        if(root == null) return;

        InOrder_Recursive(root.getLeft());
        System.out.println(root.getVal());
        InOrder_Recursive(root.getRight());
    }

    // DFS InOrder Binary Tree
    public void InOrder_Iterative(Node root) {

        // Base Case
        if(root == null) return;

        Stack<Node> stack = new Stack<Node>();
        Node current = root;

        while ((current != null) || (!stack.isEmpty())) {
            if(current != null) {
                stack.push(current);
                current = current.getLeft();
            } else {
                Node temp = stack.pop();
                System.out.println(temp.getVal());
                current = temp.getRight();
            }
        }
    }

    // DFS PostOrder Binary Tree Recursive Traversal
    public void PostOrder_Recursive(Node root) {

        // Base Case
        if(root == null) return;

        PostOrder_Recursive(root.getLeft());
        PostOrder_Recursive(root.getRight());
        System.out.println(root.getVal());
    }

    // DFS PostOrder Binary Tree Iterative Traversal
    public void PostOrder_Iterative(Node root) {

        // Base Case
        if(root == null) return;

        Stack<Node> stack = new Stack<Node>();
        Node current = root;

        while((current != null) || (!stack.isEmpty())) {
            if(current != null) {
                stack.push(current);
                current = current.getLeft();
            } else {
                Node temp = stack.peek().getRight();
                if(temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.getVal());
                    while((!stack.isEmpty()) && (stack.peek().getRight() == temp)) {
                        current = stack.pop();
                        System.out.println(current);
                    }
                } else {
                    current = temp;
                }
            }
        }
    }


    // Main Method
    public static void main(String[] args) {

    }

} // end of BST_27
