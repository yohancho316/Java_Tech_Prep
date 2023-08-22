package LeetCode;

public class LC_104_4 {

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }

    public static void main(String[] args) {

    }
}
