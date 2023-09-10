package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC_993_3 {

    public static boolean isCousins(TreeNode root, int x, int y) {


        int currLvl = 0;
        int size = 1;

        boolean siblings = false;
        boolean cousins = false;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            siblings = false;
            cousins = false;

            while (size >= 0) {

                TreeNode node = queue.poll();

                if (node == null) {
                    siblings = false;
                } else {
                    if (node.val == x || node.val == y) {
                        siblings = true;
                        cousins = true;

                        if (!cousins) {
                            siblings = cousins = true;
                        } else {
                            return !siblings;
                        }
                    }

                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                    queue.offer(null);
                    --size;
                }
            }

        if (cousins) return false;

        if (size == 0) {
            ++currLvl;
            size = queue.size();
        }
    }

        return false;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;



    }
}
