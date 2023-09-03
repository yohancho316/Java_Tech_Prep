package LeetCode;

import java.util.Stack;

public class LC_938_5 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int sum = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(!stack.isEmpty() || root != null) {
            if(root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode temp = stack.peek().right;
                if(temp != null) {
                    root = temp;
                } else {
                    temp = stack.pop();
                    if(temp.val >= low && temp.val <= high) sum += temp.val;

                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        if(temp.val >= low && temp.val <= high) sum += temp.val;
                    }
                }
            }
        }
        return sum;
    }
}
