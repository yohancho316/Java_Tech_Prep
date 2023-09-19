package LeetCode;

public class LC_606_1 {

    public static void buildPath(TreeNode root, String path) {
        
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);

        n1.left = n2;
        n1.right= n3;
        n2.left = n4;
    }
}
