package LeetCode;

public class LC_104_1 {

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

    public static int countDepth(TreeNode root, int depth) {
        if(root == null) return depth;
        int left = countDepth(root.left, depth);
        int right = countDepth(root.right, depth);
        return Math.max(left,right) + 1;
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = countDepth(root.left, 0);
        int right = countDepth(root.right, 0);
        System.out.println("Max Depth: " + (Math.max(left, right) + 1));
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);


        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;


        maxDepth(n1);
    }
}
