package LeetCode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class BinaryTreeInOrderTraversal {

    public static class TreeNode {

        // Member Attributes
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Default Constructor
        public TreeNode() {}

        // Overloaded Constructor
        public TreeNode(int _val) {
            this.val = _val;
        }

        public TreeNode(int _val, TreeNode _left, TreeNode _right) {
            this.val = _val;
            this.left = _left;
            this.right = _right;
        }
    }

    // Recursive In Order Traversal Method
    public static void inOrder(TreeNode root, List<Integer> list) {

        // Base Condition
        if(root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);

    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        // Local Declarations
        List<Integer> list = new ArrayList<Integer>();

        // Check if Root Node is Null
        if(root == null) return list;

        // Call inOrder Traversal Method
        inOrder(root, list);

        return list;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(13);
        TreeNode n4 = new TreeNode(11);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;

        List<Integer> list = inorderTraversal(n1);
        for(Integer val : list) {
            System.out.println(val);
        }
    }
}
