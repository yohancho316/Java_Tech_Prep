package LeetCode;

import java.util.Stack;

public class InvertBinaryTree_1 {

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


    public static TreeNode invertTree(TreeNode root) {

        if(root == null || ((root.left == null && root.right == null))) {
            return root;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        Stack<TreeNode> leftStack = new Stack<TreeNode>();
        Stack<TreeNode> rightStack = new Stack<TreeNode>();

        leftStack.push(left);
        rightStack.push(right);

        while(!leftStack.isEmpty() && !rightStack.isEmpty()) {

            TreeNode temp_left = leftStack.pop();
            TreeNode temp_right = rightStack.pop();

            int temp_val = temp_left.val;
            temp_left.val = temp_right.val;
            temp_right.val = temp_val;


            if(temp_left.right != null && temp_right.left != null) {
                leftStack.push(temp_left.right);
                rightStack.push(temp_right.left);
            }

            if(temp_left.left != null && temp_right.right != null) {
                leftStack.push(temp_left.left);
                rightStack.push(temp_right.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(4);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(7);
        TreeNode a4 = new TreeNode(1);
        TreeNode a5 = new TreeNode(3);
        TreeNode a6 = new TreeNode(6);
        TreeNode a7 = new TreeNode(9);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        TreeNode inverted = invertTree(a1);

        System.out.println(inverted.val);

        System.out.println();

        System.out.println(inverted.left.val + "\t\t" + inverted.right.val);

        System.out.println();

        System.out.println(inverted.left.left.val + "\t\t" + inverted.right.left.val);


    }
}
