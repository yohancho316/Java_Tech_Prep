package LeetCode;

public class SymmetricTree_1 {

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

    public static boolean checkSymmetry(TreeNode left, TreeNode right) {

        // Base Case
        if(left == null || right == null) {
            return left == right;
        }

        if(left.val != right.val) return false;

        return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
    }

    public static boolean isSymmetric(TreeNode root) {
        return root == null || checkSymmetry(root.left, root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(2);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(4);
        TreeNode a6 = new TreeNode(4);
        TreeNode a7 = new TreeNode(10);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        System.out.println(isSymmetric(a1));

    }
}
