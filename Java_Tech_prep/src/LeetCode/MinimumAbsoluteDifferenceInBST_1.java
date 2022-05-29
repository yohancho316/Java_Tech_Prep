package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MinimumAbsoluteDifferenceInBST_1 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {

            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }
        }

        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(i - 1)));
        }
        return minDiff;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(236);
        TreeNode a2 = new TreeNode(104);
        TreeNode a3 = new TreeNode(227);
        TreeNode a4 = new TreeNode(701);
        TreeNode a5 = new TreeNode(911);

        a1.left = a2;
        a2.right = a3;
        a1.right = a4;
        a4.right = a5;

        System.out.println(getMinimumDifference(a1));

    }
}
