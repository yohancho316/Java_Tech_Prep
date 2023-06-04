package LeetCode;
import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC_94_1 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
