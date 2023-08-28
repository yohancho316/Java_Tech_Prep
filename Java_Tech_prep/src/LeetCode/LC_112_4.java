package LeetCode;

public class LC_112_4 {

    public boolean pathExists = false;

    public int checkPath(TreeNode root, int targetSum, int currSum) {
        if(root.left == null && root.right == null && ((currSum + root.val) == targetSum)) this.pathExists = true;
        if(root.left != null) checkPath(root.left, targetSum, currSum + root.val);
        if(root.right != null) checkPath(root.right, targetSum, currSum + root.val);
        return 0;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return this.pathExists;
        checkPath(root, targetSum, 0);
        return this.pathExists;
    }

    public static void main(String[] args) {

    }
}
