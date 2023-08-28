package LeetCode;

import java.util.Stack;

public class LC_938_3 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int sum = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if(temp.val >= low && temp.val <= high) sum += temp.val;
            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
