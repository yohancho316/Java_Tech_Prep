package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_270_1 {

    public void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public int closestValue(TreeNode root, double target) {
        double minDiff = Double.MAX_VALUE;
        int minDiffVal = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<Integer>();
        inOrder(root, list);
        for(Integer val : list) {
            if(Math.abs(target - val) < minDiff) {
                minDiff = Math.abs(target - val);
                minDiffVal = (int) val;
            }
        }
        return minDiffVal;
    }

}
