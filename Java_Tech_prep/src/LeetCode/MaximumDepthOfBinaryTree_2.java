package LeetCode;

public class MaximumDepthOfBinaryTree_2 {

    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int _data) {
            this.data = _data;
        }
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        } else {
            int left_depth = maxDepth(root.left);
            int right_depth = maxDepth(root.right);
            return java.lang.Math.max(left_depth,right_depth) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(7);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(10);
        TreeNode n8 = new TreeNode(2);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.right = n8;
        n3.right = n7;
        n3.left = n6;

        System.out.println(maxDepth(n1));
    }
}
