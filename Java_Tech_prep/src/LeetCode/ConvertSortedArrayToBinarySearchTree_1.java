package LeetCode;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree_1 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(TreeNode root) {
        if(root == null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static TreeNode CreateBST(int nums[], int l, int r) {

        // Base Case
        if (l > r) return null;

        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = CreateBST(nums, l, mid - 1);
        root.right = CreateBST(nums, mid + 1, r);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return CreateBST(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        System.out.println("Original Array: " + Arrays.toString(nums));
        TreeNode root = sortedArrayToBST(nums);
        System.out.println("PreOrder Traversal of BST:");
        preOrder(root);

    }
}
