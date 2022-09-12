package LeetCode;

public class MaximumDepthOfBinaryTree_8 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int maxDepth(TreeNode root) {

        // Base Case
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right) + 1;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(9);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(20);
        TreeNode a4 = new TreeNode(15);
        TreeNode a5 = new TreeNode(22);

        a1.left = a2;
        a1.right = a3;
        a3.left = a4;
        a3.right = a5;

        System.out.println("Max Depth: " + maxDepth(a1));

    }
}
