package LeetCode;

import java.util.Stack;

public class MaximumDepthOfBinaryTree_4 {

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

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int maxDepth = Integer.MIN_VALUE;
        int currDepth = 0;
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(!stack.isEmpty() || current != null) {
            if(current != null) {
                stack.add(current);
                currDepth += 1;
                maxDepth = Integer.max(currDepth, maxDepth);
                current = current.left;
            } else {
                current = stack.pop();
                current = current.right;
                if(stack.isEmpty()) {
                    currDepth = 1;
                }
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(50);
        TreeNode n2 = new TreeNode(10);
        TreeNode n3 = new TreeNode(100);

        n1.left = n2;
        n1.right = n3;

        System.out.println(maxDepth(n1));
    }
}
