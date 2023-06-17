package LeetCode;
import LeetCode.TreeNode;

import java.util.*;

public class LC_637_1 {

    public static List<Double> averageOfLevels(TreeNode root) {
        if(root == null) return new ArrayList<Double>();
        List<Double> list = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        double average = 0.0;
        int size = 1; int remaining = 1;

        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            average += temp.val;
            --remaining;

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }

            if(remaining == 0) {
                list.add(average / size);
                average = 0.0;
                remaining = queue.size();
                size = queue.size();
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
