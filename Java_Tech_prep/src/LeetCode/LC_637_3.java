package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC_637_3 {

    public List<Double> averageOfLevels(TreeNode root) {

        if(root == null) return new ArrayList<Double>();

        List<Double> list = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        int x = 1; int y = 0; double sum = 0; int size = 0;

        while(!queue.isEmpty()) {

            TreeNode node = queue.poll();

            sum += node.val;
            ++size;
            --x;

            if(y != 0) --y;

            if(node.left != null) {
                queue.add(node.left);
                ++y;
            }

            if(node.right != null) {
                queue.add(node.right);
                ++y;
            }

            if(x == 0) {
                list.add((double)sum / size);
                x = y ;
                sum = 0;
                size = 0;
            }

        }

        return list;
    }
}
