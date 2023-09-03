package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC_637_2 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> next = new LinkedList<TreeNode>();
        queue.offer(root);
        double sum = 0;
        int size = 0;

        while(!queue.isEmpty()) {

            TreeNode curr = queue.poll();

            sum += curr.val;
            ++size;

            if(curr.left != null) next.offer(curr.left);
            if(curr.right != null) next.offer(curr.right);

            if(queue.isEmpty()) {
                list.add(sum / size);
                sum = 0; size = 0;
                while(!next.isEmpty()) {
                    curr = next.poll();
                    sum += curr.val;
                    ++size;
                    queue.offer(curr);
                }
            }
        }

        return list;
    }
}
