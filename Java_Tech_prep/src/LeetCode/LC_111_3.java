package LeetCode;
import LeetCode.TreeNode;
public class LC_111_3 {

    public static int countMinDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) {
            return 1 + countMinDepth(root.right);
        } else if(root.right == null) {
            return 1 + countMinDepth(root.left);
        }
        return Math.min(countMinDepth(root.left), countMinDepth(root.right)) + 1;
    }

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) {
            return 1 + countMinDepth(root.right);
        } else if(root.right == null) {
            return 1 + countMinDepth(root.left);
        }
        return Math.min(countMinDepth(root.left), countMinDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n2.left = n3;
        n3.left = n4;
        n4.left = n5;

        minDepth(n1);
    }
}
