package LeetCode;
import LeetCode.TreeNode;
public class LC_112_3 {

    public static boolean findSum(TreeNode root, int currentSum, int targetSum) {
        if(root == null) return false;
        if((root.left == null) && (root.right == null) && ((currentSum + root.val) == targetSum)) return true;
        return findSum(root.left, currentSum + root.val, targetSum) || findSum(root.right, currentSum + root.val, targetSum);
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return findSum(root, 0, targetSum);
    }

    public static void main(String[] args) {

    }
}
