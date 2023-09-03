package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LC_222_1 {

    public static int countLevels(TreeNode root) {
        if(root == null) return 0;
        return countLevels(root.left) + 1;
    }

    public static int countNodes(TreeNode root) {
        if(root == null) return 0;

        int totalLevel = countLevels(root);
        int totalNodes = (int) Math.pow(2, totalLevel) - 1;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> nextQueue = new LinkedList<TreeNode>();

        queue.add(root);

        int currLvl = 0;

        while(!queue.isEmpty() || !nextQueue.isEmpty()) {

            if(queue.isEmpty()) {
                queue = nextQueue;
                nextQueue = new LinkedList<TreeNode>();
            }

            TreeNode temp = queue.poll();
            if(queue.isEmpty()) ++currLvl;
            if(temp.left != null) nextQueue.add(temp.left);
            if(temp.right != null) nextQueue.add(temp.right);

            if(currLvl == totalLevel - 2) break;
        }

        for(TreeNode node : nextQueue) {
            if(node.left == null) --totalNodes;
            if(node.right == null) --totalNodes;
        }

        return totalNodes;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(3);
        TreeNode n6 = new TreeNode(3);
//        TreeNode n7 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
//        n3.right = n7;

        System.out.println("Total Nodes: " + countNodes(n1));

    }
}
