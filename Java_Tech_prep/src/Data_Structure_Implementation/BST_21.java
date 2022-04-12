package Data_Structure_Implementation;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BST_21 {

    public Node root;

    public BST_21() {
        this.root = null;
    }

    public void insert(int data) {
        this.root = insert(this.root, data);
    }

    public Node insert(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        } else if(data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void preOrder_Recursive(Node root) {

        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder_Recursive(root.left);
        preOrder_Recursive(root.right);
    }

    public void preOrder_Iterative(Node root) {

        if(root == null) {
            System.out.println("Empty Tree");
        }

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while(!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.println(temp.data);

            if(temp.right != null) {
                stack.push(temp.right);
            }

            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void inOrder_Recursive(Node root) {

        if(root == null) {
            return;
        }

        inOrder_Recursive(root.left);
        System.out.println(root.data);
        inOrder_Recursive(root.right);
    }

    public void inOrder_Iterative(Node root) {

        if(root == null) {
            System.out.println("Empty Tree");
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        Node current = root;

        while(!stack.isEmpty() || current != null) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                System.out.println(current.data);
                current = current.right;
            }
        }
    }

    public void postOrder_Recursive(Node root) {

        if(root == null) {
            return;
        }

        postOrder_Recursive(root.left);
        postOrder_Recursive(root.right);
        System.out.println(root.data);
    }

    public void postOrder_Iterative(Node root) {

        if(root == null) {
            System.out.println("Empty Tree");
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        Node current = root;

        while(!stack.isEmpty() || current != null) {

            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                Node temp = stack.peek().right;

                if(temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.data);
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.println(temp.data);
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    public void levelOrder_Iterative(Node root) {

        if(root == null) {
            System.out.println("Empty Tree");
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()) {

            Node current = queue.remove();
            System.out.println(current.data);

            if(current.left != null) {
                queue.add(current.left);
            }

            if(current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public Node search_Recursive(Node root, int target) {

        if(root == null) {
            System.out.println("Target Not In Tree");
            return null;
        } else if(root.data == target) {
            return root;
        } else if(target < root.data) {
            return search_Recursive(root.left, target);
        } else {
            return search_Recursive(root.right, target);
        }
    }

    public Node search_Iterative(Node root, int target) {

        if(root == null) {
            System.out.println("Empty Tree");
            return null;
        }

        while(root != null) {
            if(root.data == target) {
                return root;
            } else if(target < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        System.out.println("Target Not in Tree");
        return null;
    }

    public Node delete_Recursive(Node root, int target) {
        boolean delete_MIN = false;
        boolean delete_MAX = true;
        if(root == null) {
            System.out.println("Target Not in Tree");
            return null;
        } else if(target < root.data) {
            root.left = delete_Recursive(root.left, target);
        } else if(target > root.data) {
            root.right = delete_Recursive(root.right, target);
        } else {

            // Case # 1: Target Node has NO Child Nodes
            if(root.left == null && root.right == null) {
                return null;
            }

            // Case # 2: Target Node has ONE Child Node
            else if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // Case # 3: Target Node has TWO Child Nodes
            else {

                if(delete_MIN) {
                    Node temp = find_MIN(root.right);
                    root.data = temp.data;
                    root.right = delete_Recursive(root.right, temp.data);
                }

                if(delete_MAX) {
                    Node temp = find_MAX(root.left);
                    root.data = temp.data;
                    root.left = delete_Recursive(root.left, temp.data);
                }
            }
        }
        return root;
    }

    public Node find_MAX(Node root) {
        while(root.right != null) {
            root = root.right;
        }
        return root;
    }

    public Node find_MIN(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        BST_21 tree = new BST_21();

        tree.insert(10);
        tree.insert(5);
        tree.insert(1);
        tree.insert(8);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);

        // Pre-Order Recursive Traversal
        tree.preOrder_Recursive(tree.root);

        System.out.println();

        // Pre-Order Iterative Traversal
        tree.preOrder_Iterative(tree.root);

        System.out.println();

        // In-Order Recursive Traversal
        tree.inOrder_Recursive(tree.root);

        System.out.println();

        // In-Order Iterative Traversal
        tree.inOrder_Iterative(tree.root);

        System.out.println();

        // Post-Order Recursive Traversal
        tree.postOrder_Recursive(tree.root);

        System.out.println();

        // Post-Order Iterative Traversal
        tree.postOrder_Iterative(tree.root);

        System.out.println();

        // Level-Order Iterative Traversal
        tree.levelOrder_Iterative(tree.root);

        System.out.println();

        // Search Recursively
        tree.search_Recursive(tree.root, 35);
        Node search1 = tree.search_Recursive(tree.root, 25);
        System.out.println(search1.data);

        System.out.println();

        // Search Iteratively
        tree.search_Iterative(tree.root, 35);
        Node search2 = tree.search_Iterative(tree.root,25);
        System.out.println(search2.data);

        System.out.println();

        // Delete Node w/ MIN Node
        tree.delete_Recursive(tree.root, 5);
        tree.levelOrder_Iterative(tree.root);
    }
}
