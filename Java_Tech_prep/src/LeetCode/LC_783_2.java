package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_783_2 {

    public static int min = Integer.MAX_VALUE;

    public static void findMin(TreeNode root, List<Integer> list) {
        if(root == null) return;
        findMin(root.left, list);
        list.add(root.val);
        findMin(root.right, list);
    }

    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        findMin(root, list);

        int pos = 1;

        for(;pos < list.size(); ++pos) {
            if(list.get(pos) != list.get(pos - 1)) min = Math.min(min, list.get(pos) - list.get(pos - 1));
        }
        return min;
    }

    public static void main(String[] args) {

    }

}
