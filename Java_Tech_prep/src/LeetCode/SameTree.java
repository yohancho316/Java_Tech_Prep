package LeetCode;

import java.util.Stack;

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        Stack<TreeNode> stackP = new Stack<TreeNode>();
        Stack<TreeNode> stackQ = new Stack<TreeNode>();

        stackP.add(p);
        stackQ.add(q);

        while(!stackP.isEmpty() && !stackQ.isEmpty()) {
            TreeNode tempP = stackP.pop();
            TreeNode tempQ = stackQ.pop();

            if(tempP.val != tempQ.val)  return false;
            if(tempP.right != null && tempQ.right == null) return false;
            else if(tempP.right == null && tempQ.right != null) return false;

            if(tempP.left != null && tempQ.left == null) return false;
            else if(tempP.left == null && tempQ.left != null) return false;

            if(tempP.right != null) stackP.add(tempP.right);
            if(tempQ.right != null) stackQ.add(tempQ.right);

            if(tempP.left != null) stackP.add(tempP.left);
            if(tempQ.left != null) stackQ.add(tempQ.left);
        }
        return stackP.isEmpty() && stackQ.isEmpty();
    }

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

    public static void main(String[] args) {
        TreeNode pHead = new TreeNode(50);
        TreeNode pLeft = new TreeNode(10);
        TreeNode pRight = new TreeNode(100);
        TreeNode pLeft2 = new TreeNode(5);

        pHead.left = pLeft;
        pLeft.left = pLeft2;
        pHead.right = pRight;

        TreeNode qHead = new TreeNode(50);
        TreeNode qLeft = new TreeNode(10);
        TreeNode qRight = new TreeNode(100);

        qHead.left = qLeft;
        qHead.right = qRight;

        System.out.println(isSameTree(pHead, qHead));
    }
}
