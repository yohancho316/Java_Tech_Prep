package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class LC_530_1 {

    public int getMinimumDifference(TreeNode root) {
        if(root == null) return 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(root != null || !stack.isEmpty()) {
            if(root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }

        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i < list.size(); i++) {
            minDiff = Math.min((list.get(i) - list.get(i - 1)), minDiff);
        }

        return minDiff;
    }
}
