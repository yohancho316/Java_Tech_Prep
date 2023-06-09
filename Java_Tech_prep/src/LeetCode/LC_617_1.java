package LeetCode;
import LeetCode.TreeNode;
public class LC_617_1 {

    public static void preOrderTraversal(TreeNode root) {
        if(root == null) return;
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return null;
        else if(root1 == null) return root2;
        else if(root2 == null) return root1;

        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(2);
        TreeNode a4 = new TreeNode(5);

        TreeNode b1 = new TreeNode(2);
        TreeNode b2 = new TreeNode(1);
        TreeNode b3 = new TreeNode(3);
        TreeNode b4 = new TreeNode(4);
        TreeNode b5 = new TreeNode(7);

        a1.left = a2;
        a2.left = a4;
        a1.right = a3;

        b1.left = b2;
        b2.right = b4;
        b1.right = b3;
        b3.right = b5;

        TreeNode root = mergeTrees(a1, b1);
        preOrderTraversal(root);
    }


}
