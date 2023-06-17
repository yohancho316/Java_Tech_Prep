package LeetCode;
import LeetCode.TreeNode;

import java.util.Stack;

public class LC_404_1 {

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left != null && (root.left.left == null && root.left.right == null)) {
            return root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(30);
        TreeNode n4 = new TreeNode(40);
        TreeNode n5 = new TreeNode(50);
        TreeNode n6 = new TreeNode(100);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.right = n5;
        n3.left = n6;

        System.out.println("Left Sum: " + sumOfLeftLeaves(n1));
    }
}
