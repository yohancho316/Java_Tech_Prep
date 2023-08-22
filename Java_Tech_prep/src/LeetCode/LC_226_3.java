package LeetCode;
import LeetCode.TreeNode;
public class LC_226_3 {

    public static void flipTree(TreeNode left, TreeNode right) {
        if(left == null && right == null) return;
        if(left == null) {
            left = right;
            right = null;
            return;
        } else if(right == null) {
            right = left;
            left = null;
            return;
        }

        TreeNode temp = left;
        left = right;
        right = temp;

        flipTree(left.left, right.right);
        flipTree(left.right, right.left);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root.left == null && root.right == null) return root;
        flipTree(root.left, root.right);
        return root;
    }

    public static void main(String[] args) {

    }
}
