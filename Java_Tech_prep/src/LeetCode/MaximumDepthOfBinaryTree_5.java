package LeetCode;

public class MaximumDepthOfBinaryTree_5 {

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
        if(root == null) return 0;

        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        return Math.max(left_height, right_height) + 1;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(20);
        TreeNode a2 = new TreeNode(10);
        TreeNode a3 = new TreeNode(5);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(15);
        TreeNode a6 = new TreeNode(30);

        a1.left = a2;
        a2.left = a3;
        a3.left = a4;
        a2.right = a5;
        a1.right = a6;

        System.out.println(maxDepth(a1));

    }
}
