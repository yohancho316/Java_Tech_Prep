package LeetCode;

public class LC_700_1 {

    public TreeNode searchBST(TreeNode root, int val) {

        if(root == null) return null;
        else if(root.val == val) return root;

        if(root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
