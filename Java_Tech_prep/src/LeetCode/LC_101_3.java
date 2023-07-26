package LeetCode;
import LeetCode.TreeNode;
public class LC_101_3 {

    public static boolean checkSymmetry(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;
        else if(left.val != right.val) return false;
        boolean Left = checkSymmetry(left.left, right.right);
        boolean Right = checkSymmetry(left.right, right.left);
        return Left && Right;
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checkSymmetry(root.left, root.right);
    }

    public static void main(String[] args) {

    }
}
