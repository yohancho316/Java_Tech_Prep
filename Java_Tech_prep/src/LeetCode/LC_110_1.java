package LeetCode;

public class LC_110_1 {

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

    public static int checkBalance(TreeNode root) {
        if (root == null) return 0;
        int left = checkBalance(root.left);
        int right = checkBalance(root.right);
        return Math.max(left, right) + 1;
    }

    private static int height(TreeNode root) {
        // An empty tree has height -1
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static boolean isBalanced(TreeNode root) {
        // An empty tree satisfies the definition of a balanced tree
        if (root == null) {
            return true;
        }


        // Check if subtrees have height within 1. If they do, check if the
        // subtrees are balanced
        return Math.abs(height(root.left) - height(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }


    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.left = n2;


        System.out.println(isBalanced(n1));
    }
}
