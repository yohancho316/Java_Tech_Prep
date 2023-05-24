package LeetCode;

public class LC_100_1 {

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
        if(p == null || q == null) return p == q;
        else if(p.val != q.val) return false;
        return ((isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right)));
    }

    public static void main(String[] args) {

    }
}
