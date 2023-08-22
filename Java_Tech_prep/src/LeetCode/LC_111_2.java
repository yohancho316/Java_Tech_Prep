package LeetCode;

public class LC_111_2 {

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) {
            return 1 + minDepth(root.right);
        } else if(root.right == null) {
            return 1 + minDepth(root.left);
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {

    }
}
