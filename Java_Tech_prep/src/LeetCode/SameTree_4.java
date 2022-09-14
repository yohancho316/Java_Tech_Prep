package LeetCode;

public class SameTree_4 {

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

    public static boolean sameTree(TreeNode p, TreeNode q) {
        // Base Case
        if(p == null || q == null) return p == q;

        if(p.val != q.val) return false;

        return sameTree(p.left, q.left) && sameTree(p.right, q.right);
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null || q == null) return p == q;

        return sameTree(p,q);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(100);
        TreeNode a2 = new TreeNode(50);
        TreeNode a3 = new TreeNode(10);
        TreeNode a4 = new TreeNode(70);
        TreeNode a5 = new TreeNode(150);
        TreeNode a6 = new TreeNode(130);
        TreeNode a7 = new TreeNode(170);

        TreeNode b1 = new TreeNode(100);
        TreeNode b2 = new TreeNode(50);
        TreeNode b3 = new TreeNode(10);
        TreeNode b4 = new TreeNode(70);
        TreeNode b5 = new TreeNode(150);
        TreeNode b6 = new TreeNode(130);
        TreeNode b7 = new TreeNode(170);

        a1.left = a2;
        a2.left = a3;
        a2.right = a4;
        a1.right = a5;
        a5.left = a6;
        a5.right = a7;

        b1.left = b2;
        b2.left = b3;
        b2.right = b4;
        b1.right = b5;
        b5.left = b6;
        b5.right = b7;

        System.out.println("Same Tree: " + isSameTree(a1,b1));



    }
}
