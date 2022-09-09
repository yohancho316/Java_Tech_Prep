package LeetCode;

public class ConstructStringFromBinaryTree_1 {

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

    public static String preOrder(TreeNode root) {

        if(root == null) return "";

        String left = "(";
        String right = ")";

        left += "" + root.val;

        left += preOrder(root.left);
        right += preOrder(root.right);

        return left + right;
    }


    public static String tree2str(TreeNode root) {


        if (root == null)
            return "";
        if(root.left == null && root.right == null){
            return root.val+"";
        }
        if(root.right == null){
            return root.val + "(" + tree2str(root.left)+ ")";
        }
        return root.val + "(" + tree2str(root.left)+ ")(" +tree2str(root.right)+")";
    }


    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;

        String str = tree2str(a1);
        System.out.println(str);
    }
}
