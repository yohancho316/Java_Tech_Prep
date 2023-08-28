package LeetCode;

public class LC_617_2 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2;
        else if(root2 == null) return root1;
        TreeNode Node = new TreeNode(root1.val + root2.val);
        Node.left = mergeTrees(root1.left, root2.left);
        Node.right = mergeTrees(root1.right, root2.right);
        return Node;
    }

    public static void main(String[] args) {

    }
}
