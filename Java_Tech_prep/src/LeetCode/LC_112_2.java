package LeetCode;

public class LC_112_2 {

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

    public static boolean checkTree(TreeNode root, int currentSum, int targetSum) {
        if(root == null) return false;
        if((root.left == null) && (root.right == null) && ((currentSum + root.val) == targetSum)) return true;
        return (checkTree(root.left, currentSum + root.val, targetSum) || checkTree(root.right, currentSum + root.val, targetSum));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return checkTree(root, 0, targetSum);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);

        n1.right = n2;
        n1.left = n3;


        System.out.println("Valid Tree: " + hasPathSum(n1, 7));
    }
}
