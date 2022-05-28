package LeetCode;

import java.util.Stack;

public class LowestCommonAncestorOfABinarySearchTree_1 {

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

    public static TreeNode recursiveAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Base Conditions
        if((root.val == p.val) && ((root.left != null && root.left.val == q.val) || (root.right != null && root.right.val == q.val))) return root;
        if((root.val == q.val) && ((root.left != null && root.left.val == p.val) || (root.right != null && root.right.val == p.val))) return root;
        if((p.val < root.val) && (q.val > root.val)) return root;
        if((p.val > root.val) && (q.val < root.val)) return root;

        if((p.val < root.val) && (q.val < root.val)) {
            return recursiveAncestor(root.left, p, q);
        }

        if((p.val > root.val) && (q.val > root.val)) {
            return recursiveAncestor(root.right, p, q);
        }
        return null;
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return recursiveAncestor(root, p, q);
    }

    public static void main(String[] args) {

        TreeNode a1 = new TreeNode(10);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(7);
        TreeNode a5 = new TreeNode(15);
        TreeNode a6 = new TreeNode(13);

        a1.left = a2;
        a2.left = a3;
        a2.right = a4;
        a1.right = a5;
        a5.left = a6;

//        TreeNode found = lowestCommonAncestor(a1, a3, a4);
//        System.out.println(found.val);

    }

}
