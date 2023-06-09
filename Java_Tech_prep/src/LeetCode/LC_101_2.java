package LeetCode;
import LeetCode.TreeNode;
public class LC_101_2 {

    public static boolean checkSymmetry(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;
        else if(left.val != right.val) return false;
        return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
    }


    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checkSymmetry(root.left, root.right);
    }

    public static void main(String[] args) {

    }
}
