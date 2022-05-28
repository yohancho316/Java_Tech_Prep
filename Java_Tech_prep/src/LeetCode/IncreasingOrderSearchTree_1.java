package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class IncreasingOrderSearchTree_1 {

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

    public static TreeNode increasingBST(TreeNode root) {

        if(root.left == null && root.right == null) return root;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        TreeNode head = null;
        boolean flag = true;

        while(!stack.isEmpty() || current != null) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.val);
                if(flag) {
                    head = current;
                    flag = false;
                }
                current = current.right;
            }
        }

        current = head;
        for(int i = 1; i < list.size(); i++) {
            TreeNode temp = new TreeNode(list.get(i));
            current.right = temp;
            current = current.right;
        }
        return head;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(15);
        TreeNode a2 = new TreeNode(10);
        TreeNode a3 = new TreeNode(5);
        TreeNode a4 = new TreeNode(13);
        TreeNode a5 = new TreeNode(20);
        TreeNode a6 = new TreeNode(17);
        TreeNode a7 = new TreeNode(25);

        a1.left = a2;
        a2.left = a3;
        a2.right = a4;
        a1.right = a5;
        a5.left = a6;
        a5.right = a7;

        TreeNode head = increasingBST(a1);
        while(head != null) {
            System.out.println(head.val);
            head = head.right;
        }

    }
}
