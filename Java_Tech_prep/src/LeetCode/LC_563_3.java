package LeetCode;

public class LC_563_3 {

    public int tiltSum;

    public int calcTiltSum(TreeNode root) {
        if(root == null) return 0;
        int left = calcTiltSum(root.left);
        int right = calcTiltSum(root.right);
        this.tiltSum += Math.abs(right - left);
        return root.val + left + right;
    }

    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        this.tiltSum = 0;
        calcTiltSum(root);
        return this.tiltSum;
    }

    public static int calcSum(TreeNode root) {
        if(root == null) return 0;
        int left = calcSum(root.left);
        int right = calcSum(root.right);
        return root.val + left + right;
    }

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        System.out.println("Total Sum = " + calcSum(n2));


    }
}
