package LeetCode;
import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC_144_1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
