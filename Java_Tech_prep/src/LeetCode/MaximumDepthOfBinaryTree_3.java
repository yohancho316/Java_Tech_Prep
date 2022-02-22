package LeetCode;

public class MaximumDepthOfBinaryTree_3 {

    // Tree Node Class
    public static class TreeNode {
        // Member Attributes
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Overloaded Constructor
        public TreeNode(int _val) {
            this.val = _val;
        }
    }

    public static int maxDepth(TreeNode root) {

        // Base Condition
        if(root == null) {
            return 0;
        }

        int left_sum = maxDepth(root.left);
        int right_sum = maxDepth(root.right);
        return java.lang.Math.max(left_sum, right_sum) + 1;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        System.out.println(maxDepth(n1));
    }
}
