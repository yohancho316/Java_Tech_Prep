package LeetCode;

import java.util.Stack;

public class SearchInABinarySearchTree_2 {

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

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root.val == val) return root;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();

            if(temp.val == val) {
                return temp;
            }

            if(temp.right != null) {
                stack.push(temp.right);
            }

            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
