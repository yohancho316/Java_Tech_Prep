package LeetCode;

public class RangeSumOfBST_2 {

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

    public static int rangeSumBST(TreeNode root, int low, int high) {

        if(root == null) return 0;

        int left_sum = 0;
        int right_sum = 0;

        if(root.val >= low && root.val <= high) left_sum += root.val;
        left_sum += rangeSumBST(root.left, low, high);
        right_sum += rangeSumBST(root.right, low, high);
        return left_sum + right_sum;
    }

    public static void main(String[] args) {

        TreeNode a1 = new TreeNode(10);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(20);
        TreeNode a4 = new TreeNode(15);

        a1.left = a2;
        a1.right = a3;
        a3.left = a4;


        int sum = rangeSumBST(a1,5,15);
        System.out.println(sum);
    }
}
