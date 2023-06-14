package LeetCode;
import LeetCode.TreeNode;
public class LC_108_2 {

    public static void preOrderTraversal(TreeNode root) {
        if(root == null) return;
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static TreeNode buildTree(int[] nums, int left, int right) {
        if(left > right) {
            return null;
        }
        int mid = ((right - left) / 2) + left;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        TreeNode root = sortedArrayToBST(nums);
        System.out.println(root.val);
        preOrderTraversal(root);
    }
}
