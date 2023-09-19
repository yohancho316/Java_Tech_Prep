package LeetCode;

public class LC_897_1 {

    public TreeNode parent = null;
    public TreeNode head = null;

    public void inOrder(TreeNode root) {

        if(root == null) return;
        inOrder(root.left);

        if(head == null) {
            head = new TreeNode(root.val);
            parent = head;
        } else {
            parent.right = new TreeNode(root.val);
            parent = parent.right;
        }

        inOrder(root.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        inOrder(root);
        return this.head;
    }
}
