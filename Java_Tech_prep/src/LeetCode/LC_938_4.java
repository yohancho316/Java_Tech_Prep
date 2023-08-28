package LeetCode;

import java.util.Stack;

public class LC_938_4 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int sum = 0;

        while(root != null || !stack.isEmpty()) {
            if(root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if(root.val >= low && root.val <= high) sum += root.val;
                root = root.right;
            }
        }
        return sum;
    }

}
