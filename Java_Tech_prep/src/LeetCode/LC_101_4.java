package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_101_4 {



    public static boolean checkSymmetry(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;
        if(left.val != right.val) return false;
        return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
    }

    public static void normPostTrav(TreeNode root, List<TreeNode> list) {
        if(root == null) {
            list.add(null);
            return;
        }
        normPostTrav(root.left, list);
        normPostTrav(root.right, list);
        list.add(root);
    }

    public static void mirrorPostTrav(TreeNode root, List<TreeNode> list) {
        if(root == null) {
            list.add(null);
            return;
        }
        mirrorPostTrav(root.right, list);
        mirrorPostTrav(root.left, list);
        list.add(root);
    }

    public static boolean isSymmetric(TreeNode root) {

        List<TreeNode> leftList = new ArrayList<TreeNode>();
        List<TreeNode> rightList = new ArrayList<TreeNode>();

        normPostTrav(root.left, leftList);
        mirrorPostTrav(root.right, rightList);

        if(leftList.size() != rightList.size()) return false;

        for(int i = 0; i < leftList.size(); i++) {

            if(leftList.get(i) == null && rightList.get(i) == null) continue;
            if(leftList.get(i) == null || rightList.get(i) == null) return false;
            if(leftList.get(i).val != rightList.get(i).val) return false;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
