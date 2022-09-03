package LeetCode;

public class DiameterOfABinaryTree_1 {

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

    public int diameter;

    public int findDiameter(TreeNode root) {
        // Base Case
        if(root == null) return 0;

        int left = findDiameter(root.left);
        int right = findDiameter(root.right);

        this.diameter = Math.max(diameter, left + right);

        return Math.max(left,right) + 1;
    }


    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        this. diameter = 0;
        findDiameter(root);
        return this.diameter;
    }

    public static void main(String[] args) {

    }
}
