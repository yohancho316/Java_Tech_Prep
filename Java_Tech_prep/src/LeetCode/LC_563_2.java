package LeetCode;

public class LC_563_2 {

    public int tiltSum = 0;
    public int totalSum = 0;

    public int calcTilt(TreeNode root) {

        if(root == null) return 0;

        int left = calcTilt(root.left);
        int right = calcTilt(root.right);

        this.tiltSum += Math.abs(left - right);
        this.totalSum += root.val;

        return root.val + left + right;
    }

    public int findTilt(TreeNode root) {
        if(root == null) return 0;

        int leftTreeSum = calcTilt(root.left);
        this.totalSum = 0;
        int rightTreeSum = calcTilt(root.right);

        return this.tiltSum + Math.abs(leftTreeSum - rightTreeSum);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(9);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;



    }
}


