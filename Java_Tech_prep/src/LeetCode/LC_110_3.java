package LeetCode;

public class LC_110_3 {

    public boolean balanced;

    public int checkBalance(TreeNode root) {
        if(root == null) return 0;
        int left = checkBalance(root.left);
        int right = checkBalance(root.right);
        if(Math.abs(left - right) > 1) {
            balanced = false;
        }
        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        this.balanced = true;
        checkBalance(root);
        return this.balanced;
    }

    public static void main(String[] args) {

    }
}
