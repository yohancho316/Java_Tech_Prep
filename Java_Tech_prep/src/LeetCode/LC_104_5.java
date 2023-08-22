package LeetCode;

public class LC_104_5 {

    public int maxDistance = Integer.MIN_VALUE;

    public int findMaxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        this.maxDistance = Math.max((left + right), maxDistance);
        return Math.max(left, right) + 1;
    }

    public int maxDepth(TreeNode root) {
        findMaxDepth(root);
        return this.maxDistance;
    }

    public static void main(String[] args) {

    }
}
