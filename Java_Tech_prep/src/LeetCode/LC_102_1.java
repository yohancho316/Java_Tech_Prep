package LeetCode;

import java.util.*;

public class LC_102_1 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();

        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        int size = 1;
        queue.add(root);

        while(!queue.isEmpty()) {
            if(size == 0) {
                lists.add(list);
                list = new ArrayList<Integer>();
                size = queue.size();
            } else {
                TreeNode head = queue.remove();
                list.add(head.val);
                --size;

                if(head.left != null) {
                    queue.add(head.left);
                }

                if(head.right != null) {
                    queue.add(head.right);
                }
            }
        }
        lists.add(list);
        return lists;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(30);
        TreeNode n4 = new TreeNode(40);
        TreeNode n5 = new TreeNode(50);
        TreeNode n6 = new TreeNode(60);
        TreeNode n7 = new TreeNode(70);

        n1.left = n2;
        n1.right= n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        List<List<Integer>> lists = levelOrder(n1);

        for(int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).toString());
            System.out.println();
        }

    }
}
