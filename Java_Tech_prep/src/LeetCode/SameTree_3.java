package LeetCode;

import java.util.Stack;

public class SameTree_3 {

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        Stack<TreeNode> pStack = new Stack<TreeNode>();
        Stack<TreeNode> qStack = new Stack<TreeNode>();

        pStack.push(p);
        qStack.push(q);

        while(!pStack.isEmpty() && !qStack.isEmpty()) {

            TreeNode pTemp = pStack.pop();
            TreeNode qTemp = qStack.pop();

            if(pTemp.val != qTemp.val) return false;

            if((pTemp.right != null && qTemp.right == null) || (pTemp.right == null && qTemp.right != null)) {
                return false;
            } else if(pTemp.right != null && qTemp != null) {
                pStack.push(pTemp.right);
                qStack.push(qTemp.right);
            }

            if((pTemp.left != null && qTemp.left == null) || (pTemp.left == null && qTemp.left != null)) {
                return false;
            } else if(pTemp.left != null && qTemp.left != null) {
                pStack.push(pTemp.left);
                qStack.push(qTemp.left);
            }
        }

        if(pStack.isEmpty() == qStack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(50);
        TreeNode a2 = new TreeNode(30);
        TreeNode a3 = new TreeNode(70);
        TreeNode a4 = new TreeNode(100);

        TreeNode b1 = new TreeNode(50);
        TreeNode b2 = new TreeNode(30);
        TreeNode b3 = new TreeNode(70);

        a1.left = a2;
        a1.right = a3;
        a3.right = a4;

        b1.left = b2;
        b1.right = b3;

        System.out.println(isSameTree(a1, b1));
    }
}
