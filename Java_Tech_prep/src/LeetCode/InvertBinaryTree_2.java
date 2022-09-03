package LeetCode;

public class InvertBinaryTree_2 {

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

    public static void preOrder(TreeNode root) {
        if(root == null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }


    public static TreeNode invertTree(TreeNode root) {
        // Base Case
        if(root == null) return null;

        TreeNode left = null;
        TreeNode right = null;

        left = invertTree(root.left);
        right = invertTree(root.right);

        TreeNode temp = left;
        root.left = right;
        root.right = temp;

        return root;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(20);
        TreeNode a2 = new TreeNode(10);
        TreeNode a3 = new TreeNode(30);
        TreeNode a4 = new TreeNode(5);
        TreeNode a5 = new TreeNode(15);
        TreeNode a6 = new TreeNode(25);
        TreeNode a7 = new TreeNode(35);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        TreeNode root = invertTree(a1);
        preOrder(root);

    }
}
