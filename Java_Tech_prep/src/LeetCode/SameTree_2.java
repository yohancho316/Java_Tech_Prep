package LeetCode;

import java.util.Stack;

public class SameTree_2 {

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

            System.out.println("pTemp Val: " + pTemp.val);
            System.out.println("qTemp Val: " + qTemp.val);


            if(pTemp.val != qTemp.val) return false;

            if((pTemp.right != null && qTemp.right == null) || (pTemp.right == null && qTemp.right != null)) return false;
            if((pTemp.left != null && qTemp.left == null) || (pTemp.left == null && qTemp.left != null)) return false;

            if(pTemp.right != null && qTemp.right != null) {
                pStack.push(pTemp.right);
                qStack.push(qTemp.right);
            }

            if(pTemp.left != null && qTemp.left != null) {
                pStack.push(pTemp.left);
                qStack.push(qTemp.left);
            }
        }
        return (pStack.isEmpty() == qStack.isEmpty());
    }

    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(4);


        p1.left = null;
        p1.right = p2;


        TreeNode q1 = new TreeNode(2);
        TreeNode q2 = new TreeNode(3);
        TreeNode q3 = new TreeNode(4);

        q1.left = q2;
        q1.right = q3;


        System.out.println(isSameTree(p1,q1));
    }
}
