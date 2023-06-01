package LeetCode;
import LeetCode.TreeNode;
public class LC_110_1 {

    public static boolean balanced;

    public static int checkBalance(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = checkBalance(root.left);
        int rightHeight = checkBalance(root.right);
        if(balanced && (Math.abs(leftHeight - rightHeight) > 1)) balanced = false;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        balanced = true;
        checkBalance(root);
        return balanced;
    }

    public static void main(String[] args) {

    }
}
