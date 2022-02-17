package LeetCode;

public class MaximumDepthOfBinaryTree {

    // Tree Node Class
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

        // Overloaded Constructor
        public TreeNode(int _val, TreeNode _left, TreeNode _right) {
            this.val = _val;
            this.left = _left;
            this.right = _right;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return java.lang.Math.max(left_height, right_height) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(13);
        TreeNode n4 = new TreeNode(11);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
    }
}
