package LeetCode;
import LeetCode.TreeNode;
public class LC_671_1 {

    public static int findMin(TreeNode root) {
        if(root == null) return -1;

        int left = findMin(root.left);
        int right = findMin(root.right);

        if(left == -1 && right == -1) return root.val;
        return Math.min(left,right);
    }

    public static int findSecondMinimumValue(TreeNode root) {
        if(root.left == null && root.right == null) return -1;
        int left = findMin(root.left);
        int right = findMin(root.right);
        int max = Math.max(left,right);
        if(max == root.val) return -1;
        return Math.max(left,right);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(7);
        TreeNode n6 = new TreeNode(5);
        TreeNode n7 = new TreeNode(8);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        System.out.println("Second Min: " + findSecondMinimumValue(n1));

    }
}
