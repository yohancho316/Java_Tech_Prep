package LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeInorderTraversal_2 {

    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int _data) {
            this.data = _data;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        // Local Declarations
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {

            if(current != null) {
                stack.add(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.data);
                current = current.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(7);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(10);
        TreeNode n8 = new TreeNode(2);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.right = n8;
        n3.right = n7;
        n3.left = n6;

        List<Integer> list = inorderTraversal(n1);
        for(Integer val : list) {
            System.out.println(val);
        }
    }
}
