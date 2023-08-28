package LeetCode;

public class LC_108_4 {

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

    public TreeNode buildTree(int[] nums, int left, int right) {
        if(nums.length == 0 || (left > right) || (right < left)) return null;
        int mid = (right - left) / 2 + left;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, left, mid - 1);
        node.right = buildTree(nums, mid + 1, right);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }
}
