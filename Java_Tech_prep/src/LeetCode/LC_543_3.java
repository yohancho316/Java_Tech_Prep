package LeetCode;

public class LC_543_3 {

    public int maxDiameter = 0;

    public int findMaxDiameter(TreeNode root) {
        if(root == null) return 0;
        int left = findMaxDiameter(root.left);
        int right = findMaxDiameter(root.right);
        this.maxDiameter = Math.max(this.maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        findMaxDiameter(root);
        return this.maxDiameter;
    }
}
