package LeetCode;

public class LC_404_2 {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        else if(root.left != null && (root.left.left == null && root.left.right == null)) return root.left.val + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

}
