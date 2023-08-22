package LeetCode;

public class LC_101_5 {

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        TreeNode temp = left;
        root.left = right;
        root.right = temp;
        return root;
    }

    public static boolean checkSymmetry(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;
        else if(left.val != right.val) return false;
        return checkSymmetry(left.left, right.left) && checkSymmetry(left.right, right.right);
    }

    public static boolean isSymmetric(TreeNode root) {
        TreeNode leftTree = invertTree(root.left);
        TreeNode rightTree = root.right;
        return checkSymmetry(leftTree, rightTree);
    }

    public static void main(String[] args) {

    }
}
