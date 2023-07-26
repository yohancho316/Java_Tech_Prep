package LeetCode;
import LeetCode.TreeNode;
public class LC_958_2 {

    public static boolean isCompleteTree(TreeNode root) {
        if(root == null) return false;
        else if(root.left == null && root.right == null) return true;
        else if(root.left != null && root.right == null) return true;
        else if(root.left == null && root.right != null) return false;

        return isCompleteTree(root.left) && isCompleteTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(5);
        TreeNode a5 = new TreeNode(7);
        TreeNode a6 = new TreeNode(8);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a3.left = a5;
        a3.right = a6;


        System.out.println("Valid Balanced Tree: " + isCompleteTree(a1));

    }
}
