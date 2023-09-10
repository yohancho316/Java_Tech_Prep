package LeetCode;

public class LC_2331_1 {

    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null) return root.val == 1;
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        if(root.val == 3) return left && right;
        else return left || right;
    }
}
