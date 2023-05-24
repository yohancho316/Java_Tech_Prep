package LeetCode;

public class LC_101_1 {

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

    public static boolean check(TreeNode left, TreeNode right) {
        if((left == null) && (right == null)) return true;
        else if(left == null || right == null) return false;
        else if(left.val != right.val) return false;

        boolean leftEquality = check(left.left, right.right);
        boolean rightEquality = check(left.right, right.left);

        if(leftEquality && rightEquality) return true;
        else return false;
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        boolean symmetricTree = check(root.left, root.right);
        return symmetricTree;
    }

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(3);
        TreeNode n7 = new TreeNode(4);
        TreeNode n8 = new TreeNode(100);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n7;
        n3.right = n6;
        n6.left = n8;


        System.out.println("Tree is Symmetric: " + isSymmetric(n1));
    }
}
