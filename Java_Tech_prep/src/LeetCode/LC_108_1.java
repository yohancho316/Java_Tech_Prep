package LeetCode;
import LeetCode.TreeNode;
public class LC_108_1 {

    public static void preOrderTraversal(TreeNode root) {
        if(root == null) return;
        System.out.print(root.val + "\t");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static TreeNode buildTree(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);

        if(root != null && val < root.val) {
            root.left = buildTree(root.left, val);
        } else if(root != null && val > root.val) {
            root.right = buildTree(root.right, val);
        }

        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 1) return new TreeNode(nums[0]);
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);

        for(int i = mid - 1; i >=0; i--) {
            root.left = buildTree(root.left, nums[i]);
        }

        for(int j = mid + 1; j < nums.length; j++) {
            root.right = buildTree(root.right, nums[j]);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
        preOrderTraversal(root);
    }
}
