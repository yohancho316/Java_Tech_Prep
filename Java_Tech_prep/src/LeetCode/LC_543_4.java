package LeetCode;

public class LC_543_4 {

    public int maxLength = 0;

    public int findMaxDiameter(TreeNode root) {
        if(root == null) return 0;
        int left = findMaxDiameter(root.left);
        int right = findMaxDiameter(root.right);
        maxLength = (left + right) > maxLength ? left + right : maxLength;
        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        findMaxDiameter(root);
        return this.maxLength;
    }
}
