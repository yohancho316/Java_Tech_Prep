package LeetCode;

public class SymmetricTree_2 {

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

    public static boolean checkSymmetric(TreeNode left, TreeNode right) {

        // Base Case
        if(left == null || right == null) return left == right;

        if(left.val != right.val) return false;

        return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checkSymmetric(root.left, root.right);
    }

    public static void main(String[] args) {

    }
}
