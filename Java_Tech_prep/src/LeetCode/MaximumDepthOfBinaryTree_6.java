package LeetCode;

import java.util.Stack;

public class MaximumDepthOfBinaryTree_6 {

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
        if(root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> height = new Stack<Integer>();
        int max = 0;

        stack.push(root);
        height.push(1);

        while(!stack.isEmpty()) {
            TreeNode tempNode = stack.pop();
            int tempHeight = height.pop();
            max = Math.max(max, tempHeight);

            if(tempNode.right != null) {
                stack.push(tempNode.right);
                height.push(tempHeight + 1);
            }

            if(tempNode.left != null) {
                stack.push(tempNode.left);
                height.push(tempHeight + 1);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(20);
        TreeNode a2 = new TreeNode(10);
        TreeNode a3 = new TreeNode(5);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(15);
        TreeNode a6 = new TreeNode(30);

        a1.left = a2;
        a2.left = a3;
        a3.left = a4;
        a2.right = a5;
        a1.right = a6;

        System.out.println(maxDepth(a1));
    }
}
