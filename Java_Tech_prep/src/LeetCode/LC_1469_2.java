package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC_1469_2 {

    public List<Integer> getLonelyNodes(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        if(root.left == null && root.right == null) return new ArrayList<Integer>();

        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while(!queue.isEmpty()) {

            TreeNode current = queue.poll();

            if(current.left == null && current.right != null) list.add(current.right.val);
            else if(current.left != null && current.right == null) list.add(current.left.val);

            if(current.left != null) queue.offer(current.left);
            if(current.right != null) queue.offer(current.right);
        }
        return list;
    }
}
