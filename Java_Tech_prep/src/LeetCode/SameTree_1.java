package LeetCode;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class SameTree_1 {


    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null && q != null || p != null && q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        TreeNode p1 = new TreeNode(10);
        TreeNode p2 = new TreeNode(5);
        TreeNode p3 = new TreeNode(15);

        TreeNode q1 = new TreeNode(10);
        TreeNode q2 = new TreeNode(5);
        TreeNode q3 = new TreeNode(15);

        p1.left = p2;
        p1.right = p3;

        q1.left = q2;
        q1.right = q3;

        System.out.println(isSameTree(p1, q1));
    }
}
