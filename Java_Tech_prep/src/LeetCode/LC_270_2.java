package LeetCode;

public class LC_270_2 {
    public int closestValue(TreeNode root, double target) {
        if(Math.abs(root.val - target) == 0.0) return root.val;
        TreeNode node = root.val < target ? root.right : root.left;
        if(node == null) return root.val;
        int compare = closestValue(node, target);
        if(Math.abs(target - root.val) < Math.abs(target - compare)) return root.val;
        return compare;
    }
}
