package LeetCode;
import LeetCode.TreeNode;
public class LC_108_3 {

    public static TreeNode buildTree(int left, int right, int[] nums) {
        if(left > right) return null;
        int mid = (Math.abs(left - right) / 2) + left;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(left, mid - 1, nums);
        root.right = buildTree(mid + 1, right, nums);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 1) return new TreeNode(nums[0]);
        int left = 0; int right = nums.length - 1;
        return buildTree(left, right, nums);
    }

    public static void main(String[] args) {

    }
}
