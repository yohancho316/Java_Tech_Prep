package LeetCode;

public class LC_108_5 {

    public TreeNode buildTree(int left, int right, int[] nums) {
        if(left > right) return null;
        int mid = (right - left) / 2 + left;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(left, mid - 1, nums);
        root.right = buildTree(mid + 1, right, nums);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        TreeNode root = buildTree(0, nums.length - 1, nums);
        return root;
    }
}
