package LeetCode;
import LeetCode.TreeNode;
public class LC_104_2 {

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Integer.max(left, right) + 1;
    }

    public static void main(String[] args) {

    }
}
