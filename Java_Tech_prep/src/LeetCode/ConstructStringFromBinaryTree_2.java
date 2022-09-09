package LeetCode;

public class ConstructStringFromBinaryTree_2 {

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

    public static String tree2str(TreeNode root) {

        // Base Case
        if(root == null) return "";

        if(root.left == null && root.right == null) {
            return String.valueOf(root.val);
        }

        if(root.right != null) {
            return String.valueOf(root.val) + "(" + tree2str(root.left) + ")";
        }

        return String.valueOf(root.val) + "(" + tree2str(root.left) + ")(" + root.right + ")";
    }

    public static void main(String[] args) {

    }
}
