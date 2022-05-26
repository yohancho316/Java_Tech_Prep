package LeetCode;

import java.util.Stack;

public class ClosestBinarySearchTreeValue_2 {

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

    public static int closestValue(TreeNode root, double target) {

        if(root.val == target) return root.val;
        if(root.left == null && root.right == null) return root.val;

        int minVal = Integer.MAX_VALUE;
        double minDiff = Integer.MAX_VALUE;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {

            TreeNode temp = stack.pop();

            if(minDiff != (Math.min(minDiff, Math.abs(target - temp.val)))) {
                minDiff = Math.abs(target - temp.val);
                minVal = temp.val;
            }

            if(temp.right != null) {
                stack.push(temp.right);
            }

            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
        return minVal;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(4);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(5);
        TreeNode a4 = new TreeNode(1);
        TreeNode a5 = new TreeNode(3);


        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;

        System.out.println(closestValue(a1, 3.714286));
    }
}
