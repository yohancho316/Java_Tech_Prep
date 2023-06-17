package LeetCode;
import LeetCode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LC_958_1 {

    public static int findMaxHeight(TreeNode root) {
        if(root == null) return 0;
        int left = findMaxHeight(root.left);
        int right = findMaxHeight(root.right);
        return Math.max(left,right) + 1;
    }

    public static boolean isCompleteTree(TreeNode root) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return true;
        int maxHeight = findMaxHeight(root);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> secondLast = new LinkedList<TreeNode>();
        queue.add(root);
        int currentLevel = 1;
        int lastCount = 0;
        int remaining = 1;

        while(!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            --remaining;
            if(temp == null && currentLevel > maxHeight) break;
            if(temp == null && currentLevel < maxHeight) return false;
            if(temp != null && currentLevel == (maxHeight - 1)) secondLast.add(temp);
            if(temp != null && currentLevel == maxHeight) ++lastCount;

            if(temp != null && currentLevel <= maxHeight) queue.add(temp.left);
            if(temp != null && currentLevel <= maxHeight)  queue.add(temp.right);

            if(remaining == 0) {
                remaining = queue.size();
                ++currentLevel;
            }
        }

//        System.out.println("Current Level: " + currentLevel);
//        System.out.println("Nodes in the Last Level: " + lastCount);
//        System.out.println("Number of nodes in the Second to Last Level: " + secondLast.size());

        while(!secondLast.isEmpty()) {
            TreeNode temp = secondLast.remove();
            if(temp.left != null) {
                --lastCount;
            } else break;

            if(temp.right != null) {
                --lastCount;
            } else break;
        }

//        System.out.println("Remaining Nodes after Check: " + lastCount);
//        System.out.println("Second Last Queue Size: " + secondLast.size());
        return lastCount == 0;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);


        n1.left = n2;
        n1.right= n3;

        n2.left = n4;
        n2.right= n5;

        n3.left = n6;
        n3.right= n7;

        n7.right = n8;

        System.out.println("Balanced: " + isCompleteTree(n1));

    }
}
