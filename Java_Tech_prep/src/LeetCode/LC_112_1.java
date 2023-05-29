package LeetCode;

public class LC_112_1 {

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

    public static boolean checkPath(TreeNode root, int currentSum, int targetSum) {
        if(root == null) return currentSum == targetSum;
        currentSum += root.val;
        return checkPath(root.left, currentSum, targetSum) || checkPath(root.right, currentSum, targetSum);
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return checkPath(root, 0, targetSum);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(11);
        TreeNode n5 = new TreeNode(13);
        TreeNode n6 = new TreeNode(14);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(2);
        TreeNode n9 = new TreeNode(1);

        TreeNode n10 = new TreeNode(1);
        TreeNode n11 = new TreeNode(2);

        n10.left = n11;


        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.left = n5;
        n3.right = n6;
        n4.left = n7;
        n4.right = n8;
        n6.right = n9;

        System.out.println("Tree Path: " + hasPathSum(n1, 22));

        System.out.println("2nd Tree Path: " + hasPathSum(n10, 1));

    }
}
