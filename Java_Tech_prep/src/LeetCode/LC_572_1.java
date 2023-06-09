package LeetCode;
import LeetCode.TreeNode;
public class LC_572_1 {


    public static boolean checkEquality(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;
        else if(left.val != right.val) return false;
        return checkEquality(left.left, right.left) && checkEquality(left.right, right.right);
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        else if(root.val == subRoot.val) {
            if(checkEquality(root, subRoot)) return true;
        }
        boolean leftTree = isSubtree(root.left, subRoot);
        boolean rightTree = isSubtree(root.right, subRoot);
        return leftTree || rightTree;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(6);
        TreeNode a7 = new TreeNode(7);

        TreeNode b1 = new TreeNode(3);
        TreeNode b2 = new TreeNode(6);
        TreeNode b3 = new TreeNode(7);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        b1.left = b2;
        b1.right = b3;

        System.out.println("Equal Trees: " + isSubtree(a1, b1));

    }
}
