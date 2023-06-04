package LeetCode;
import LeetCode.TreeNode;
public class LC_111_1 {

    static int minHeight = Integer.MAX_VALUE;

    public static int findMinHeight(TreeNode root, int currentHeight) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            if(currentHeight + 1 < minHeight) {
                minHeight = currentHeight + 1;
            }
        }
        int leftHeight = findMinHeight(root.left, currentHeight + 1);
        int rightHeight = findMinHeight(root.right, currentHeight + 1);
        return Math.min(leftHeight, rightHeight) + 1;
    }

    public static int minDepth(TreeNode root) {
         if(root == null) return 0;
         findMinHeight(root, 0);
         return minHeight;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(30);
        TreeNode n4 = new TreeNode(40);
        TreeNode n5 = new TreeNode(50);


        n1.right = n2;
        n2.right = n3;
        n3.right = n4;
        n4.right = n5;

        minDepth(n1);
        System.out.println("min depth: " + minHeight);

    }
}
