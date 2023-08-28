package LeetCode;

public class LC_112_5 {

    public boolean checkPath(TreeNode root, int targetSum, int currSum) {
        if(root == null) return false;
        else if(root.left == null && root.right == null && (currSum + root.val) == targetSum) return true;

        return checkPath(root.left, targetSum, currSum + root.val) ||
                checkPath(root.right, targetSum, currSum + root.val);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return checkPath(root, targetSum, 0);
    }
}
