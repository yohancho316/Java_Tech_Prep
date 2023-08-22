package LeetCode;
import LeetCode.TreeNode;
public class LC_226_4 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        TreeNode temp = left;
        root.left = right;
        root.right = temp;
        return root;
    }

    public static void main(String[] args) {

    }
}
