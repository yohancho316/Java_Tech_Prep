package LeetCode;

import java.util.Stack;

public class SearchInABinarySearchTree_1 {

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

            TreeNode current = stack.pop();
            if(current.val == val) return current;

            if(current.right != null) stack.push(current.right);

            if(current.left != null) stack.push(current.left);
        }

        return null;
    }

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(50);
        TreeNode n2 = new TreeNode(30);
        TreeNode n3 = new TreeNode(10);
        TreeNode n4 = new TreeNode(70);
        TreeNode n5 = new TreeNode(100);

        n1.left = n2;
        n2.left = n3;
        n1.right = n4;
        n4.right = n5;

        TreeNode temp = searchBST(n1, 10);
        System.out.println(temp.val);

    }
}
