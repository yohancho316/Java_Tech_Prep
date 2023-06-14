package LeetCode;
import LeetCode.TreeNode;
public class LC_563_1 {

    public static int tiltSum = 0;

    public static int calcTilt(TreeNode root) {
        if(root == null) return 0;
        int left = calcTilt(root.left);
        int right = calcTilt(root.right);
        int diff = Math.abs(left - right);
        tiltSum += diff;
        return root.val + left + right;
    }

    public static int findTilt(TreeNode root) {
        if(root == null) return 0;
        calcTilt(root);
        return tiltSum;
    }

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(9);
        TreeNode n6 = new TreeNode(7);


        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n1.right = n5;
        n5.right = n6;

        System.out.println("Tilt Sum: " + findTilt(n1));


    }
}
