package Data_Structure_Implementation;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BST_19 {

    // Tree Node Class
    public class TreeNode {

        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int _data) {
            this.data = _data;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode root;

    public BST_19() {
        this.root = null;
    }

    public void insert_Recursive(int _data) {
        this.root = insert_Recursive(this.root, _data);
    }

    public TreeNode insert_Recursive(TreeNode root, int _data) {
        if(root == null) {
            root = new TreeNode(_data);
            return root;
        } else if(_data < root.data) {
            root.left = insert_Recursive(root.left, _data);
        } else {
            root.right = insert_Recursive(root.right, _data);
        }
        return root;
    }

    public TreeNode search_Recursive(TreeNode root, int target) {
        if(root == null) {
            return null;
        } else if(target < root.data) {
            return search_Recursive(root.left, target);
        } else if(target > root.data) {
            return search_Recursive(root.right, target);
        } else {
            return root;
        }
    }

    public TreeNode search_Iterative(TreeNode root, int target) {
        while(root.data != target) {
            if(target < root.data) {
                root = root.left;
            } else if(target > root.data) {
                root = root.right;
            } if(root == null) {
                return null;
            }
        }
        return root;
    }

    public void preOrder_Recursive(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder_Recursive(root.left);
        preOrder_Recursive(root.right);
    }

    public void preOrder_Iterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.data);

            if(temp.right != null) {
                stack.push(temp.right);
            }

            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void inOrder_Recursive(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrder_Recursive(root.left);
        System.out.println(root.data);
        inOrder_Recursive(root.right);
    }

    public void inOrder_Iterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;

        while(!stack.isEmpty() || temp != null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data);
                temp = temp.right;
            }
        }
    }

    public void postOrder_Recursive(TreeNode root) {
        if(root == null) {
            return;
        }

        postOrder_Recursive(root.left);
        postOrder_Recursive(root.right);
        System.out.println(root.data);
    }

    public void postOrder_Iterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;

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

    public void levelOrder_Iterative(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            System.out.println(temp.data);

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public TreeNode deleteTreeNode(TreeNode root, int target) {
        if(root == null) {
            return null;
        } else if(target < root.data) {
            root.left = deleteTreeNode(root.left, target);
        } else if(target > root.data) {
            root.right = deleteTreeNode(root.right, target);
        } else {

            // Case # 0: Target Node Has NO Child Nodes
            if(root.left == null && root.right == null) {
                return null;
            }

            // Case # 1: Target Node Has ONE Child Node
            else if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // # Case # 3: Target Node Has TWO Child Nodes
            else {

                // Replace Target Node w/ Maximum Node in the Left Subtree
//                TreeNode temp = findMaxNode(root.left);
//                root.data = temp.data;
//                deleteTreeNode(root.left, temp.data);

                // Replace Target Node w/ Minimum Node in the Right Subtree
                TreeNode temp = findMinNode(root.right);
                root.data = temp.data;
                deleteTreeNode(root.right, temp.data);
            }
        }
        return root;
    }

    public TreeNode findMaxNode(TreeNode root) {
        while(root.right != null) {
            root = root.right;
        }
        return root;
    }

    public TreeNode findMinNode(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {

        // Create CST & Insert Tree Nodes
        BST_19 tree = new BST_19();
        tree.insert_Recursive(10);
        tree.insert_Recursive(5);
        tree.insert_Recursive(1);
        tree.insert_Recursive(7);
        tree.insert_Recursive(20);
        tree.insert_Recursive(30);
        tree.insert_Recursive(35);
        tree.insert_Recursive(15);
        tree.insert_Recursive(13);
        tree.insert_Recursive(17);
        tree.insert_Recursive(12);
        tree.insert_Recursive(14);
        tree.insert_Recursive(16);
        tree.insert_Recursive(19);


        // Retrieve Tree Node by Searching Recursively
        System.out.println("\nTest BST Recursive Search:");
        TreeNode temp = tree.search_Recursive(tree.root, 7);
        System.out.println("Found Node w/ Data Value: " + temp.data);

        // Retrieve TreeNode by Searching Iteratively
        System.out.println("\nTest BST Iterative Search:");
        temp = tree.search_Iterative(tree.root, 19);
        System.out.println("Found Node w/ Data Value: " + temp.data);

        // Test Pre-Order Recursive Traversal
        System.out.println("\nTesting Recursive Pre-Order Traversal:");
        tree.preOrder_Recursive(tree.root);

        // Test Pre-Order Iterative Traversal
        System.out.println("\nTesting Iterative Pre-Order Traversal:");
        tree.preOrder_Iterative(tree.root);

        // Test In-Order Recursive Traversal
        System.out.println("\nTesting Recursive In-Order Traversal:");
        tree.inOrder_Recursive(tree.root);

        // Test In-Order Iterative Traversal
        System.out.println("\nTesting Iterative In-Order Traversal:");
        tree.inOrder_Recursive(tree.root);

        // Test Post-Order Recursive Traversal
        System.out.println("\nTesting Recursive Post-Order Traversal:");
        tree.postOrder_Recursive(tree.root);

        // Test Post-Order Iterative Traversal
        System.out.println("\nTesting Iterative Post-Order Traversal:");
        tree.postOrder_Iterative(tree.root);

        // Test Delete Node Method
        System.out.println("\nTesting Deleting Node in BST:");
        tree.deleteTreeNode(tree.root, 15);
        tree.inOrder_Recursive(tree.root);

    }
}
