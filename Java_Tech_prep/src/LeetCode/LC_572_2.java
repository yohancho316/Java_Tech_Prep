package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LC_572_2 {

    public boolean exists = false;

    public boolean equalityCheck(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return root == subRoot;
        else if(root.val != subRoot.val) return false;
        boolean left = equalityCheck(root.left, subRoot.left);
        boolean right = equalityCheck(root.right, subRoot.right);
        return left && right;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) return root == subRoot;
        else if (root.val == subRoot.val && equalityCheck(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue2 = queue1;
        queue1 = new LinkedList<Integer>();
        System.out.println("Queue 2 Size: " + queue2.size());

    }
}
