package LeetCode;

import java.util.Stack;

public class LC_226_5 {

    public TreeNode swapChildren(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        TreeNode temp;

        while(curr != null || !stack.isEmpty()) {
            if(curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                temp = stack.peek().right;
                if(temp != null) {
                    curr = temp;
                } else {
                    temp = stack.pop();
                    swapChildren(temp);
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        swapChildren(temp);
                    }
                }
            }
        }
        return root;
    }
}
