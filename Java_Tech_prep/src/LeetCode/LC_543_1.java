package LeetCode;
import LeetCode.TreeNode;
public class LC_543_1 {

    public static int maxDiameter = 0;

    public static int countEdges(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = countEdges(root.left);
        int rightHeight = countEdges(root.right);
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        maxDiameter = 0;
        countEdges(root);
        return maxDiameter;
    }

    public static void main(String[] args) {

        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);

        a1.left = a2;

//        TreeNode n1 = new TreeNode(4);
//        TreeNode n2 = new TreeNode(-7);
//        TreeNode n3 = new TreeNode(-3);
//        TreeNode n4 = new TreeNode(-9);
//        TreeNode n5 = new TreeNode(-3);
//        TreeNode n6 = new TreeNode(9);
//        TreeNode n7 = new TreeNode(-7);
//        TreeNode n8 = new TreeNode(-4);
//        TreeNode n9 = new TreeNode(6);
//        TreeNode n10 = new TreeNode(-6);
//        TreeNode n11 = new TreeNode(-6);
//        TreeNode n12 = new TreeNode(0);
//        TreeNode n13 = new TreeNode(6);
//        TreeNode n14 = new TreeNode(5);
//        TreeNode n15 = new TreeNode(9);
//        TreeNode n16 = new TreeNode(-1);
//        TreeNode n17 = new TreeNode(-4);
//        TreeNode n18 = new TreeNode(-2);
//
//        n1.left = n2;
//        n1.right = n3;
//        n2.left = null;
//        n2.right = null;
//        n3.left = null;
//        n3.right = n4;
//        n4.left = n5;
//        n4.right = n6;
//        n5.left = n7;
//        n5.right = n8;
//        n6.left = n9;
//        n6.right = null;
//        n7.left = null;
//        n7.right = n10;
//        n8.left = n11;
//        n8.right = null;
//        n9.left = null;
//        n9.right = n12;
//        n10.left = null;
//        n10.right = null;
//        n11.left = n13;
//        n11.right = n14;
//        n12.left = n15;
//        n12.right = null;
//        n13.left = null;
//        n13.right = null;
//        n14.left = n16;
//        n14.right = n17;
//        n15.left = null;
//        n15.right = n18;
//        n16.left = null;
//        n16.right = null;
//        n17.left = null;
//        n17.right = null;
//        n18.left = null;
//        n18.right = null;

        System.out.println("Longest Final Diameter: " + diameterOfBinaryTree(a1));

    }
}
