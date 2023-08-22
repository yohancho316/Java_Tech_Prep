package LeetCode;

public class LC_110_2 {

    public boolean balanced = true;

    public int checkBalance(TreeNode root) {
        if(root == null) return 0;
        int left = checkBalance(root.left);
        int right = checkBalance(root.right);
        if(Math.abs(left - right) > 1) this.balanced = false;
        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        checkBalance(root);
        return this.balanced;
    }
}
