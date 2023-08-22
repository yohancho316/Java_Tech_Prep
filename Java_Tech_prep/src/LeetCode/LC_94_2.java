package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LC_94_2 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
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

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        List<Integer> list = inorderTraversal(n1);

        for(Integer num : list) {
            System.out.println(num);
        }
    }
}
