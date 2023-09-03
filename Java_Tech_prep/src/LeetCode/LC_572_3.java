package LeetCode;

public class LC_572_3 {

    public boolean compare(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return root == subRoot;
        else if(root.val != subRoot.val) return false;
        return compare(root.left, subRoot.left) && compare(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;

        if(root.val == subRoot.val) {
            boolean flag = compare(root, subRoot);
            if(flag) return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
