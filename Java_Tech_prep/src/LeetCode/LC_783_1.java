package LeetCode;

import java.util.ArrayList;
import java.util.List;
import LeetCode.TreeNode;

public class LC_783_1 {

    public static List<Integer> list = new ArrayList<Integer>();

    public static void inOrderTraversal(TreeNode root) {
        if(root == null) return;
        inOrderTraversal(root.left);
        list.add(root.val);
        inOrderTraversal(root.right);
    }

    public static int minDiffInBST(TreeNode root) {
        if(root == null) return 0;
        inOrderTraversal(root);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(i - 1)));
        }
        return minDiff;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(0);
        TreeNode a3 = new TreeNode(48);
        TreeNode a4 = new TreeNode(12);
        TreeNode a5 = new TreeNode(49);

        a1.left = a2;
        a1.right = a3;
        a3.left = a4;
        a3.right = a5;

        minDiffInBST(a1);
    }
}
